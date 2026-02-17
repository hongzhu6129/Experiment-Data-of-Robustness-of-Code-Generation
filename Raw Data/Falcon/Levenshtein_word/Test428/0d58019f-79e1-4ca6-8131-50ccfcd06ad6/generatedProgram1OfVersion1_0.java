public class ExponentialSearch {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71};
        int x = 17;
        int result = exponentialSearch(arr, x);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
         x = 18; // Test for element not present
        result = exponentialSearch(arr, x);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    private static int exponentialSearch(int[] arr, int x) {
        int n = arr.length;

        if (arr[0] == x) {
            return 0;
        }

        // Find the range for binary search by repeated doubling
        int i = 1;
        while (i < n && arr[i] <= x) {
            i = i * 2;
        }

        // Call binary search for the found range
        return binarySearch(arr, i / 2, Math.min(i, n - 1), x);
    }

    private static int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }
}
