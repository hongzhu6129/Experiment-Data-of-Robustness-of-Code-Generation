public class ArrayComparison {

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 4, 1};
        int[] arr2 = {1, 5, 6, 7, 1};
        testArrays(arr1, arr2); // Expected: true

        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {6, 7, 8, 9, 6};
        testArrays(arr3, arr4); // Expected: false


        int[] arr5 = {1, 2, 3, 4, 5};
        int[] arr6 = {}; // Empty array
        testArrays(arr5, arr6); // Expected: false

        int[] arr7 = {}; // Empty array
        int[] arr8 = {1, 2, 3, 4, 1};
        testArrays(arr7, arr8); // Expected: false


        int[] arr9 = {};
        int[] arr10 = {}; // Both empty
        testArrays(arr9, arr10); // Expected: false (as per problem description)


        int[] arr11 = null; // Null array
        int[] arr12 = {1, 2, 3};
        testArrays(arr11, arr12); // Expected: false

        int[] arr13 = {1, 2, 3};
        int[] arr14 = null; // Null array
        testArrays(arr13, arr14); // Expected: false

         int[] arr15 = null; // Null array
        int[] arr16 = null; // Null array
        testArrays(arr15, arr16); // Expected: false
    }

    public static void testArrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
            System.out.println(false);
            return;
        }

        if (arr1[0] == arr2[0] && arr1[arr1.length - 1] == arr2[arr2.length - 1]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
