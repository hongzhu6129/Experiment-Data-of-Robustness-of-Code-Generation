class Solution {
    /**
     * Finds a specified element in a given sorted array using exponential search.
     *
     * @param arr The sorted array to search in.
     * @param target The element to search for.
     * @return The index of the target element if found, otherwise -1.
     */
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};
        int target = 17;

        int index = exponentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }


        target = 18; // test for element not present
        index = exponentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    private static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;

        // If the target is the first element, return its index.
        if (arr[0] == target) {
            return 0;
        }

        // Find the range where the target might be present.
        int i = 1;
        while (i < n && arr[i] <= target) {
            i *= 2;
        }


        // Perform binary search within the identified range.
        return binarySearch(arr, target, i / 2, Math.min(i, n - 1));
    }


    private static int binarySearch(int[] arr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
