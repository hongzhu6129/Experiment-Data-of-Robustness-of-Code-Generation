import java.util.TreeMap;
import java.util.Map;

public class GreatestKeyRemoval {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs. TreeMap automatically sorts entries by key.
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add some sample entries
        map.put(1, "Apple");
        map.put(5, "Banana");
        map.put(3, "Orange");
        map.put(2, "Grape");
        map.put(4, "Mango");

        System.out.println("Original Map: " + map);


        if (!map.isEmpty()) { // Check if the map is empty before proceeding

            // Get the greatest key (lastKey() is efficient for TreeMap)
            Integer greatestKey = map.lastKey();

            // Get the value associated with the greatest key
            String greatestKeyValue = map.get(greatestKey);

            // Remove the entry with the greatest key
            map.remove(greatestKey);

            System.out.println("Greatest Key: " + greatestKey);
            System.out.println("Value associated with greatest key: " + greatestKeyValue);
            System.out.println("Map after removing greatest key: " + map);

        } else {
            System.out.println("The map is empty. Cannot remove the greatest key.");
        }



        // Example with a different data type for the key (String)
        TreeMap<String, Double> stringKeyMap = new TreeMap<>();
        stringKeyMap.put("A", 10.5);
        stringKeyMap.put("C", 5.2);
        stringKeyMap.put("B", 8.7);

        System.out.println("\nString Key Map (Original): " + stringKeyMap);

         if (!stringKeyMap.isEmpty()) {
            String greatestStringKey = stringKeyMap.lastKey();
            Double greatestStringKeyValue = stringKeyMap.get(greatestStringKey);
            stringKeyMap.remove(greatestStringKey);
            System.out.println("Greatest String Key: " + greatestStringKey);
            System.out.println("Value associated with greatest string key: " + greatestStringKeyValue);
            System.out.println("String Key Map after removing greatest key: " + stringKeyMap);
         } else {
             System.out.println("The string key map is empty.");
         }
    }
}
