public class CheckTen {

    public static void main(String[] args) {
        int[] array1 = {10, -20, 0, 30, 40, 60, 10};
        System.out.println(checkTen(array1)); // Output: true

        int[] array2 = {1, -20, 0, 30, 40, 60, 100};
        System.out.println(checkTen(array2)); // Output: false

        int[] array3 = {10, -20, 0, 30, 40, 60, 1};
        System.out.println(checkTen(array3)); // Output: true

        int[] array4 = {1}; // Invalid array length
        System.out.println(checkTen(array4)); // Output: false

         int[] array5 = {1, 2}; // Length 2, neither element is 10
        System.out.println(checkTen(array5)); // Output: false

    }

    public static boolean checkTen(int[] arr) {
        if (arr == null || arr.length < 2) {
            return false;
        }
        return arr[0] == 10 || arr[arr.length - 1] == 10;
    }
}
