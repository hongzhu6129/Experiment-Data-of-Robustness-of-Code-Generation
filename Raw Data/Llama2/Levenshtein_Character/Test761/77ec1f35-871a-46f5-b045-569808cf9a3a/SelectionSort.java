import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {64, 25, 12, 22, 11};
        sort(arr1);
        System.out.println("Sorted array: " + Arrays.toString(arr1));

        int[] arr2 = {5, 1, 4, 2, 8};
        sort(arr2);
        System.out.println("Sorted array: " + Arrays.toString(arr2));


         int[] arr3 = {}; // Empty array
        sort(arr3);
        System.out.println("Sorted array: " + Arrays.toString(arr3));


        int[] arr4 = {7};  // Single element array
        sort(arr4);
        System.out.println("Sorted array: " + Arrays.toString(arr4));


        // Example with duplicates
        int[] arr5 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        sort(arr5);
        System.out.println("Sorted array: " + Arrays.toString(arr5));

        // Already sorted array
        int[] arr6 = {1, 2, 3, 4, 5};
        sort(arr6);
        System.out.println("Sorted array: " + Arrays.toString(arr6));


        // Reverse sorted array
        int[] arr7 = {5, 4, 3, 2, 1};
        sort(arr7);
        System.out.println("Sorted array: " + Arrays.toString(arr7));

    }
}
