import java.util.TreeMap;
import java.util.Map;

public class RemoveGreatestKey {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs. TreeMap is used because it automatically sorts entries by key.
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some sample entries
        map.put(1, "Apple");
        map.put(5, "Banana");
        map.put(3, "Orange");
        map.put(2, "Grape");
        map.put(4, "Mango");

        if (!map.isEmpty()) { // Check if the map is empty before proceeding
            // Get the greatest key (lastKey() efficiently retrieves the largest key)
            Integer greatestKey = map.lastKey();


            // Get the value associated with the greatest key
            String greatestKeyValue = map.get(greatestKey);

            // Remove the entry with the greatest key
            map.remove(greatestKey);

            // Print the removed key-value pair
            System.out.println("Removed Key-Value Pair: " + greatestKey + " -> " + greatestKeyValue);

             // Print the remaining map entries (optional)
            System.out.println("Remaining Map: " + map);
        } else {
            System.out.println("Map is empty.");
        }

         //Example with other data types (String keys, Double values)

        TreeMap<String, Double> map2 = new TreeMap<>();
        map2.put("A", 1.1);
        map2.put("C", 3.3);
        map2.put("B", 2.2);

        if (!map2.isEmpty()) {
            String greatestKey2 = map2.lastKey();
            Double greatestValue2 = map2.remove(greatestKey2); // remove() returns the removed value
            System.out.println("Removed from map2: " + greatestKey2 + " -> " + greatestValue2);
            System.out.println("Remaining map2: " + map2);

        }else {
            System.out.println("map2 is empty.");
        }
    }
}
