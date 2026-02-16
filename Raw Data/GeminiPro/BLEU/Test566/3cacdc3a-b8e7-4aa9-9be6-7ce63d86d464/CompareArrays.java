import java.util.Arrays;

public class CompareArrays {

    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 6};
        int[] array4 = {1, 2, 3, 4, 5, 6};
        int[] array5 = {1, 2, 3};


        // Compare using Arrays.equals()
        System.out.println("array1 and array2 are equal: " + Arrays.equals(array1, array2)); // Output: true
        System.out.println("array1 and array3 are equal: " + Arrays.equals(array1, array3)); // Output: false
        System.out.println("array1 and array4 are equal: " + Arrays.equals(array1, array4)); // Output: false
        System.out.println("array1 and array5 are equal: " + Arrays.equals(array1, array5)); // Output: false


        // Manual comparison (useful if you need more control or specific comparison logic)
        System.out.println("Manual comparison of array1 and array2: " + compareArraysManually(array1, array2)); // true
        System.out.println("Manual comparison of array1 and array3: " + compareArraysManually(array1, array3)); // false
        System.out.println("Manual comparison of array1 and array4: " + compareArraysManually(array1, array4)); // false


    }

    public static boolean compareArraysManually(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false; // Arrays of different lengths cannot be equal
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false; // If any element is different, the arrays are not equal
            }
        }

        return true; // All elements are equal
    }
}




