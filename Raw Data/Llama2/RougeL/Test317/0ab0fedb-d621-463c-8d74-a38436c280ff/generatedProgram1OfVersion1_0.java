import java.util.TreeMap;

public class CopyTreeMap {

    public static void main(String[] args) {
        // Create the original TreeMap
        TreeMap<String, Integer> originalTreeMap = new TreeMap<>();
        originalTreeMap.put("apple", 1);
        originalTreeMap.put("banana", 2);
        originalTreeMap.put("orange", 3);

        // Method 1: Using the constructor
        TreeMap<String, Integer> copiedTreeMap1 = new TreeMap<>(originalTreeMap);

        // Method 2: Using putAll()
        TreeMap<String, Integer> copiedTreeMap2 = new TreeMap<>();
        copiedTreeMap2.putAll(originalTreeMap);


        // Print the original and copied TreeMaps to verify
        System.out.println("Original TreeMap: " + originalTreeMap);
        System.out.println("Copied TreeMap (Constructor): " + copiedTreeMap1);
        System.out.println("Copied TreeMap (putAll): " + copiedTreeMap2);


        //Demonstrate that changes to the copy do *not* affect the original:
         copiedTreeMap1.put("grape", 4); // Modify the copy
        System.out.println("Original TreeMap (after modification to copy): " + originalTreeMap);
        System.out.println("Copied TreeMap (after modification): " + copiedTreeMap1);



    }
}
