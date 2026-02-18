import java.util.NavigableMap;
import java.util.TreeMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap (implementation of NavigableMap)
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
        int startKey = 2;  // Inclusive start key
        int endKey = 5;    // Exclusive end key


        // Get the submap.  .subMap(startKey, true, endKey, false) gets the portion
        // from startKey (inclusive) to endKey (exclusive)
        NavigableMap<Integer, String> subMap = originalMap.subMap(startKey, true, endKey, false);


        // Print the original map
        System.out.println("Original Map: " + originalMap);

        // Print the submap
        System.out.println("Submap: " + subMap);


        // Example using a set as the starting point (inclusive)
        NavigableMap<Integer, String> subMapFromSet = originalMap.tailMap(3, true);

        System.out.println("Submap from set (inclusive): " + subMapFromSet);

          // Example using a set as the starting point (exclusive)
        NavigableMap<Integer, String> subMapFromSetExclusive = originalMap.tailMap(3, false);

        System.out.println("Submap from set (exclusive): " + subMapFromSetExclusive);



    }
}
