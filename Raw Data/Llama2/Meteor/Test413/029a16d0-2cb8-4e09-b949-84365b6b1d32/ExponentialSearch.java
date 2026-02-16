import java.util.Arrays;

public class ExponentialSearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 14;
        int index = exponentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }


        arr = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        target = 22; // Element not present
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

        // Check if the target is the first element
        if (arr[0] == target) {
            return 0;
        }

        // Find the range for binary search by repeated doubling
        int i = 1;
        while (i < arr.length && arr[i] <= target) {
            i = i * 2;
        }

        // Perform binary search in the found range
        return Arrays.binarySearch(arr, Math.min(i / 2, arr.length -1), Math.min(i, arr.length), target);
    }
}
