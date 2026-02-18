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

        // Check if the map contains the value and print the result
        boolean containsValue = map.containsValue(valueToFind); 
        System.out.println("Map contains value " + valueToFind + ": " + containsValue);


        // Example with a value that is NOT in the map
        valueToFind = 5;
        containsValue = map.containsValue(valueToFind);
        System.out.println("Map contains value " + valueToFind + ": " + containsValue);


        //  Demonstrating with a different data type (String)
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "One");
        map2.put(2, "Two");

        String stringToFind = "Two";
        boolean containsString = map2.containsValue(stringToFind);
        System.out.println("Map contains string \"" + stringToFind + "\": " + containsString);


        stringToFind = "Three"; // Not in the map
        containsString = map2.containsValue(stringToFind);
        System.out.println("Map contains string \"" + stringToFind + "\": " + containsString);


    }
}
