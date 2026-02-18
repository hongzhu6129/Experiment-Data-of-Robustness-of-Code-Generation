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

        // Check if the map contains the value
        boolean containsValue = map.containsValue(valueToFind);

        // Print the result
        if (containsValue) {
            System.out.println("The map contains the value " + valueToFind);
        } else {
            System.out.println("The map does not contain the value " + valueToFind);
        }


        // Example with a value that is NOT present
        valueToFind = 5;  //A Value not in the map
        containsValue = map.containsValue(valueToFind);
         if (containsValue) {
            System.out.println("The map contains the value " + valueToFind);
        } else {
            System.out.println("The map does not contain the value " + valueToFind);
        }
    }
}
