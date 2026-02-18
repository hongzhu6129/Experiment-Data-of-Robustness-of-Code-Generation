class Solution {
    /**
     * Sorts an array of positive integers using the Cocktail Sort algorithm.
     *
     * @param arr The array to be sorted.
     */
    void cocktailSort(int[] arr) {
        int n = arr.length;
        boolean swapped = true;
        int start = 0;
        int end = n - 1;

        while (swapped) {
            // Forward pass (like bubble sort)
            swapped = false;
            for (int i = start; i < end; ++i) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            // If nothing moved, then array is sorted.
            if (!swapped)
                break;

            // Decrease the end index as the largest element is now at the end
            swapped = false;
            end--;

            // Backward pass
            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            // Increase the start index as the smallest element is now at the start
            start++;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {5, 1, 4, 2, 8, 0, 2};
        solution.cocktailSort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}; // Reverse sorted
        solution.cocktailSort(arr2);
        System.out.print("Sorted array: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr3 = {1, 2, 3, 4, 5}; // Already sorted
        solution.cocktailSort(arr3);
        System.out.print("Sorted array: ");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

