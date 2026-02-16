class ExponentialSearch {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        int result = exponentialSearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);


        int[] arr2 = {2, 3, 4, 10, 40};
        int x2 = 15;  // Element not present
        int result2 = exponentialSearch(arr2, x2);
        if (result2 == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result2);

        int[] emptyArr = {}; //Empty array test case
        int target = 5;
        int result3 = exponentialSearch(emptyArr, target);
        if (result3 == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result3);


    }

    private static int exponentialSearch(int[] arr, int x) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int n = arr.length;

        if (arr[0] == x)
            return 0;

        int i = 1;
        while (i < n && arr[i] <= x)
            i = i * 2;

        // Perform Binary Search between i/2 and min(i, n-1)
        return binarySearch(arr, i / 2, Math.min(i, n - 1), x);

    }

    private static int binarySearch(int[] arr, int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, low, mid - 1, x);

            return binarySearch(arr, mid + 1, high, x);
        }

        return -1;
    }
}
