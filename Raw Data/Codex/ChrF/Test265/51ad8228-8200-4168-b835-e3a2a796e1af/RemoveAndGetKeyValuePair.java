import java.util.HashMap;
import java.util.Map;

public class RemoveAndGetKeyValuePair {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> map = new HashMap<>();

        // Add some key-value pairs
        map.put("apple", "red");
        map.put("banana", "yellow");
        map.put("grape", "purple");

        // Remove and get the key-value pair associated with "banana"
        String value = map.remove("banana");

        // Print the removed value
        if (value != null) {
            System.out.println("Removed value for key 'banana': " + value);
        } else {
            System.out.println("Key 'banana' not found in the map.");
        }


        //Demonstrate handling a key that might not exist (e.g., "orange"):

        String value2 = map.remove("orange");  // Try to remove "orange"

         if (value2 != null) {
            System.out.println("Removed value for key 'orange': " + value2);
        } else {
            System.out.println("Key 'orange' not found in the map."); // This will be printed
        }


        // Print the updated map
        System.out.println("Updated map: " + map);



        // Example with an integer key:
        Map<Integer, String> intKeyMap = new HashMap<>();
        intKeyMap.put(1, "one");
        intKeyMap.put(2, "two");

        String intRemovedValue = intKeyMap.remove(2);
        if (intRemovedValue != null) {
            System.out.println("Removed value for key 2: " + intRemovedValue);
        } else {
            System.out.println("Key 2 not found in the map."); 
        }
        System.out.println("Updated intKeyMap: " + intKeyMap);



    }
}
