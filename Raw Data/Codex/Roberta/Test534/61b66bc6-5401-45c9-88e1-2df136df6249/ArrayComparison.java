public class ArrayComparison {

    public static void main(String[] args) {

        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 6, 7, 8, 5};
        int[] array3 = {1, 2, 3, 4, 6};  // Different last element
        int[] array4 = {2, 2, 3, 4, 5}; // Different first element
        int[] emptyArray1 = {};
        int[] emptyArray2 = {};

        // Test cases and output
        System.out.println("Array 1 and Array 2: " + compareFirstAndLast(array1, array2)); // True
        System.out.println("Array 1 and Array 3: " + compareFirstAndLast(array1, array3)); // False
        System.out.println("Array 1 and Array 4: " + compareFirstAndLast(array1, array4)); // False
        System.out.println("Array 1 and Empty Array 1: " + compareFirstAndLast(array1, emptyArray1)); // False
        System.out.println("Empty Array 1 and Empty Array 2: " + compareFirstAndLast(emptyArray1, emptyArray2)); // True


    }

    //Helper function to compare the first and last elements
    private static boolean compareFirstAndLast(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
            return arr1.length == arr2.length; //  Both empty is considered same for this specific problem
        }
        return arr1[0] == arr2[0] && arr1[arr1.length - 1] == arr2[arr2.length - 1];
    }
}
