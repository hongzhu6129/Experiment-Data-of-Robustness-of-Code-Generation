import java.util.HashMap;
import java.util.Map;

public class GetMapValue {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("name", "John Doe");
        map.put("age", "30");
        map.put("city", "New York");

        // Specify the key you want to retrieve the value for
        String key = "age";

        // Get the value associated with the key
        String value = map.get(key);


        // Print the value (or null if the key doesn't exist)
        if (value != null) {
            System.out.println("The value for key '" + key + "' is: " + value);
        } else {
            System.out.println("Key '" + key + "' not found in the map.");
        }



        //Example with an Integer value:
         Map<String, Integer> map2 = new HashMap<>();
         map2.put("quantity", 5);
         Integer quantity = map2.get("quantity");
         if (quantity != null) {
            System.out.println("The quantity is: " + quantity);
         } else {
            System.out.println("Quantity not found.");
         }

    }
}
