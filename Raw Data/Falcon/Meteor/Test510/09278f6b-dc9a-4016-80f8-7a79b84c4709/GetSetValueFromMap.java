import java.util.HashMap;
import java.util.Map;

public class GetSetValueFromMap {

    public static void main(String[] args) {
        // Create a Map
        Map<String, String> myMap = new HashMap<>();

        // Add some key-value pairs to the Map
        myMap.put("apple", "red");
        myMap.put("banana", "yellow");
        myMap.put("grape", "purple");

        // Specify the key for which you want to retrieve the value
        String keyToGet = "banana";

        // Get the value associated with the specified key
        String value = myMap.get(keyToGet);


        // Print the value (or null if the key is not found)
        if (value != null) {
            System.out.println("The value associated with key '" + keyToGet + "' is: " + value);
        } else {
            System.out.println("Key '" + keyToGet + "' not found in the map.");
        }



        // Example of handling a key that might not be present:
        String keyToGet2 = "orange";
        String value2 = myMap.getOrDefault(keyToGet2, "Key not found"); // Provides a default value if key isn't there

        System.out.println("The value associated with key '" + keyToGet2 + "' is (using getOrDefault): " + value2);



    }
}
