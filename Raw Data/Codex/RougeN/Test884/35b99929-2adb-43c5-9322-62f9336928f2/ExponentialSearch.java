public class ExponentialSearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 11, 15, 21, 28, 34, 42, 50};
        int x = 21;
        int result = exponentialSearch(arr, x);

        if (result == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element found at index " + result);
        }


        x = 20; // Element not present
        result = exponentialSearch(arr, x);

        if (result == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    private static int exponentialSearch(int[] arr, int x) {
        int n = arr.length;

        if (arr[0] == x) {
            return 0;
        }

        // Find range for binary search by repeated doubling
        int i = 1;
        while (i < n && arr[i] <= x) {
            i = i * 2;
        }

        // Call binary search for the found range.
        return binarySearch(arr, i / 2, Math.min(i, n - 1), x);
    }

    private static int binarySearch(int[] arr, int left, int right, int x) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Element not found
    }
}
