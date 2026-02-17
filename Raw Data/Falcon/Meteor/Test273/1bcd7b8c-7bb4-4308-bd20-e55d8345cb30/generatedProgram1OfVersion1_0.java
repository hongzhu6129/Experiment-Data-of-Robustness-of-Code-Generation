import java.util.HashMap;
import java.util.Map;

public class CheckValueInMap {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Value to search for
        int valueToSearch = 2;

        // Check if the map contains the value
        boolean containsValue = map.containsValue(valueToSearch);

        // Print the result
        if (containsValue) {
            System.out.println("The map contains the value " + valueToSearch);

            // Find and print the key associated with the value (optional)
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(valueToSearch)) {
                    System.out.println("The key associated with the value is: " + entry.getKey());
                    break; // Stop after finding the first occurrence 
                }
            }


        } else {
            System.out.println("The map does not contain the value " + valueToSearch);
        }



         //Another example using a different value:
        valueToSearch = 5; // This value is not in the map
        containsValue = map.containsValue(valueToSearch);

        if (containsValue) {
            System.out.println("The map contains the value " + valueToSearch);
        } else {
            System.out.println("The map does not contain the value " + valueToSearch);
        }
    }
}
