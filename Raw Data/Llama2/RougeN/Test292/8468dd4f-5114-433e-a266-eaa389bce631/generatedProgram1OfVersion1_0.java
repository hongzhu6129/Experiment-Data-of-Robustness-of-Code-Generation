import java.util.HashMap;
import java.util.Map;

public class CheckValueMap {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, String> map = new HashMap<>();
        map.put("apple", "red");
        map.put("banana", "yellow");
        map.put("grape", "purple");

        // Value to search for
        String valueToFind = "yellow";

        // Check if the map contains the specified value
        boolean containsValue = map.containsValue(valueToFind);

        // Print the result
        if (containsValue) {
            System.out.println("The map contains the value: " + valueToFind);

            // Find the key associated with the value (one approach, as multiple keys could map to the same value)
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (valueToFind.equals(entry.getValue())) {
                    System.out.println("Key associated with the value: " + entry.getKey());
                    // If you only need one key, you can break here if necessary
                     break; // Stop after finding the first match
                }
            }


        } else {
            System.out.println("The map does not contain the value: " + valueToFind);
        }


         // another example
        valueToFind = "orange"; // Value not present in the map
        containsValue = map.containsValue(valueToFind); 
        if (containsValue) {
            System.out.println("The map contains the value: " + valueToFind);
        } else {
            System.out.println("The map does not contain the value: " + valueToFind);
        }
    }
}
