import java.util.HashSet;
import java.util.Set;

public class CountAbsoluteDistinct {

    public static void main(String[] args) {
        int[] arr1 = {2, -1, 3, -2, 1, 0, -3};
        System.out.println("Absolute distinct count for arr1: " + countAbsoluteDistinct(arr1)); // Output: 4

        int[] arr2 = {-2, -1, 0, 1, 2};
        System.out.println("Absolute distinct count for arr2: " + countAbsoluteDistinct(arr2)); // Output: 3

        int[] arr3 = {1, 1, 1, 1, 1};
        System.out.println("Absolute distinct count for arr3: " + countAbsoluteDistinct(arr3)); // Output: 1


        int[] arr4 = {}; // Empty array
        System.out.println("Absolute distinct count for arr4: " + countAbsoluteDistinct(arr4)); // Output: 0


        int[] arr5 = null; // Null array (handle potential NullPointerException)
        System.out.println("Absolute distinct count for arr5: " + countAbsoluteDistinct(arr5)); // Output: 0

    }


    public static int countAbsoluteDistinct(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        Set<Integer> distinctAbsValues = new HashSet<>();
        for (int num : arr) {
            distinctAbsValues.add(Math.abs(num));
        }
        return distinctAbsValues.size();
    }
}
