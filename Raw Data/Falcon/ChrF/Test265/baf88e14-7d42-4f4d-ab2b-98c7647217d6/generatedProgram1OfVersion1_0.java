import java.util.TreeMap;
import java.util.Map;

public class RemoveGreatestKey {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs. TreeMap is used because it automatically sorts entries by key.
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some sample data
        map.put(1, "One");
        map.put(5, "Five");
        map.put(3, "Three");
        map.put(2, "Two");
        map.put(4, "Four");


        if (!map.isEmpty()) { // Check if the map is empty before proceeding
            Integer greatestKey = map.lastKey(); // Get the greatest key
            String greatestValue = map.remove(greatestKey); // Remove and get the value associated with the greatest key

            System.out.println("Removed Entry: Key = " + greatestKey + ", Value = " + greatestValue);
        } else {
            System.out.println("The map is empty.");
        }

        // Print the remaining map contents (optional)
        System.out.println("Remaining Map: " + map);



        // Example demonstrating handling an empty map robustly:
        TreeMap<Integer, String> emptyMap = new TreeMap<>();

        if (!emptyMap.isEmpty()) {
            Integer key = emptyMap.lastKey();
            String value = emptyMap.remove(key);
            System.out.println("Removed Entry (Empty Map Example): Key = " + key + ", Value = " + value);
        } else {
            System.out.println("The map is empty (Empty Map Example)."); // This will be printed
        }

    }
}
