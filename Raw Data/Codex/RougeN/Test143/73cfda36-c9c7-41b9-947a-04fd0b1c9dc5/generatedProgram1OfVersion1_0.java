import java.util.TreeMap;
import java.util.Map;

public class RemoveGreatestKey {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs. TreeMap is used because it
        // maintains the keys in sorted order, making it easy to find the greatest key.
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some sample key-value pairs
        map.put(1, "One");
        map.put(5, "Five");
        map.put(2, "Two");
        map.put(10, "Ten");
        map.put(7, "Seven");


        if (!map.isEmpty()) {
            // Get the greatest key (lastKey() since TreeMap is sorted)
            Integer greatestKey = map.lastKey();

            // Get the value associated with the greatest key
            String value = map.get(greatestKey);

            // Remove the entry with the greatest key
            map.remove(greatestKey);


            // Print the removed key-value pair
            System.out.println("Removed Entry: Key = " + greatestKey + ", Value = " + value);

            // Print the remaining map contents
            System.out.println("Remaining Map: " + map);

        } else {
            System.out.println("The map is empty.");
        }
    }
}
