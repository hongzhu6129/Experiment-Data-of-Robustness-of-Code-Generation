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


        target = 22; // Test for an element not present
        index = exponentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    private static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;

        if (arr[0] == target) {
            return 0;
        }

        int i = 1;
        while (i < n && arr[i] <= target) {
            i *= 2;
        }

        return Arrays.binarySearch(arr, Math.min(i, n - 1) / 2 , Math.min(i, n), target);


    }
}
