import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {2, 5, 8, 12};
        int[] arr2 = {1, 3, 7, 9, 10};

        int[] mergedArray = merge(arr1, arr2);

        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));


        // Another example with empty arrays:
        int[] arr3 = {};
        int[] arr4 = {1, 2, 3};
        int[] mergedArray2 = merge(arr3, arr4);
        System.out.println("Merged and sorted array (with empty array): " + Arrays.toString(mergedArray2));

        // And another example with duplicates:
        int[] arr5 = {1, 3, 3, 5};
        int[] arr6 = {2, 3, 4, 6};
        int[] mergedArray3 = merge(arr5, arr6);
        System.out.println("Merged and sorted array (with duplicates): " + Arrays.toString(mergedArray3));

    }


    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge while both arrays have elements
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
}
