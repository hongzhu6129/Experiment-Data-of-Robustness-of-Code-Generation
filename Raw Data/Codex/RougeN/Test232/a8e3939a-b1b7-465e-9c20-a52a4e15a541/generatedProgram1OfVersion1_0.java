import java.util.HashMap;
import java.util.Map;

public class RemoveAllMappings {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);

        System.out.println("Original map: " + myMap);

        // Remove all mappings
        myMap.clear();

        System.out.println("Map after removing all mappings: " + myMap); 
    }
}
