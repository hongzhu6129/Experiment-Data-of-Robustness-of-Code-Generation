import java.util.HashMap;
import java.util.Map;

public class CheckMapValueCoverage {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        // Value to check for coverage
        int valueToCheck = 2;

        // Check if the map contains the value
        boolean containsValue = map.containsValue(valueToCheck);

        // Print the result
        if (containsValue) {
            System.out.println("The map contains the value " + valueToCheck);
        } else {
            System.out.println("The map does not contain the value " + valueToCheck);
        }


        //More comprehensive testing:

         valueToCheck = 4; // A value not in the map
         containsValue = map.containsValue(valueToCheck);
         if (containsValue) {
             System.out.println("The map contains the value " + valueToCheck);
         } else {
            System.out.println("The map does not contain the value " + valueToCheck);
         }


        // Testing with a null value (important for understanding map behavior).
        map.put("grape", null);  // Adding a key with a null value
        valueToCheck = 0; //check for zero, not in the map

        containsValue = map.containsValue(null); // Checking for null specifically

        if (containsValue) {
             System.out.println("The map contains the null value.");
         } else {
            System.out.println("The map does not contain the null value.");
         }

         containsValue = map.containsValue(valueToCheck);

         if (containsValue) {
             System.out.println("The map contains the value " + valueToCheck);
         } else {
            System.out.println("The map does not contain the value " + valueToCheck);
         }

    }
}
