import java.util.TreeMap;
import java.util.SortedMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs
        TreeMap<Integer, String> map = new TreeMap<>();

        // Populate the map with some data
        map.put(10, "Ten");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");

        // Given key
        int givenKey = 40; 

        // Get the portion of the map whose keys are strictly less than givenKey
        SortedMap<Integer, String> subMap = map.headMap(givenKey);  // Important: headMap is exclusive of the 'toKey'

        // Print the submap
        System.out.println("Original Map: " + map);
        System.out.println("Submap with keys strictly less than " + givenKey + ": " + subMap);


        // Example with a key that doesn't exist in the map:
        givenKey = 25;
        subMap = map.headMap(givenKey);
        System.out.println("Submap with keys strictly less than " + givenKey + ": " + subMap);


        // Example with the smallest key:  demonstrates that headMap returns an empty map if no keys are smaller
        givenKey = 10;
        subMap = map.headMap(givenKey);
        System.out.println("Submap with keys strictly less than " + givenKey + ": " + subMap);

       // Example demonstrating modification to the submap affects the original map (because it's a view, not a copy)
        givenKey = 40;
        subMap = map.headMap(givenKey);
        subMap.put(5, "Five"); // This will be reflected in the original map because subMap is a view.
        System.out.println("Original Map after modification through subMap: " + map);
        

    }
}
