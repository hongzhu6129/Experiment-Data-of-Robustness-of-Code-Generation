class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 7, 8, 9, 5};

        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {6, 7, 8, 9, 10};

        int[] arr5 = {};  // Empty array case
        int[] arr6 = {};

        int[] arr7 = {1}; // Single element array case
        int[] arr8 = {1};

        int[] arr9 = {1};
        int[] arr10 = {2};

        System.out.println(compareFirstLast(arr1, arr2)); // Output: true
        System.out.println(compareFirstLast(arr3, arr4)); // Output: false
        System.out.println(compareFirstLast(arr5, arr6)); // Output: false
        System.out.println(compareFirstLast(arr7, arr8)); // Output: true
        System.out.println(compareFirstLast(arr9, arr10)); // Output: false


    }


    public static boolean compareFirstLast(int[] arr1, int[] arr2) {
        if (arr1.length == 0 || arr2.length == 0) {
            return false; // Return false if either array is empty
        }

        return arr1[0] == arr2[0] && arr1[arr1.length - 1] == arr2[arr2.length - 1];
    }
}
