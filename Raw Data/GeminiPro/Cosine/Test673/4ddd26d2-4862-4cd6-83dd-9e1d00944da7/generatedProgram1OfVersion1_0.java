import java.util.TreeMap;
import java.util.Map;

public class RemoveGreatestKey {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs. TreeMap is used because it automatically sorts entries by key.
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some sample data
        map.put(1, "One");
        map.put(5, "Five");
        map.put(2, "Two");
        map.put(8, "Eight");
        map.put(3, "Three");

        if (!map.isEmpty()) { // Check if the map is empty to avoid exceptions.
            // Get the greatest key
            Integer greatestKey = map.lastKey();

            // Remove and get the value associated with the greatest key
            String value = map.remove(greatestKey);


            // Print the removed key-value pair
            System.out.println("Removed Key-Value Pair: " + greatestKey + "=" + value);


            // Print the updated map
            System.out.println("Updated Map: " + map);

        } else {
            System.out.println("The map is empty.");
        }
    }
}
