import java.util.TreeMap;
import java.util.Map;

public class RemoveGreatestKey {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs. TreeMap is used because it automatically sorts entries based on key.
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some sample key-value pairs
        map.put(1, "One");
        map.put(5, "Five");
        map.put(3, "Three");
        map.put(2, "Two");
        map.put(4, "Four");

        // Check if the map is empty
        if (map.isEmpty()) {
            System.out.println("Map is empty. No element to remove.");
            return; 
        }

        // Get the greatest key using lastKey()
        Integer greatestKey = map.lastKey();

        // Remove and get the value associated with the greatest key using pollLastEntry()
        Map.Entry<Integer, String> removedEntry = map.pollLastEntry();

        if (removedEntry != null) {
            System.out.println("Removed Entry: Key = " + removedEntry.getKey() + ", Value = " + removedEntry.getValue());
        }


        // Print the updated map (after removal)
        System.out.println("Updated Map: " + map);
    }
}
