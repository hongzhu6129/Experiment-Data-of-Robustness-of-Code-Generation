import java.util.Arrays;

public class SwapVariables {

    public static void swap(int[] arr, int index1, int index2) {
        if (arr == null || index1 < 0 || index2 < 0 || index1 >= arr.length || index2 >= arr.length) {
            throw new IllegalArgumentException("Invalid input: array is null or index is out of bounds.");
        }

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    public static void main(String[] args) {

        // Test case 1: Regular swap
        int[] arr1 = {1, 2};
        swap(arr1, 0, 1);
        System.out.println("Test case 1: " + Arrays.toString(arr1)); // Expected: [2, 1]

        // Test case 2: Swap with same index
        int[] arr2 = {3, 4};
        swap(arr2, 1, 1);
        System.out.println("Test case 2: " + Arrays.toString(arr2)); // Expected: [3, 4]

        // Test case 3: Swap with negative numbers
        int[] arr3 = {-5, 10};
        swap(arr3, 0, 1);
        System.out.println("Test case 3: " + Arrays.toString(arr3)); // Expected: [10, -5]

        // Test case 4: Swap with zero
        int[] arr4 = {0, 7};
        swap(arr4, 0, 1);
        System.out.println("Test case 4: " + Arrays.toString(arr4)); // Expected: [7, 0]

        // Test case 5: Larger array
        int[] arr5 = {1, 2, 3, 4, 5};
        swap(arr5, 1, 3);
        System.out.println("Test case 5: " + Arrays.toString(arr5)); // Expected: [1, 4, 3, 2, 5]


        // Corner Cases:

        // Test case 6: Null array (expecting exception)
        try {
            swap(null, 0, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Test case 6: " + e.getMessage()); // Expecting exception message
        }

        // Test case 7: Index out of bounds (expecting exception)
        try {
            int[] arr7 = {1, 2};
            swap(arr7, 0, 2);  // Index 2 is out of bounds
        } catch (IllegalArgumentException e) {
            System.out.println("Test case 7: " + e.getMessage()); // Expecting exception message
        }

        // Test case 8: Negative index (expecting exception)
        try {
            int[] arr8 = {1, 2};
            swap(arr8, -1, 1); // Index -1 is out of bounds
        } catch (IllegalArgumentException e) {
            System.out.println("Test case 8: " + e.getMessage()); // Expecting exception message
        }

     }
}
