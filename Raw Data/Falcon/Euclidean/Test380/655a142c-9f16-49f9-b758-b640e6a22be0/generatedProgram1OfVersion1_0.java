import java.util.HashMap;
import java.util.Map;

public class CheckValueInMap {

    public static void main(String[] args) {

        // Create a sample map
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);


        // Value to search for
        int valueToFind = 2;

        // Check if the map contains the value using containsValue()
        boolean containsValue = map.containsValue(valueToFind);

        if (containsValue) {
            System.out.println("The map contains the value " + valueToFind);
        } else {
            System.out.println("The map does not contain the value " + valueToFind);
        }


        // Example with a value that is NOT in the map
        valueToFind = 5;
        containsValue = map.containsValue(valueToFind);

        if (containsValue) {
            System.out.println("The map contains the value " + valueToFind);
        } else {
            System.out.println("The map does not contain the value " + valueToFind);
        }


        // Demonstrating with a null value. Careful!
        map.put("grape", null); // Add a key with a null value

        containsValue = map.containsValue(null);
        if (containsValue) {
            System.out.println("The map contains the value null");
        } else {
            System.out.println("The map does not contain the value null"); // This won't print because we added a null value
        }

    }
}
