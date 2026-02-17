public class CompareArrays {

    public static void main(String[] args) {

        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 6, 7, 8, 5};
        int[] array3 = {1, 2, 3, 4, 6};
        int[] array4 = {};  // Empty array
        int[] array5 = {7}; // Single element array
        int[] array6 = null; // Null array


        // Test cases
        System.out.println("Array 1 and Array 2: " + compareFirstLast(array1, array2)); // True
        System.out.println("Array 1 and Array 3: " + compareFirstLast(array1, array3)); // False
        System.out.println("Array 1 and Array 4: " + compareFirstLast(array1, array4)); // False
        System.out.println("Array 4 and Array 5: " + compareFirstLast(array4, array5)); // False
        System.out.println("Array 5 and Array 5: " + compareFirstLast(array5, array5)); // True
        System.out.println("Array 1 and Array 6: " + compareFirstLast(array1, array6)); // False
        System.out.println("Array 6 and Array 4: " + compareFirstLast(array6, array4)); // False


    }

    //Helper function to avoid redundancy. It checks for null and empty arrays before accessing elements.
    private static boolean compareFirstLast(int[] arr1, int[] arr2) {

        // Handle null or empty arrays
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
            return false;
        }
        
        // Compare the first and last elements
        return arr1[0] == arr2[0] && arr1[arr1.length - 1] == arr2[arr2.length - 1];
    }
}



