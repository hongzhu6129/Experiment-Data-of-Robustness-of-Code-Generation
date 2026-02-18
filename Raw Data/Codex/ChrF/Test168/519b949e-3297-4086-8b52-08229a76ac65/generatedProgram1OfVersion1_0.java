import java.util.Arrays;

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
    }

    private static int exponentialSearch(int[] arr, int x) {
        int n = arr.length;

        // If x is present at first location itself
        if (arr[0] == x)
            return 0;

        // Find range for binary search by
        // repeated doubling
        int i = 1;
        while (i < n && arr[i] <= x)
            i = i * 2;

        //  Perform Binary Search in subarray from i/2 to min(i, n-1)
        return Arrays.binarySearch(arr, i / 2, Math.min(i, n), x);

    }
}
