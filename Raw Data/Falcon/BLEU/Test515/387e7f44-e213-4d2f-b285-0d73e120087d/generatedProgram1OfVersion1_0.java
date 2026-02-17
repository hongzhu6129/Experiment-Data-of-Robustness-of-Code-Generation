import java.util.HashMap;
import java.util.Map;

public class GetMapValue {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);

        // Specify the key to retrieve
        String key = "banana";

        // Get the value associated with the key
        Integer value = myMap.get(key);

        // Print the value (handle null if key not found)
        if (value != null) {
            System.out.println("The value for key '" + key + "' is: " + value);
        } else {
            System.out.println("Key '" + key + "' not found in the map.");
        }


        // Example with a key that doesn't exist
        String nonExistentKey = "grape";
        Integer nonExistentValue = myMap.get(nonExistentKey);
        if (nonExistentValue != null) {
             System.out.println("The value for key '" + nonExistentKey + "' is: " + nonExistentValue);
        } else {
             System.out.println("Key '" + nonExistentKey + "' not found in the map."); 
        }
    }
}
