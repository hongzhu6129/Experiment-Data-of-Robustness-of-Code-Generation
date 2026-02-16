import java.util.HashMap;
import java.util.Map;

public class GetValueMap {

    public static void main(String[] args) {

        // Create a HashMap
        Map<String, String> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("name", "John Doe");
        map.put("age", "30");
        map.put("city", "New York");

        // Specify the key to retrieve
        String key = "age";

        // Get the value associated with the key
        String value = map.get(key);

        // Check if the key exists in the map
        if (value != null) {
            System.out.println("The value for key '" + key + "' is: " + value);
        } else {
            System.out.println("Key '" + key + "' not found in the map.");
        }



         //Example with an Integer value

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("quantity", 5);

        String key2 = "quantity";
        Integer value2 = map2.get(key2); // Use Integer for integer values

        if (value2 != null) {
            System.out.println("The value for key '" + key2 + "' is: " + value2);
        } else {
            System.out.println("Key '" + key2 + "' not found in the map.");
        }

    }
}
