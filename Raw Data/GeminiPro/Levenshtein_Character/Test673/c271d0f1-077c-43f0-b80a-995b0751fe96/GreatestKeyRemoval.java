import java.util.TreeMap;
import java.util.Map;

public class GreatestKeyRemoval {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs (sorted by keys)
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some sample data
        map.put(1, "One");
        map.put(5, "Five");
        map.put(3, "Three");
        map.put(10, "Ten");
        map.put(7, "Seven");


        if (!map.isEmpty()) {
            // Get the greatest key
            Integer greatestKey = map.lastKey();

            // Get the value associated with the greatest key
            String greatestValue = map.get(greatestKey);

            // Remove the entry with the greatest key
            map.remove(greatestKey);


            System.out.println("Removed Entry: Key = " + greatestKey + ", Value = " + greatestValue);

            System.out.println("Updated Map: " + map);

        } else {
            System.out.println("The map is empty. No element to remove.");
        }
    }
}
