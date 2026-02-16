import java.util.Arrays;

public class ExponentialSearch {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};
        int target = 17;
        int index = exponentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }


        target = 18; // Test for an element not present
        index = exponentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    private static int exponentialSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        if (arr[0] == target) {
            return 0;
        }

        int i = 1;
        while (i < arr.length && arr[i] <= target) {
            i *= 2;
        }

        // Perform binary search within the range [i/2, min(i, arr.length - 1)]
        return Arrays.binarySearch(arr, i / 2, Math.min(i, arr.length), target);
    }
}
