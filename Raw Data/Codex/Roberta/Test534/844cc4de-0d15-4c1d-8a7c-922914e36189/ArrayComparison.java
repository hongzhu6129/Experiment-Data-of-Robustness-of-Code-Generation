public class ArrayComparison {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 6, 7, 8, 5};
        int[] array3 = {1, 2, 3, 4, 6};
        int[] array4 = {2, 2, 3, 4, 5};
        int[] emptyArray = {};
        int[] singleElementArray1 = {5};
        int[] singleElementArray2 = {5};
        int[] singleElementArray3 = {6};


        System.out.println("Array 1 and Array 2: " + compareFirstAndLast(array1, array2)); // true
        System.out.println("Array 1 and Array 3: " + compareFirstAndLast(array1, array3)); // false
        System.out.println("Array 1 and Array 4: " + compareFirstAndLast(array1, array4)); // false
        System.out.println("Array 1 and Empty Array: " + compareFirstAndLast(array1, emptyArray)); // false
        System.out.println("Empty Array and Array 1: " + compareFirstAndLast(emptyArray, array1)); // false
        System.out.println("Empty Array and Empty Array: " + compareFirstAndLast(emptyArray, emptyArray)); // false
        System.out.println("Single Element Array 1 and Single Element Array 2: " + compareFirstAndLast(singleElementArray1, singleElementArray2)); // true
        System.out.println("Single Element Array 1 and Single Element Array 3: " + compareFirstAndLast(singleElementArray1, singleElementArray3)); // false

    }

    private static boolean compareFirstAndLast(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
            return false;  // Handle null or empty arrays
        }

        return arr1[0] == arr2[0] && arr1[arr1.length - 1] == arr2[arr2.length - 1];

    }
}

