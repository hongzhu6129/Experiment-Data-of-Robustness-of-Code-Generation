public class CompareArrays {

    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 6, 7, 8, 5};

        int[] array3 = {1, 2, 3, 4, 5};
        int[] array4 = {6, 7, 8, 9, 10};

        int[] array5 = {}; // Empty array
        int[] array6 = {1, 2, 3};

        int[] array7 = {1};
        int[] array8 = {1};

        int[] array9 = {1};
        int[] array10 = {2};

        // Test cases and output
        System.out.println("Array 1 and Array 2: " + compareFirstLast(array1, array2)); // True
        System.out.println("Array 3 and Array 4: " + compareFirstLast(array3, array4)); // False
        System.out.println("Array 5 and Array 6: " + compareFirstLast(array5, array6)); // False
        System.out.println("Array 7 and Array 8: " + compareFirstLast(array7, array8)); // True
        System.out.println("Array 9 and Array 10: " + compareFirstLast(array9, array10)); // False

        //Test cases with null arrays
        System.out.println("Array 1 and null: " + compareFirstLast(array1, null)); // False
        System.out.println("null and Array 2: " + compareFirstLast(null, array2)); // False
        System.out.println("null and null: " + compareFirstLast(null, null)); // False




    }

    private static boolean compareFirstLast(int[] arr1, int[] arr2) {
        // Handle null or empty arrays
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
            return false;
        }

        // Compare the first and last elements
        return arr1[0] == arr2[0] && arr1[arr1.length - 1] == arr2[arr2.length - 1];
    }
}
