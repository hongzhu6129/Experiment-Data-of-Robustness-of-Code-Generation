import java.util.TreeMap;

public class CopyTreeMap {

    public static void main(String[] args) {

        // Create a source TreeMap
        TreeMap<String, Integer> sourceTreeMap = new TreeMap<>();
        sourceTreeMap.put("Apple", 1);
        sourceTreeMap.put("Banana", 2);
        sourceTreeMap.put("Orange", 3);
        sourceTreeMap.put("Grape", 4);


        // Method 1: Using the putAll() method (most efficient)
        TreeMap<String, Integer> copiedTreeMap1 = new TreeMap<>();
        copiedTreeMap1.putAll(sourceTreeMap);

        System.out.println("Copied TreeMap 1 (putAll): " + copiedTreeMap1);


        // Method 2: Using the constructor (also efficient)
        TreeMap<String, Integer> copiedTreeMap2 = new TreeMap<>(sourceTreeMap);

        System.out.println("Copied TreeMap 2 (constructor): " + copiedTreeMap2);


        // Method 3: Iterating and putting each entry (less efficient)
        TreeMap<String, Integer> copiedTreeMap3 = new TreeMap<>();
        for (String key : sourceTreeMap.keySet()) {
            copiedTreeMap3.put(key, sourceTreeMap.get(key));
        }

        System.out.println("Copied TreeMap 3 (iteration): " + copiedTreeMap3);


         // Demonstrating that changes to the copy don't affect the original
        copiedTreeMap1.remove("Apple");
        System.out.println("Original TreeMap after removing from copy: " + sourceTreeMap);
        System.out.println("Copied TreeMap 1 after removing 'Apple': " + copiedTreeMap1);

    }
}
