class Solution {
    /**
     * Performs an exponential search on a sorted array to find a specified element.
     *
     * @param arr The sorted array to search within.
     * @param target The element to search for.
     * @return The index of the target element if found, otherwise -1.
     */
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int target = 13;
        int result = exponentialSearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element found at index: " + result);
        }


        target = 12; // Test with an element not present
        result = exponentialSearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }


    private static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;

        // If the element is at the first position
        if (arr[0] == target) {
            return 0;
        }

        // Find the range for binary search by repeated doubling
        int i = 1;
        while (i < n && arr[i] <= target) {
            i = i * 2;
        }

        // Call binary search for the found range
        return binarySearch(arr, i / 2, Math.min(i, n - 1), target);
    }

    private static int binarySearch(int[] arr, int left, int right, int target) {
        while (right >= left) {
            int mid = left + (right - left) / 2; // Prevent potential overflow

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }
}
