import java.util.HashMap;
import java.util.Map;

public class ContainsValue {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        // Value to search for
        int valueToFind = 2;

        // Test if the map contains the value
        if (map.containsValue(valueToFind)) {
            System.out.println("The map contains the value " + valueToFind);
        } else {
            System.out.println("The map does not contain the value " + valueToFind);
        }


        // Another Example - showing how null is handled:
        map.put("grape", null); // Add a key with a null value

        if (map.containsValue(null)) {
            System.out.println("The map contains the value null");
        } else {
            System.out.println("The map does not contain the value null"); 
        }



        //Example with a different value

         valueToFind = 5; // A value not in the map
        if (map.containsValue(valueToFind)) {
            System.out.println("The map contains the value " + valueToFind);
        } else {
            System.out.println("The map does not contain the value " + valueToFind);
        }
    }
}
