import java.util.HashMap;
import java.util.Map;

public class ShallowCopyHashMap {

    public static void main(String[] args) {
        // Create an original HashMap
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 3);

        // Method 1: Using the putAll() method
        HashMap<String, Integer> shallowCopy1 = new HashMap<>();
        shallowCopy1.putAll(originalMap);

        // Method 2: Using the clone() method (Also creates a shallow copy)
        HashMap<String, Integer> shallowCopy2 = (HashMap<String, Integer>) originalMap.clone();


        // Method 3: Using the constructor that takes another Map (Also creates a shallow copy)
        HashMap<String, Integer> shallowCopy3 = new HashMap<>(originalMap);


        // Demonstrate that changes to the original affect the shallow copies, and vice versa
        System.out.println("Original Map: " + originalMap);
        System.out.println("Shallow Copy 1 (putAll): " + shallowCopy1);
        System.out.println("Shallow Copy 2 (clone): " + shallowCopy2);
        System.out.println("Shallow Copy 3 (constructor): " + shallowCopy3);

        originalMap.put("D", 4); // Modify the original

        System.out.println("\nAfter modifying the original:");
        System.out.println("Original Map: " + originalMap);
        System.out.println("Shallow Copy 1 (putAll): " + shallowCopy1);
        System.out.println("Shallow Copy 2 (clone): " + shallowCopy2);
        System.out.println("Shallow Copy 3 (constructor): " + shallowCopy3);

        shallowCopy1.put("E", 5); // Modify a shallow copy

        System.out.println("\nAfter modifying shallow copy 1:");
        System.out.println("Original Map: " + originalMap);
        System.out.println("Shallow Copy 1 (putAll): " + shallowCopy1);
        System.out.println("Shallow Copy 2 (clone): " + shallowCopy2);
        System.out.println("Shallow Copy 3 (constructor): " + shallowCopy3);



        //Important Note for shallow copies of HashMaps with mutable objects:
        HashMap<String, StringBuilder> mapWithMutableValues = new HashMap<>();
        StringBuilder sb1 = new StringBuilder("Value1");
        mapWithMutableValues.put("Key1", sb1);


        HashMap<String, StringBuilder> shallowCopyMutable = new HashMap<>(mapWithMutableValues);

        System.out.println("\nMutable Object Example - Before Change:");
        System.out.println("Original: " + mapWithMutableValues);
        System.out.println("Shallow Copy: " + shallowCopyMutable);

        sb1.append(" - Modified!"); // Modifying the mutable object (StringBuilder)

        System.out.println("\nMutable Object Example - After Change:");
        System.out.println("Original: " + mapWithMutableValues);
        System.out.println("Shallow Copy: " + shallowCopyMutable); // The change is reflected!



    }
}
