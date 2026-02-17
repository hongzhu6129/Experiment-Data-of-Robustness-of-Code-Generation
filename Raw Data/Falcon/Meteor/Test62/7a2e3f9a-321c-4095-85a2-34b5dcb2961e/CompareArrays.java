public class CompareArrays {

    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 7, 8, 9, 5};
        int[] array3 = {1, 2, 3, 4, 6};
        int[] array4 = {7, 2, 3, 4, 5};
        int[] emptyArray = {};
        int[] oneElementArray = {5};

        // Test cases
        System.out.println("Array 1 and Array 2: " + compareFirstAndLast(array1, array2)); // Expected: true
        System.out.println("Array 1 and Array 3: " + compareFirstAndLast(array1, array3)); // Expected: false
        System.out.println("Array 1 and Array 4: " + compareFirstAndLast(array1, array4)); // Expected: false
        System.out.println("Array 1 and Empty Array: " + compareFirstAndLast(array1, emptyArray)); // Expected: false
        System.out.println("Empty Array and Array 1: " + compareFirstAndLast(emptyArray, array1)); // Expected: false
        System.out.println("One Element Array and Array 1: " + compareFirstAndLast(oneElementArray, array1)); // Expected: true
        System.out.println("Array 1 and One Element Array: " + compareFirstAndLast(array1, oneElementArray)); // Expected: true


    }

    public static boolean compareFirstAndLast(int[] arr1, int[] arr2) {
        // Handle cases where either or both arrays are empty or null
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
            return false;
        }

        // Compare the first and last elements
        return arr1[0] == arr2[0] && arr1[arr1.length - 1] == arr2[arr2.length - 1];
    }
}

