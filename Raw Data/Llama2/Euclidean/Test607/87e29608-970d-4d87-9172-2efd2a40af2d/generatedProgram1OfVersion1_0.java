class Solution {
    /**
     * Determines whether the least 10 elements in a given array of integers exceed 20.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] arr1 = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        System.out.println(checkLeast10Exceed20(arr1)); // Output: true

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(checkLeast10Exceed20(arr2)); // Output: false

        int[] arr3 = {21, 22, 23, 24, 25, 26, 27, 28, 29}; // Less than 10 elements
        System.out.println(checkLeast10Exceed20(arr3)); // Output: false


        int[] arr4 = {21, 22, 23, 24, 25, 26, 27, 28, 29, 15, 45}; // More than 10 elements, one < 20 in first 10
        System.out.println(checkLeast10Exceed20(arr4)); // Output: false



        int[] arr5 = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 15}; // More than 10 elements, all of first 10 > 20
        System.out.println(checkLeast10Exceed20(arr5)); // Output: true
    }

    /**
     * Helper function to determine if the least 10 elements exceed 20.
     *
     * @param arr The input array of integers.
     * @return `true` if the least 10 elements exceed 20, `false` otherwise.
     */
    private static boolean checkLeast10Exceed20(int[] arr) {
        if (arr.length < 10) {
            return false;
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] <= 20) {
                return false;
            }
        }

        return true;
    }
}
