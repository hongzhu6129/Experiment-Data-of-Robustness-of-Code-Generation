import java.util.HashMap;
import java.util.Map;

public class CheckValueMap {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, String> map = new HashMap<>();
        map.put("apple", "red");
        map.put("banana", "yellow");
        map.put("grape", "purple");


        // Test if the map contains a mapping for the specified value
        String valueToFind = "red";
        boolean containsValue = map.containsValue(valueToFind);

        if (containsValue) {
            System.out.println("The map contains the value: " + valueToFind);
        } else {
            System.out.println("The map does not contain the value: " + valueToFind);
        }


        valueToFind = "orange"; // Value not present
        containsValue = map.containsValue(valueToFind);

        if (containsValue) {
            System.out.println("The map contains the value: " + valueToFind);
        } else {
            System.out.println("The map does not contain the value: " + valueToFind);
        }


        // Demonstrating with null values (allowed in HashMap values)
        map.put("kiwi", null);  // Add a null value


        valueToFind = null;
        containsValue = map.containsValue(valueToFind);

        if (containsValue) {
            System.out.println("The map contains the value: null");
        } else {
            System.out.println("The map does not contain the value: null");
        }



    }
}
