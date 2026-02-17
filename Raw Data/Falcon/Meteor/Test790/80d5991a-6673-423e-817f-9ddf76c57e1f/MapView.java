import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapView {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("apple", 1);
        originalMap.put("banana", 2);
        originalMap.put("orange", 3);

        // Create a view of the mappings (entrySet returns a Set view)
        Set<Map.Entry<String, Integer>> mapView = originalMap.entrySet();


        // Demonstrate that changes through the view affect the original map
        System.out.println("Original Map before modification: " + originalMap);
        System.out.println("Map View before modification: " + mapView);

        // Modify the map through the view (e.g., remove an entry)
        mapView.remove(Map.entry("banana", 2)); // Use Map.entry() for proper comparison.

        System.out.println("Original Map after modification: " + originalMap); // banana is gone
        System.out.println("Map View after modification: " + mapView);       // banana is gone


        // Iterating through the view and printing key-value pairs
        System.out.println("Iterating and printing key-value pairs through the view:");
        for (Map.Entry<String, Integer> entry : mapView) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }



        // Demonstrate that changes to the original affect the view
        originalMap.put("grape", 4);
        System.out.println("Original Map after adding grape: " + originalMap);  //grape is added
        System.out.println("Map View after adding grape: " + mapView);        // grape is added


    }
}
