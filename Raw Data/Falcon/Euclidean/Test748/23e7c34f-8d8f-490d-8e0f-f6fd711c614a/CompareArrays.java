public class CompareArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 6, 7, 8, 5};

        int[] array3 = {1, 2, 3, 4, 5};
        int[] array4 = {6, 7, 8, 9, 10};

        System.out.println("Arrays 1 and 2 have same first and last elements: " + compareFirstLast(array1, array2));
        System.out.println("Arrays 3 and 4 have same first and last elements: " + compareFirstLast(array3, array4));

        // Examples with empty arrays/null
        int[] emptyArray = {};
        int[] nullArray = null;

        System.out.println("Arrays 1 and empty array have same first and last elements: " + compareFirstLast(array1, emptyArray)); // false
        System.out.println("Arrays 1 and null array have same first and last elements: " + compareFirstLast(array1, nullArray)); // false
        System.out.println("Null array and empty array have same first and last elements: " + compareFirstLast(nullArray, emptyArray)); // false


    }

    private static boolean compareFirstLast(int[] arr1, int[] arr2) {
        // Handle null or empty arrays
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
            return false; 
        }

        return arr1[0] == arr2[0] && arr1[arr1.length - 1] == arr2[arr2.length - 1];
    }
}
