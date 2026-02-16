import java.util.HashMap;
import java.util.Map;

public class RemoveAllMappings {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Print the original map
        System.out.println("Original map: " + map);

        // Remove all mappings
        map.clear();

        // Print the map after removing all mappings
        System.out.println("Map after removing all mappings: " + map); 
    }
}
