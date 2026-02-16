import java.util.TreeMap;
import java.util.Map;

public class RemoveGreatestKey {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs (sorted by keys)
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some sample entries
        map.put(1, "One");
        map.put(5, "Five");
        map.put(3, "Three");
        map.put(2, "Two");
        map.put(4, "Four");


        if (!map.isEmpty()) {
            // Get the greatest key (lastKey in a TreeMap)
            Integer greatestKey = map.lastKey();

            // Remove and get the value associated with the greatest key
            String value = map.remove(greatestKey);

            // Print the removed key-value pair
            System.out.println("Removed Key-Value Pair: " + greatestKey + "=" + value);


            // Print the updated map (without the greatest key)
            System.out.println("Updated Map: " + map);


        } else {
            System.out.println("Map is empty. Nothing to remove.");
        }
    }
}
