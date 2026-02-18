import java.util.HashMap;
import java.util.Map;

public class GetValueMap {

    public static void main(String[] args) {
        // Create a sample Map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);

        // Specify the key to retrieve
        String key = "banana";

        // Get the value associated with the key
        Integer value = myMap.get(key);

        // Print the value (handling the case where the key might not exist)
        if (value != null) {
            System.out.println("The value for key '" + key + "' is: " + value);
        } else {
            System.out.println("Key '" + key + "' not found in the map.");
        }


        // Example demonstrating getting a value that might not be present
        String key2 = "grape";
        Integer value2 = myMap.get(key2);
        if (value2 != null) {
            System.out.println("The value for key '" + key2 + "' is: " + value2);
        } else {
            System.out.println("Key '" + key2 + "' not found in the map.");
        }

    }
}
