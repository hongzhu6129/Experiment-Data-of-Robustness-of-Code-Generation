import java.util.HashSet;
import java.util.Set;

public class MultiplicationSetSize {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 2, 4, 12, 6}; // Example input array
        System.out.println(multiplicationSetSize(arr)); // Output the size of the multiplication set

        int[] arr2 = {1, 2, 2, 4, 8, 16, 32, 32}; // Another example
        System.out.println(multiplicationSetSize(arr2));

        int[] arr3 = {}; // Empty array example
        System.out.println(multiplicationSetSize(arr3));


    }


    public static int multiplicationSetSize(int[] arr) {

        if (arr == null) {
            return 0;  // Handle null input appropriately
        }

        Set<Integer> multiplicationSet = new HashSet<>();

        if (arr.length == 0) {
            return 0; // Handle empty array
        }


        for (int num : arr) {
            multiplicationSet.add(num * 2); // Add each element multiplied by 2 to the set
        }

        return multiplicationSet.size();

    }
}
