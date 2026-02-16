import java.util.Arrays;

public class ExponentialSearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;
        int index = exponentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }


        target = 22; // Test for element not present
        index = exponentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        int[] emptyArr = {}; // Test for empty array
        target = 5;
        index = exponentialSearch(emptyArr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    private static int exponentialSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1; 
        }

        int n = arr.length;

        if (arr[0] == target) {
            return 0;
        }

        int i = 1;
        while (i < n && arr[i] <= target) {
            i *= 2;
        }

        // Perform Binary Search in the found range
        return Arrays.binarySearch(arr, Math.min(i, n) / 2, Math.min(i, n), target);

    }
}
