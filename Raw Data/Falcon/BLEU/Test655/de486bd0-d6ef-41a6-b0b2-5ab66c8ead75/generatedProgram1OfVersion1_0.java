class ExponentialSearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int x = 12;
        int result = exponentialSearch(arr, x);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        x = 22; // Test for an element not present
        result = exponentialSearch(arr, x);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        int[] emptyArr = {}; // Test empty array
        result = exponentialSearch(emptyArr, 5); 
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }


    private static int exponentialSearch(int[] arr, int x) {
        int n = arr.length;

        if (n == 0) {
            return -1; // Handle empty array
        }

        if (arr[0] == x) {
            return 0; // Handle case where element is at the beginning
        }

        int i = 1;
        while (i < n && arr[i] <= x) {
            i = i * 2;
        }

        // Perform binary search in the range from i/2 to min(i, n-1)
        return binarySearch(arr, i / 2, Math.min(i, n - 1), x);
    }

    private static int binarySearch(int[] arr, int left, int right, int x) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Element not found within the range
    }
}
