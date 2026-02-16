public class CheckTen {

    public static void main(String[] args) {
        // Test data 1
        int[] array1 = {10, -20, 0, 30, 40, 60, 10};
        System.out.println(checkTen(array1)); // Output: true

        // Test data 2
        int[] array2 = {1, -20, 0, 30, 40, 60, 10};
        System.out.println(checkTen(array2)); // Output: true

        // Test data 3
        int[] array3 = {1, -20, 0, 30, 40, 60, 1};
        System.out.println(checkTen(array3)); // Output: false

        // Test data 4:  Array with less than 2 elements - should return false
        int[] array4 = {10};
        System.out.println(checkTen(array4)); // Output: false


        // Test data 5: Empty array - should return false
        int[] array5 = {};
        System.out.println(checkTen(array5)); // Output: false
    }


    public static boolean checkTen(int[] arr) {
        if (arr == null || arr.length < 2) {
            return false;
        }

        return arr[0] == 10 || arr[arr.length - 1] == 10;
    }
}
