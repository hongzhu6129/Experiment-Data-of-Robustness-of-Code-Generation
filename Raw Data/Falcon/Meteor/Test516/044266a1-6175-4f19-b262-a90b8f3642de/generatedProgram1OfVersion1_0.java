class Solution {
    /**
     * Finds a specified element in a given array using linear search.
     *
     * @param arr The array to search in.
     * @param target The element to search for.
     * @return The index of the target element if found, -1 otherwise.
     */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int target1 = 3;
        int result1 = Linear_Search(arr1, target1);
        System.out.println("Index of " + target1 + " in arr1: " + result1); // Output: 2


        int[] arr2 = {10, 20, 30, 40, 50};
        int target2 = 60;
        int result2 = Linear_Search(arr2, target2);
        System.out.println("Index of " + target2 + " in arr2: " + result2); // Output: -1


        int[] arr3 = {};
        int target3 = 5;
        int result3 = Linear_Search(arr3, target3);
        System.out.println("Index of " + target3 + " in arr3: " + result3); // Output: -1

        int[] arr4 = {5};
        int target4 = 5;
        int result4 = Linear_Search(arr4, target4);
        System.out.println("Index of " + target4 + " in arr4: " + result4); // Output: 0
        
        int[] arr5 = null;
        int target5 = 5;
        int result5 = Linear_Search(arr5, target5);
        System.out.println("Index of " + target5 + " in arr5: " + result5); // Output: -1
    }

    private static int Linear_Search(int[] arr, int target) {
        if (arr == null) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
