class Solution {
    /**
     * Gets the first occurrence (position starts from 0) of an element in the given array.
     *
     * @param arr The input array.
     * @param element The element to search for.
     * @return The index of the first occurrence of the element, or -1 if the element is not found.
     */
    public int getFirstOccurrence(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element1 = 5;
        int index1 = solution.getFirstOccurrence(arr1, element1);
        System.out.println("First occurrence of " + element1 + ": " + index1); // Output: 4


        int[] arr2 = {1, 2, 3, 4, 5, 5, 7, 8, 9, 10};
        int element2 = 5;
        int index2 = solution.getFirstOccurrence(arr2, element2);
        System.out.println("First occurrence of " + element2 + ": " + index2); // Output: 4

        int[] arr3 = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int element3 = 5;
        int index3 = solution.getFirstOccurrence(arr3, element3);
        System.out.println("First occurrence of " + element3 + ": " + index3); // Output: -1


        int[] emptyArr = {};
        int emptyElement = 5;
        int emptyIndex = solution.getFirstOccurrence(emptyArr, emptyElement);
        System.out.println("First occurrence of " + emptyElement + ": " + emptyIndex); // Output: -1
    }
}
