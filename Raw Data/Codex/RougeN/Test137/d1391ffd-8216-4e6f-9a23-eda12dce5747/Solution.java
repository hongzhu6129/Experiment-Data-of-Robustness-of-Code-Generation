class Solution {
    /**
     * Sorts an array of integers using the Gnome Sort algorithm.
     *
     * @param arr The array to be sorted.
     */
    void gnomeSort(int[] arr) {
        int index = 0;
        int n = arr.length;

        while (index < n) {
            if (index == 0 || arr[index] >= arr[index - 1]) {
                index++;
            } else {
                // Swap elements
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


        int[] arr2 = {1, 2, 3, 4, 5, 6}; // Already sorted
        solution.gnomeSort(arr2);
        System.out.print("Sorted array 2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();


        int[] arr3 = {6, 5, 4, 3, 2, 1}; // Reverse sorted
        solution.gnomeSort(arr3);
        System.out.print("Sorted array 3: ");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
        System.out.println();

         int[] arr4 = {}; // Empty Array
        solution.gnomeSort(arr4);
        System.out.print("Sorted array 4: ");
        for (int num : arr4) {
            System.out.print(num + " ");
        }
        System.out.println();


    }
}
