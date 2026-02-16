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
        int x2 = 15; // Element not present
        int result2 = exponentialSearch(arr2, x2);
        if (result2 == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result2);

        int[] emptyArr = {}; //Empty array case
        int x3 = 5;
        int result3 = exponentialSearch(emptyArr, x3);
        if (result3 == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result3);

        int[] singleElementArr = {5};
        int x4 = 5;
        int result4 = exponentialSearch(singleElementArr, x4);
        if (result4 == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result4);



    }

    private static int exponentialSearch(int[] arr, int x) {
        int n = arr.length;

        if (n == 0) {
            return -1;
        }

        // If x is present at first location itself
        if (arr[0] == x)
            return 0;


        // Find range for binary search by
        // repeated doubling
        int i = 1;
        while (i < n && arr[i] <= x)
            i = i * 2;

        // Call binary search for the found range.
        return binarySearch(arr, i / 2, Math.min(i, n - 1), x);


    }

    private static int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;


            if (arr[mid] == x)
                return mid;


            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);


            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;


    }
}
