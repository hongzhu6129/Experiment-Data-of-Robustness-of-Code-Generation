class Solution {
    /**
     * Gnome Sort (also known as Stupid Sort)
     * Sorts an array of integers in-place using the Gnome Sort algorithm.
     *
     * @param arr The array to be sorted.
     */
    void gnomeSort(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (index == 0 || arr[index] >= arr[index - 1]) {
                index++;
            } else {
                // Swap elements if out of order
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--; 
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = {5, 2, 4, 6, 1, 3};
        solution.gnomeSort(arr1);
        System.out.print("Sorted array 1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();


        int[] arr2 = {7, 1, 8, 2, 0, 3, 4, 6, 5, 9};
        solution.gnomeSort(arr2);
        System.out.print("Sorted array 2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();


        // Test with an empty array
        int[] arr3 = {};
        solution.gnomeSort(arr3);
        System.out.print("Sorted array 3: ");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Test with an already sorted array.
        int[] arr4 = {1, 2, 3, 4, 5};
        solution.gnomeSort(arr4);
        System.out.print("Sorted array 4: ");
        for (int num : arr4) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

