import java.util.HashMap;
import java.util.Map;

public class GetMapValue {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Specify the key to retrieve
        String key = "Banana";

        // Get the value associated with the key
        Integer value = map.get(key);

        // Print the value (or a message if the key is not found)
        if (value != null) {
            System.out.println("The value of " + key + " is: " + value);
        } else {
            System.out.println("Key not found in the map.");
        }


        //Example with key not present
        String keyNotPresent = "Grape";
        Integer valueNotPresent = map.get(keyNotPresent);
        if (valueNotPresent != null) {
            System.out.println("The value of " + keyNotPresent + " is: " + valueNotPresent);
        } else {
            System.out.println("Key not found in the map.");
        }

    }
}
