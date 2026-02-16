class ExponentialSearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;
        int result = exponentialSearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element found at index: " + result);
        }

        target = 22; // Element not present
        result = exponentialSearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element found at index: " + result);
        }


         int[] emptyArr = {};
        target = 5;
        result = exponentialSearch(emptyArr, target);

        if (result == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }

    private static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;
        if (n == 0) {
            return -1;
        }

        // Find range for binary search by repeated doubling
        int i = 1;
        while (i < n && arr[i] <= target) {
            i = i * 2;
        }

        //  Perform binary search in found range
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

        return -1;  // Element not found
    }
}
