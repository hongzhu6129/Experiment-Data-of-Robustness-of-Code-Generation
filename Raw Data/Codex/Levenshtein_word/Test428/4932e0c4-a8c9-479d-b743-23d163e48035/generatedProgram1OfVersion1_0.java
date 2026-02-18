class Solution {
    /**
     * Java program to find a specified element in a given sorted array of 
     * elements using exponential search.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int result = exponentialSearch(arr, x);
        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }


        int[] arr2 = {2, 3, 4, 10, 40};
        int x2 = 15; // Element not present
        int result2 = exponentialSearch(arr2, x2);
        if (result2 == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result2);
        }
    }


    /**
     * Exponential search algorithm.
     *
     * @param arr The sorted array to search in.
     * @param x The element to search for.
     * @return The index of the element if found, -1 otherwise.
     */
    private static int exponentialSearch(int[] arr, int x) {
        int n = arr.length;
        if (arr[0] == x) {
            return 0;
        }

        int i = 1;
        while (i < n && arr[i] <= x) {
            i = i * 2;
        }

        return binarySearch(arr, i / 2, Math.min(i, n - 1), x);
    }

    /**
     * Helper function for binary search.
     */
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
