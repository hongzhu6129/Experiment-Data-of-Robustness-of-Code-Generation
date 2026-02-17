public class CompareArrays {

    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 6, 7, 8, 5};
        int[] array3 = {1, 2, 3, 4, 6};
        int[] array4 = {}; // Empty array
        int[] array5 = {1}; // Single element array
        int[] array6 = {7};


        // Test cases
        System.out.println("Array 1 and Array 2: " + compareFirstLast(array1, array2)); // Should be true
        System.out.println("Array 1 and Array 3: " + compareFirstLast(array1, array3)); // Should be false
        System.out.println("Array 1 and Array 4: " + compareFirstLast(array1, array4)); // Should be false
        System.out.println("Array 4 and Array 4: " + compareFirstLast(array4, array4)); // Should be false  (empty arrays)
        System.out.println("Array 5 and Array 6: " + compareFirstLast(array5, array6)); // Should be false
        System.out.println("Array 5 and Array 5: " + compareFirstLast(array5, array5)); // Should be true (single element array)

    }


    // Helper function to compare first and last elements (within main)
    private static boolean compareFirstLast(int[] arr1, int[] arr2) {
        if (arr1.length == 0 || arr2.length == 0 || arr1.length != arr2.length) {
            return false; // Handle empty or unequal length arrays
        }

        return arr1[0] == arr2[0] && arr1[arr1.length - 1] == arr2[arr1.length - 1];
    }

}
