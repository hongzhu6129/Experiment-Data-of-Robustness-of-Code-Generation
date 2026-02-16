import java.util.HashMap;
import java.util.Map;

public class CheckValueMap {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Value to search for
        int valueToFind = 2;

        // Check if the map contains the specified value
        boolean containsValue = map.containsValue(valueToFind);

        // Print the result
        if (containsValue) {
            System.out.println("The map contains the value " + valueToFind);

            // Find and print the key associated with the value (optional)
             for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(valueToFind)) {
                    System.out.println("Key associated with the value: " + entry.getKey());
                    break; // Assuming the value is unique, break after finding it
                }
            }
            
        } else {
            System.out.println("The map does not contain the value " + valueToFind);
        }


        //Another test case
        valueToFind = 5; // Value not present in the map

        containsValue = map.containsValue(valueToFind);
        if (containsValue) {
            System.out.println("The map contains the value " + valueToFind);
        } else {
            System.out.println("The map does not contain the value " + valueToFind);
        }
    }
}
