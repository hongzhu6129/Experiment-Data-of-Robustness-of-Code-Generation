import java.util.Arrays;

public class ExponentialSearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 12;
        int index = exponentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }


        target = 22; // Test for element not present
        index = exponentialSearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        //test empty array
        int [] emptyArray = {};
        target = 5;
        index = exponentialSearch(emptyArray, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    private static int exponentialSearch(int[] arr, int target) {
        if(arr == null || arr.length == 0){
            return -1;
        }


        int n = arr.length;

        if (arr[0] == target) {
            return 0;
        }

        int i = 1;
        while (i < n && arr[i] <= target) {
            i *= 2;
        }

        // Perform Binary Search between indices i/2 and min(i, n-1)
        return Arrays.binarySearch(arr, i / 2, Math.min(i, n), target);
    }
}
