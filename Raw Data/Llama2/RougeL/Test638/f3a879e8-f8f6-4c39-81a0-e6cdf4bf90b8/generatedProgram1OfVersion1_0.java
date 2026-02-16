import java.util.TreeMap;
import java.util.Map;

public class RemoveGreatestKey {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs. TreeMap automatically sorts keys in ascending order.
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some sample data
        map.put(1, "One");
        map.put(5, "Five");
        map.put(2, "Two");
        map.put(10, "Ten");
        map.put(7, "Seven");


        if (!map.isEmpty()) {
            // Get the greatest key (lastKey() because TreeMap is sorted)
            Integer greatestKey = map.lastKey();

            // Remove and get the value associated with the greatest key
            String value = map.remove(greatestKey);

            // Print the removed key-value pair
            System.out.println("Removed Key-Value Pair: " + greatestKey + " -> " + value);


            // Print the updated map (optional)
            System.out.println("Updated Map: " + map);
        } else {
            System.out.println("The map is empty.");
        }

    }
}
