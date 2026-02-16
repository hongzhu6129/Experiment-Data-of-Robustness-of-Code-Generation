import java.util.HashMap;
import java.util.Map;

public class RemoveAllMappings {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Apple", 1);
        myMap.put("Banana", 2);
        myMap.put("Orange", 3);

        System.out.println("Original map: " + myMap);

        // Remove all mappings
        myMap.clear(); 

        System.out.println("Map after removing all mappings: " + myMap);


        // Example with a potentially null map (good practice to handle nulls)
        Map<String, Integer> anotherMap = null;

        if (anotherMap != null) { // Avoid NullPointerException if the map is null
             anotherMap.clear();
        }

        System.out.println("Another map (potentially null) after clearing: " + anotherMap);

    }
}
