import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetToArray {

    public static void main(String[] args) {
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grape");

        // Method 1: Using toArray() with a pre-sized array
        String[] stringArray = new String[hashSet.size()];
        hashSet.toArray(stringArray);
        System.out.println("String Array (Method 1): " + Arrays.toString(stringArray));


        // Method 2: Using toArray() with a zero-length array (more common)
        String[] stringArray2 = hashSet.toArray(new String[0]);  // Or new String[0]
        System.out.println("String Array (Method 2): " + Arrays.toString(stringArray2));


        // Example with Integers:
        Set<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(3);

        Integer[] integerArray = integerHashSet.toArray(new Integer[0]);
        System.out.println("Integer Array: " + Arrays.toString(integerArray));



        // If you need a primitive type array (e.g., int[]), you'll have to iterate
        // and convert manually, as toArray() returns an Object[]:

        int[] intArray = new int[integerHashSet.size()];
        int index = 0;
        for (Integer num : integerHashSet) {
            intArray[index++] = num; // Auto-unboxing
        }
        System.out.println("Primitive int Array: " + Arrays.toString(intArray));


    }
}
