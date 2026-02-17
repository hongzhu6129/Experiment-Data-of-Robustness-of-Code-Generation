import java.util.HashMap;
import java.util.Map;

public class ClearMap {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Apple", 1);
        myMap.put("Banana", 2);
        myMap.put("Orange", 3);

        System.out.println("Original map: " + myMap);

        // Discard all mappings
        myMap.clear();

        System.out.println("Map after clearing: " + myMap); 
    }
}
