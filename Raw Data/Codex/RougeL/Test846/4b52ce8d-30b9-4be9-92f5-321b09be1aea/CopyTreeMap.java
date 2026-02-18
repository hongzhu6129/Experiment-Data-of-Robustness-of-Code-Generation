import java.util.TreeMap;

public class CopyTreeMap {

    public static void main(String[] args) {
        // Create the original TreeMap
        TreeMap<String, Integer> originalTreeMap = new TreeMap<>();
        originalTreeMap.put("Apple", 1);
        originalTreeMap.put("Banana", 2);
        originalTreeMap.put("Orange", 3);
        originalTreeMap.put("Grape", 4);

        // Method 1: Using the constructor
        TreeMap<String, Integer> copiedTreeMap1 = new TreeMap<>(originalTreeMap);

        // Method 2: Using putAll()
        TreeMap<String, Integer> copiedTreeMap2 = new TreeMap<>();
        copiedTreeMap2.putAll(originalTreeMap);


        // Print the original and copied TreeMaps to verify
        System.out.println("Original TreeMap: " + originalTreeMap);
        System.out.println("Copied TreeMap (Constructor): " + copiedTreeMap1);
        System.out.println("Copied TreeMap (putAll): " + copiedTreeMap2);


        // Demonstrate that changes to the copy do not affect the original
        copiedTreeMap1.put("Mango", 5);  // Add an element to the copy

        System.out.println("\nAfter modification:");
        System.out.println("Original TreeMap: " + originalTreeMap); // Original remains unchanged
        System.out.println("Copied TreeMap (Constructor): " + copiedTreeMap1);


        //Demonstrate clearing one does not affect the other
        copiedTreeMap2.clear();

        System.out.println("\nAfter clearing copiedTreeMap2:");
        System.out.println("Original TreeMap: " + originalTreeMap); // Original remains unchanged
        System.out.println("Copied TreeMap (putAll): " + copiedTreeMap2); // copiedTreeMap2 is now empty



    }
}
