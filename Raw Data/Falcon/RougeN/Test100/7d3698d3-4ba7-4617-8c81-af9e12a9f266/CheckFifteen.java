public class CheckFifteen {

    public static void main(String[] args) {
        // Example usage:
        int num1 = 10;
        int num2 = 5;
        boolean result = calculate(num1, num2);
        System.out.println(result); // Output: true

        num1 = 15;
        num2 = 20;
        result = calculate(num1, num2);
        System.out.println(result); // Output: true

        num1 = 12;
        num2 = 3;
        result = calculate(num1, num2);
        System.out.println(result); // Output: true


        num1 = 10;
        num2 = 7;
        result = calculate(num1, num2);
        System.out.println(result); // Output: false
    }

    public static boolean calculate(int num1, int num2) {
        if (num1 == 15 || num2 == 15) {
            return true;
        }
        if (num1 + num2 == 15 || Math.abs(num1 - num2) == 15) {  // Use Math.abs for difference
            return true;
        }
        return false;
    }
}
