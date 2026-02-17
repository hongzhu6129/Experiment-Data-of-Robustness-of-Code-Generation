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

        // Method 1: Convert to an array using toArray() with a pre-allocated array
        String[] stringArray = new String[hashSet.size()];
        hashSet.toArray(stringArray);
        System.out.println("Array using pre-allocated array: " + Arrays.toString(stringArray));


        // Method 2: Convert to an array using toArray() without a pre-allocated array (more common)
        String[] anotherStringArray = hashSet.toArray(new String[0]); // Empty array as argument
        System.out.println("Array using empty array argument: " + Arrays.toString(anotherStringArray));



        // Example with Integers:
        Set<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(3);

        Integer[] integerArray = integerHashSet.toArray(new Integer[0]);
        System.out.println("Integer array: " + Arrays.toString(integerArray));


        // If you don't know the type at compile time (e.g., getting a Set from another method):
         Set<Object> anySet = new HashSet<>();
         anySet.add("string");
         anySet.add(123);
         anySet.add(4.56);

         Object[] objectArray = anySet.toArray(); // This creates an Object[] array
         System.out.println("Object array: " + Arrays.toString(objectArray));


    }
}
