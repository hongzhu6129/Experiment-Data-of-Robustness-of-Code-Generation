public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 3, 4, 5, 1};
        int num1 = 1;
        boolean result1 = checkNumber(arr1, num1);
        System.out.println("Array 1 contains " + num1 + " next to each other or separated by one element: " + result1); // Output: true

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        int num2 = 4;
        boolean result2 = checkNumber(arr2, num2);
        System.out.println("Array 2 contains " + num2 + " next to each other or separated by one element: " + result2); // Output: false

        int[] arr3 = {1, 2, 1, 4, 1, 6, 1};
        int num3 = 1;
        boolean result3 = checkNumber(arr3, num3);
        System.out.println("Array 3 contains " + num3 + " next to each other or separated by one element: " + result3); // Output: true


        int[] arr4 = {1, 2, 3, 1, 5, 6, 1};
        int num4 = 1;
        boolean result4 = checkNumber(arr4, num4);
        System.out.println("Array 4 contains " + num4 + " next to each other or separated by one element: " + result4); // Output: false
    }

    public static boolean checkNumber(int[] arr, int num) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == num && arr[i + 1] == num) {
                return true;
            }
            if (i < arr.length - 2 && arr[i] == num && arr[i + 2] == num) {
                return true;
            }
        }
        return false;
    }
}
