import java.util.HashMap;
import java.util.Map;

public class ClearMap {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);

        // Print the map before clearing
        System.out.println("Map before clearing: " + myMap);

        // Remove all mappings
        myMap.clear();

        // Print the map after clearing
        System.out.println("Map after clearing: " + myMap);
    }
}
