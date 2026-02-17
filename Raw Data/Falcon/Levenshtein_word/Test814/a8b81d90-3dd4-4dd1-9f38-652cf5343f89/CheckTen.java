import java.util.Arrays;

public class CheckTen {

    public static void main(String[] args) {
        int[] arr1 = {10, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 10};
        int[] arr3 = {10, 2, 3, 4, 10};
        int[] arr4 = {1, 2, 3, 4, 5};


        System.out.println("Array: " + Arrays.toString(arr1) + ", Result: " + checkTen(arr1)); // Output: true
        System.out.println("Array: " + Arrays.toString(arr2) + ", Result: " + checkTen(arr2)); // Output: true
        System.out.println("Array: " + Arrays.toString(arr3) + ", Result: " + checkTen(arr3)); // Output: true
        System.out.println("Array: " + Arrays.toString(arr4) + ", Result: " + checkTen(arr4)); // Output: false

    }


    public static boolean checkTen(int[] arr) {
        if (arr == null || arr.length == 0) {  // Handle null or empty arrays
            return false;
        }
        return arr[0] == 10 || arr[arr.length - 1] == 10;
    }
}
