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


        target = 22; // Test with an element not present
        index = exponentialSearch(arr, target);

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

        // If the target is the first element
        if (arr[0] == target) {
            return 0;
        }

        int i = 1;  // Exponential growth of the bound

        // Find the range where the target might be present
        while (i < arr.length && arr[i] <= target) {
            i *= 2;
        }

        // Apply binary search within the found range (or from i/2 to end of array)
        int start = i / 2;
        int end = Math.min(i, arr.length - 1);  // Adjust end to stay within array bounds


        return Arrays.binarySearch(arr, start, end + 1, target);


    }
}
