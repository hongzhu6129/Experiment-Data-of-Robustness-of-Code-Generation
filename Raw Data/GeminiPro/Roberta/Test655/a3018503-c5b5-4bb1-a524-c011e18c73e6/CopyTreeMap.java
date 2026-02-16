import java.util.TreeMap;

public class CopyTreeMap {

    public static void main(String[] args) {

        // Create the source TreeMap
        TreeMap<String, Integer> sourceTreeMap = new TreeMap<>();
        sourceTreeMap.put("Apple", 1);
        sourceTreeMap.put("Banana", 2);
        sourceTreeMap.put("Cherry", 3);
        sourceTreeMap.put("Date", 4);

        // Method 1: Using the putAll() method
        TreeMap<String, Integer> copiedTreeMap1 = new TreeMap<>();
        copiedTreeMap1.putAll(sourceTreeMap);

        System.out.println("Copied TreeMap 1 (putAll()): " + copiedTreeMap1);


        // Method 2: Using the constructor
        TreeMap<String, Integer> copiedTreeMap2 = new TreeMap<>(sourceTreeMap);

        System.out.println("Copied TreeMap 2 (constructor): " + copiedTreeMap2);

        // Method 3: Iterating and putting entries (less efficient) - Demonstrating an alternative
        TreeMap<String, Integer> copiedTreeMap3 = new TreeMap<>();
        for (String key : sourceTreeMap.keySet()) {
            copiedTreeMap3.put(key, sourceTreeMap.get(key));
        }

        System.out.println("Copied TreeMap 3 (iteration): " + copiedTreeMap3);



    }
}
