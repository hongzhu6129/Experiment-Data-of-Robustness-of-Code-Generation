import java.util.HashMap;
import java.util.Map;

public class ShallowCopyHashMap {

    public static void main(String[] args) {
        // Create an original HashMap
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Apple", 1);
        originalMap.put("Banana", 2);
        originalMap.put("Orange", 3);

        // Method 1: Using the putAll() method
        HashMap<String, Integer> shallowCopy1 = new HashMap<>();
        shallowCopy1.putAll(originalMap);

        // Method 2: Using the clone() method (also a shallow copy)
        HashMap<String, Integer> shallowCopy2 = (HashMap<String, Integer>) originalMap.clone();

        // Method 3: Using the Map.copyOf() method (Java 9 and later).  This creates an *unmodifiable* shallow copy
        Map<String, Integer> shallowCopy3 = Map.copyOf(originalMap); // Note: unmodifiable


        // Demonstrate that changes to the original affect the shallow copies (and vice-versa for mutable copies)
        originalMap.put("Grape", 4);
        System.out.println("Original Map after modification: " + originalMap);
        System.out.println("Shallow Copy 1 (putAll): " + shallowCopy1);
        System.out.println("Shallow Copy 2 (clone): " + shallowCopy2);
        System.out.println("Shallow Copy 3 (copyOf - unmodifiable): " + shallowCopy3);


        //Demonstrate modification through a shallow copy
        shallowCopy1.put("Mango", 5);  // This will also affect originalMap because of the shallow copy
        System.out.println("Original Map after modifying shallowCopy1: " + originalMap);


        // Trying to modify the unmodifiable copy will result in an exception
        // shallowCopy3.put("Pear", 6); // Uncommenting this will cause an UnsupportedOperationException



    }
}
