import java.util.NavigableMap;
import java.util.TreeMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap (you can use any SortedMap implementation)
        NavigableMap<Integer, String> originalMap = new TreeMap<>();

        // Populate the map with some data
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        originalMap.put(3, "Three");
        originalMap.put(4, "Four");
        originalMap.put(5, "Five");
        originalMap.put(6, "Six");
        originalMap.put(7, "Seven");


        // Define the start and end keys for the submap
        int startKey = 2;  // Inclusive
        int endKey = 5;    // Inclusive


        // Get the submap. The subMap method is specifically for NavigableMap.
        // For a general SortedMap, use subMap, but be mindful of inclusivity/exclusivity based on the implementation.
        NavigableMap<Integer, String> subMap = originalMap.subMap(startKey, true, endKey, true); 


        // Print the original map and the submap
        System.out.println("Original Map: " + originalMap);
        System.out.println("Submap: " + subMap);



        // Example with exclusive end key
        NavigableMap<Integer, String> subMapExclusive = originalMap.subMap(startKey, true, endKey, false); // Exclude 5
        System.out.println("Submap (Exclusive End Key): " + subMapExclusive);


        // Important Note about changes to the submap:
        // Changes made to the submap will be reflected in the original map, and vice-versa.
        subMap.put(3, "Three Modified");
        System.out.println("Original Map after modification through submap: " + originalMap);

        // If you need an independent copy, use:
        NavigableMap<Integer, String> independentSubmap = new TreeMap<>(originalMap.subMap(startKey, true, endKey, true));


    }
}
