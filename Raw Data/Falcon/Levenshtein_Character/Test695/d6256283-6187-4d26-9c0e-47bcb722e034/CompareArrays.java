import java.util.Arrays;

public class CompareArrays {

    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 6};
        int[] array4 = {1, 2, 3};

        // Compare using Arrays.equals()
        System.out.println("array1 and array2 are equal: " + Arrays.equals(array1, array2)); // Output: true
        System.out.println("array1 and array3 are equal: " + Arrays.equals(array1, array3)); // Output: false
        System.out.println("array1 and array4 are equal: " + Arrays.equals(array1, array4)); // Output: false


        // Manual comparison (for understanding, Arrays.equals() is generally preferred)
        boolean equal = compareArraysManually(array1, array2);
        System.out.println("Manual comparison - array1 and array2 are equal: " + equal); // Output: true

        equal = compareArraysManually(array1, array3);
        System.out.println("Manual comparison - array1 and array3 are equal: " + equal); // Output: false


    }

    // Manual comparison method (demonstration only)
    public static boolean compareArraysManually(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
