public class CompareArrays {

    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 6, 7, 8, 5};

        int[] array3 = {1, 2, 3};
        int[] array4 = {7, 8, 9};

        int[] array5 = {}; // Empty array
        int[] array6 = {1, 2, 3};


        System.out.println("Array 1 and 2: " + compareFirstAndLast(array1, array2)); // Output: true
        System.out.println("Array 3 and 4: " + compareFirstAndLast(array3, array4)); // Output: false
        System.out.println("Array 5 and 6: " + compareFirstAndLast(array5, array6)); // Output: false
        System.out.println("Array 1 and null: " + compareFirstAndLast(array1, null));  // Output: false
        System.out.println("null and array2: " + compareFirstAndLast(null, array2));   // Output: false
        System.out.println("null and null: " + compareFirstAndLast(null, null));    // Output: false


    }

    private static boolean compareFirstAndLast(int[] arr1, int[] arr2) {
        // Handle null or empty arrays
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
            return false;
        }

        // Compare the first and last elements
        return arr1[0] == arr2[0] && arr1[arr1.length - 1] == arr2[arr2.length - 1];
    }
}
