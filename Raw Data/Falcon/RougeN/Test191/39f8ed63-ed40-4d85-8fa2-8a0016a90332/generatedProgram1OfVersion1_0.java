import java.util.HashMap;
import java.util.Map;

public class CheckValueMap {

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

             // Visualization (simple example - print keys associated with the value)
            System.out.print("Keys associated with the value: ");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(valueToFind)) {
                    System.out.print(entry.getKey() + " ");
                }
            }
            System.out.println();


        } else {
            System.out.println("The map does not contain the value " + valueToFind);
        }


        //Another example with no matching value
        valueToFind = 5;  // A value NOT in the map
        containsValue = map.containsValue(valueToFind);

        if (containsValue) {
            System.out.println("The map contains the value " + valueToFind);
        } else {
            System.out.println("The map does not contain the value " + valueToFind);
        }


    }
}
