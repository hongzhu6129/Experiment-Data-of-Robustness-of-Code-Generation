import java.util.HashMap;
import java.util.Map;

public class CheckMapValueCoverage {

    public static void main(String[] args) {

        // Create a sample map
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Value to test for
        int valueToTest = 2;

        // Check if the map contains the value
        boolean containsValue = map.containsValue(valueToTest);

        // Print the result
        System.out.println("Map contains value " + valueToTest + ": " + containsValue);


        // Another example with a value not present
        valueToTest = 4;
        containsValue = map.containsValue(valueToTest);
        System.out.println("Map contains value " + valueToTest + ": " + containsValue);



        // Example with a null value
        map.put("Grape", null);  // Add a mapping with a null value

        valueToTest = 5; // A value not present
        containsValue = map.containsValue(valueToTest);
        System.out.println("Map contains value " + valueToTest + ": " + containsValue);


        containsValue = map.containsValue(null); // Check for the presence of null
        System.out.println("Map contains value null: " + containsValue);

    }
}
