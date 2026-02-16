class Solution {

    /**
     * Sorts the given array using Counting Sort.
     *
     * @param arr The array to be sorted.
     * @param min The minimum value in the array.
     * @param max The maximum value in the array.
     */
    void countingSort(int[] arr, int min, int max) {
        if (arr == null || arr.length <= 1) {
            return; // Nothing to sort
        }

        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Count occurrences of each element
        for (int num : arr) {
            count[num - min]++;
        }

        // Calculate cumulative counts
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in their sorted positions
        for (int i = arr.length - 1; i >= 0; i--) {  // Iterate backwards for stability
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy the sorted elements back to the original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = {4, 2, 2, 8, 3, 3, 1};
        solution.countingSort(arr1, 1, 8);
        printArray(arr1); // Output: 1 2 2 3 3 4 8

        int[] arr2 = {9, 5, 0, 3, 6, 1, 2, 8, 7, 4};
        solution.countingSort(arr2, 0, 9);
        printArray(arr2); // Output: 0 1 2 3 4 5 6 7 8 9


        int[] arr3 = {}; // Empty array
        solution.countingSort(arr3, 0, 5); // Handles empty array correctly
        printArray(arr3); // Output: (nothing)


        int[] arr4 = {5}; // Single element array
        solution.countingSort(arr4, 5, 5); // Handles single element array correctly
        printArray(arr4); // Output: 5


        int[] arr5 = {5, 5, 5}; // Array with duplicates
        solution.countingSort(arr5, 5, 5); // Handles duplicate values
        printArray(arr5); // Output: 5 5 5


    }


    // Helper function to print the array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
