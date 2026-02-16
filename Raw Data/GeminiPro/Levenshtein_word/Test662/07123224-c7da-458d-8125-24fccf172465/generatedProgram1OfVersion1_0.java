import java.util.Map;
import java.util.TreeMap;

public class GetFirstAndLastKey {

    public static void main(String[] args) {
        // Create a TreeMap (which maintains sorted order of keys)
        Map<Integer, String> map = new TreeMap<>();

        // Populate the map with some sample data
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");

        if (!map.isEmpty()) { // Check if the map is empty to avoid exceptions
            // Get the first (lowest) key using firstKey()
            Integer firstKey = map.keySet().stream().findFirst().orElse(null); 

            // Get the last (highest) key using lastKey() (specific to TreeMap)
            Integer lastKey = map.keySet().stream().reduce((first, second) -> second).orElse(null);


            System.out.println("First Key: " + firstKey);
            System.out.println("Last Key: " + lastKey);
        } else {
            System.out.println("The map is empty.");
        }



        // Example using a HashMap (does not guarantee key order) - Demonstrating an alternative if order isn't inherent.

        Map<String, Integer> hashMap = new java.util.HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Orange", 3);

        if (!hashMap.isEmpty()) {
            String firstKeyHashMap = hashMap.keySet().stream().findFirst().orElse(null);
            // For last key in a HashMap, we'd need to iterate or convert to a sorted map like TreeMap.
            // Showing a basic iteration method here as an example. No guaranteed order.
            String lastKeyHashMap = null;
            for(String key : hashMap.keySet()) {
                lastKeyHashMap = key; // The last one iterated over will be assigned
            }

            System.out.println("\nHashMap Example (no guaranteed order):");
            System.out.println("A Key: " + firstKeyHashMap); // Not necessarily the "first"
            System.out.println("Another Key: " + lastKeyHashMap);  // Not necessarily the "last"

        } else {
            System.out.println("The HashMap is empty.");
        }
    }
}
