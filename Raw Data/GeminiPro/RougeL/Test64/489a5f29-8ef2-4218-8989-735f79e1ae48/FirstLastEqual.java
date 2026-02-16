import java.util.Arrays;

public class FirstLastEqual {

    public static boolean isFirstLastEqual(int[] arr) {
        if (arr == null || arr.length < 2) {
            return false; // Or throw an exception indicating invalid input
        }
        return arr[0] == arr[arr.length - 1];
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {50, -20, 0, 30, 40, 60, 10};
        System.out.println(Arrays.toString(arr1) + " : " + isFirstLastEqual(arr1)); // Output: false

        int[] arr2 = {10, 20, 30, 40, 10};
        System.out.println(Arrays.toString(arr2) + " : " + isFirstLastEqual(arr2)); // Output: true


        // Corner cases
        int[] arr3 = {50, 50}; // Array with two elements, both same
        System.out.println(Arrays.toString(arr3) + " : " + isFirstLastEqual(arr3)); // Output: true

        int[] arr4 = {50}; // Array with one element
        System.out.println(Arrays.toString(arr4) + " : " + isFirstLastEqual(arr4)); // Output: false

        int[] arr5 = null;  // Null array
        System.out.println(Arrays.toString(arr5) + " : " + isFirstLastEqual(arr5)); // Output: false

        int[] arr6 = {}; // Empty Array
        System.out.println(Arrays.toString(arr6) + " : " + isFirstLastEqual(arr6)); // Output: false


        int[] arr7 = {5, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr7) + " : " + isFirstLastEqual(arr7)); //Output: true

        int [] arr8 = {-1, -2, -3, -1};
        System.out.println(Arrays.toString(arr8) + " : " + isFirstLastEqual(arr8)); // Output: true


    }
}
