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
        String valueToFind = "red";

        // Check if the map contains a mapping for the specified value
        boolean containsValue = map.containsValue(valueToFind);

        if (containsValue) {
            System.out.println("The map contains a mapping for the value: " + valueToFind);

            //If you need to find the key associated with the value (though the question doesn't require it):
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (valueToFind.equals(entry.getValue())) {
                    System.out.println("Key associated with the value '" + valueToFind + "': " + entry.getKey());
                    break; // Assuming you only want the first matching key.
                }
            }


        } else {
            System.out.println("The map does not contain a mapping for the value: " + valueToFind);
        }


        // Test with another value
        valueToFind = "orange";
        containsValue = map.containsValue(valueToFind);

        if (containsValue) {
            System.out.println("The map contains a mapping for the value: " + valueToFind);
        } else {
            System.out.println("The map does not contain a mapping for the value: " + valueToFind);
        }

    }
}
