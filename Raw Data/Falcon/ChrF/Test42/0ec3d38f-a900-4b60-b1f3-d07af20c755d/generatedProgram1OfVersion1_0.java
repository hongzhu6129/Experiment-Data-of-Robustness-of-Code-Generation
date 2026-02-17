import java.util.Arrays;

public class BinarySearch {

    /**
     * Performs a binary search on a sorted array to find a target element.
     *
     * @param arr    The sorted array of integers.
     * @param target The element to search for.
     * @return The index of the target element if found, otherwise -1.
     */
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid potential integer overflow

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 7, 8, 11, 12};
        int target1 = 13;
        int result1 = binarySearch(arr1, target1);
        System.out.println("Result 1 (Target: " + target1 + "): " + (result1 != -1 ? "Found at index " + result1 : "Not found"));


        int[] arr2 = {2, 5, 7, 8, 11, 12};
        int target2 = 11;
        int result2 = binarySearch(arr2, target2);
        System.out.println("Result 2 (Target: " + target2 + "): " + (result2 != -1 ? "Found at index " + result2 : "Not found"));


        // Test with an unsorted array (binary search won't work correctly)
        int[] arr3 = {12, 2, 8, 5, 11, 7};
        int target3 = 11;

        // Sort the array for demonstration
         Arrays.sort(arr3); //  This line is just for demonstrating the correct usage of binary search (which requires a sorted array).


        int result3 = binarySearch(arr3, target3);
        System.out.println("Result 3 (Target: " + target3 + ", Sorted array now): " + (result3 != -1 ? "Found at index " + result3 : "Not found"));


        
         // Example with an empty array:
        int[] arr4 = {};
        int target4 = 5;
        int result4 = binarySearch(arr4, target4);
        System.out.println("Result 4 (Empty array): " + (result4 != -1 ? "Found at index " + result4 : "Not found"));
    }
}
