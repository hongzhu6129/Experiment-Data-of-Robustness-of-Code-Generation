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
        map.put(10, "Ten");
        map.put(7, "Seven");


        if (!map.isEmpty()) {
            // Get the greatest key (lastKey in a TreeMap)
            Integer greatestKey = map.lastKey();

            // Get the value associated with the greatest key
            String value = map.get(greatestKey);

            // Remove the entry with the greatest key
            map.remove(greatestKey);


            System.out.println("Removed Entry: Key = " + greatestKey + ", Value = " + value);
            System.out.println("Updated Map: " + map);
        } else {
            System.out.println("The map is empty.");
        }


         //Another example with a different data type for keys (String)
         TreeMap<String, Integer> map2 = new TreeMap<>();
         map2.put("Apple", 1);
         map2.put("Banana", 2);
         map2.put("Orange", 3);

          if (!map2.isEmpty()) {
            String greatestKey2 = map2.lastKey();
            Integer value2 = map2.get(greatestKey2);
            map2.remove(greatestKey2);

            System.out.println("\nRemoved Entry (String Keyed Map): Key = " + greatestKey2 + ", Value = " + value2);
            System.out.println("Updated Map (String Keyed Map): " + map2);

        } else {
             System.out.println("\nThe second map is empty.");
        }

    }
}
