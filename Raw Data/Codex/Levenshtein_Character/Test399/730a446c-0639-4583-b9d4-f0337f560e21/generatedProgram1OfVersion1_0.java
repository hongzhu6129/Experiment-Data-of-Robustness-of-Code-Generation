import java.util.Arrays;

public class CompareArrays {

    public static <T> boolean compare_Arrays(T[] arr1, T[] arr2) {
        if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) { // Use .equals() for object comparison
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {1, 2, 3, 4, 5};
        Integer[] array3 = {1, 2, 3, 5, 4};
        Integer[] array4 = {1, 2, 3, 4};

        System.out.println("array1 and array2 are equal: " + compare_Arrays(array1, array2)); // Output: true
        System.out.println("array1 and array3 are equal: " + compare_Arrays(array1, array3)); // Output: false
        System.out.println("array1 and array4 are equal: " + compare_Arrays(array1, array4)); // Output: false

        String[] stringArray1 = {"apple", "banana", "orange"};
        String[] stringArray2 = {"apple", "banana", "orange"};
        String[] stringArray3 = {"apple", "orange", "banana"};


        System.out.println("stringArray1 and stringArray2 are equal: " + compare_Arrays(stringArray1, stringArray2)); // Output: true
        System.out.println("stringArray1 and stringArray3 are equal: " + compare_Arrays(stringArray1, stringArray3)); // Output: false

      
    }
}
