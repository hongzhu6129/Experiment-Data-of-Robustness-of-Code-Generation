import java.util.TreeMap;
import java.util.Map;

public class RemoveGreatestKey {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value mappings. TreeMap is used because
        // it automatically sorts entries based on the natural ordering of keys.
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some sample entries.
        map.put(1, "One");
        map.put(5, "Five");
        map.put(3, "Three");
        map.put(2, "Two");
        map.put(4, "Four");


        if (!map.isEmpty()) {
            // Get the greatest key. lastKey() or lastEntry().getKey() can be used
            Integer greatestKey = map.lastKey();

            // Get the value associated with the greatest key (before removing).
            String greatestValue = map.get(greatestKey);

            // Remove the entry with the greatest key.
            map.remove(greatestKey);

            // Output the removed key-value pair.
            System.out.println("Removed Entry: Key = " + greatestKey + ", Value = " + greatestValue);

            // Print the updated map (optional).
            System.out.println("Updated Map: " + map);
        } else {
            System.out.println("The map is empty.");
        }

    }
}
