import java.util.HashSet;
import java.util.Set;

public class MultiplicationSetSize {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 2, 4}; // Example input array
        System.out.println(multiplicationSetSize(arr)); // Output: 3 (4, 8, 16)

        int[] arr2 = {1, 2, 2, 4, 4, 8}; // Another example
        System.out.println(multiplicationSetSize(arr2)); // Output: 3 (2, 4, 8)


        int[] arr3 = {1, 1, 1}; // Example with duplicates
        System.out.println(multiplicationSetSize(arr3)); // Output: 1 (1)

        int[] arr4 = {}; // Empty array example
        System.out.println(multiplicationSetSize(arr4)); // Output: 0
    }

    public static int multiplicationSetSize(int[] arr) {
        Set<Integer> multiplicationSet = new HashSet<>();

        if (arr == null || arr.length == 0) {
            return 0; // Handle empty or null input
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                multiplicationSet.add(arr[i] * arr[j]);
            }
        }

        return multiplicationSet.size();
    }
}
