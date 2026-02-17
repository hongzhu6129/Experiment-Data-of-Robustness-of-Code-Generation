import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        // Sort the array before performing binary search
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid potential overflow

            if (arr[mid] == target) {
                return mid;  // Element found at index mid
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 9, 2, 15, 6}; // Example array
        int target = 9; // Element to search for

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }


        // Example with a target that is NOT present
        target = 100; 
        index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

    }
}
