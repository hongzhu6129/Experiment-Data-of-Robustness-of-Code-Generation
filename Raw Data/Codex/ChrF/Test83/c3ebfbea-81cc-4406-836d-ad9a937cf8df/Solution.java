class Solution {
    /**
     * Given two integer arrays, check if the first and last element of two arrays are the same.
     * The array length must be greater than or equal to 2.
     *
     * @param arr1 The first array.
     * @param arr2 The second array.
     * @return True if the first and last element of two arrays are the same, false otherwise.
     */
    public boolean checkFirstAndLastElement(int[] arr1, int[] arr2) {
        if (arr1.length < 2 || arr2.length < 2) {
            return false;
        }

        return arr1[0] == arr2[0] && arr1[arr1.length - 1] == arr2[arr2.length - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] array1 = {50, -20, 0, 30, 40, 60, 12};
        int[] array2 = {45, 20, 10, 20, 30, 50, 11};

        boolean result = solution.checkFirstAndLastElement(array1, array2);
        System.out.println(result); // Output: false


        int[] array3 = {50, -20, 0, 30, 40, 60, 12};
        int[] array4 = {50, 20, 10, 20, 30, 50, 12};
        result = solution.checkFirstAndLastElement(array3, array4);
        System.out.println(result); // Output: true

        int[] array5 = {1};
        int[] array6 = {1};
        result = solution.checkFirstAndLastElement(array5, array6);
        System.out.println(result); // Output: false


    }
}
