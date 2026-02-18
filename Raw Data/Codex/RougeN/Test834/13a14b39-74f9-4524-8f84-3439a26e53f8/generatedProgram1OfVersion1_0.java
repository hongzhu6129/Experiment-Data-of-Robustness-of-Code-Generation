import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetToArray {

    public static void main(String[] args) {
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");

        // Method 1: Convert to an array of Strings
        String[] stringArray = hashSet.toArray(new String[0]); 

        System.out.println("String array: " + Arrays.toString(stringArray));

        // Method 2:  Convert to an array of Objects (more general)
        Object[] objectArray = hashSet.toArray();

        System.out.println("Object array: " + Arrays.toString(objectArray));


        // Example with Integers:
        Set<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(3);

        Integer[] integerArray = integerHashSet.toArray(new Integer[0]);
        System.out.println("Integer array: " + Arrays.toString(integerArray));

     }
}
