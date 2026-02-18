public class CheckTenFactorial {

    public static void main(String[] args) {
        int[] array1 = {10, -20, 0, 30, 40, 60, 10};
        boolean result1 = checkTenFactorial(array1);
        System.out.println(result1); // Output: false (because we're checking for factorial, not the number 10)

        int[] array2 = {3628800, -20, 0, 30, 40, 60, 10}; // 10! = 3628800
        boolean result2 = checkTenFactorial(array2);
        System.out.println(result2);  // Output: true

        int[] array3 = {10, -20, 0, 30, 40, 60, 3628800}; // 10! at the end
        boolean result3 = checkTenFactorial(array3);
        System.out.println(result3); // Output: true



        // Test cases for invalid array length
        int[] shortArray = {10};
        boolean shortResult = checkTenFactorial(shortArray);
        System.out.println(shortResult); // Output: false


    }

    public static boolean checkTenFactorial(int[] arr) {
        if (arr == null || arr.length < 2) {
            return false; 
        }

        int tenFactorial = calculateTenFactorial();

        return arr[0] == tenFactorial || arr[arr.length - 1] == tenFactorial;
    }


    public static int calculateTenFactorial() {
        int factorial = 1;
        for (int i = 1; i <= 10; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
