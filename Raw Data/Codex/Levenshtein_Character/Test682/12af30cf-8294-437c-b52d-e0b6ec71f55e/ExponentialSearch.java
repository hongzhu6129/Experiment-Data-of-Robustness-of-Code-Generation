import java.util.Arrays;

public class ExponentialSearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int x = 14;
        int result = exponentialSearch(arr, x);
        if (result < 0) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }

        x = 22;
        result = exponentialSearch(arr, x);
        if (result < 0) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }

    private static int exponentialSearch(int[] arr, int x) {
        int n = arr.length;

        if (arr[0] == x) {
            return 0;
        }

        int i = 1;
        while (i < n && arr[i] <= x) {
            i = i * 2;
        }

        // Perform Binary Search between indices i/2 and min(i, n-1)
        return Arrays.binarySearch(arr, i / 2, Math.min(i, n), x);

    }
}
