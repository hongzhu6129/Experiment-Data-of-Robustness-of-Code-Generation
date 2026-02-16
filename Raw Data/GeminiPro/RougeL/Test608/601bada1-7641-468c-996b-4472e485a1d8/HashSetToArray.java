import java.util.HashSet;
import java.util.Arrays;

public class HashSetToArray {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grape");

        // Method 1: Convert to an array using toArray() with a pre-sized array
        String[] stringArray = new String[hashSet.size()];
        hashSet.toArray(stringArray);

        System.out.println("Array converted using pre-sized array:");
        System.out.println(Arrays.toString(stringArray));


        // Method 2: Convert to an array using toArray() with a zero-length array  (more common)
        String[] stringArray2 = hashSet.toArray(new String[0]);

        System.out.println("\nArray converted using zero-length array:");
        System.out.println(Arrays.toString(stringArray2));


        // Example with Integers
        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(3);

        Integer[] integerArray = integerHashSet.toArray(new Integer[0]);  // Common way
        System.out.println("\nInteger array converted using zero-length array:");
        System.out.println(Arrays.toString(integerArray));

    }
}
