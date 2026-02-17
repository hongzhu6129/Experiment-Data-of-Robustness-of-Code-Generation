import java.util.NavigableMap;
import java.util.TreeMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap (implements NavigableMap)
        NavigableMap<Integer, String> originalMap = new TreeMap<>();

        // Populate the map with some data
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        originalMap.put(3, "Three");
        originalMap.put(4, "Four");
        originalMap.put(5, "Five");
        originalMap.put(6, "Six");
        originalMap.put(7, "Seven");


        // Define the start and end keys for the submap (inclusive start, exclusive end)
        int startKey = 2;
        int endKey = 6;


        // Get the submap.  .subMap handles nulls correctly for fromKey and toKey, 
        // and whether to include/exclude them.
        NavigableMap<Integer, String> subMap = originalMap.subMap(startKey, true, endKey, false);


        // Print the original map and the submap
        System.out.println("Original Map: " + originalMap);
        System.out.println("Submap from " + startKey + " (inclusive) to " + endKey + " (exclusive): " + subMap);


        // Demonstrate that changes to the submap affect the original map (and vice-versa)
        subMap.put(3, "Three Modified"); // Modify an existing entry in the submap
        subMap.put(5, "Five Added"); // Adding within the submap range

        // This will throw an IllegalArgumentException because 8 is outside of the original subMap's defined range.
        try {
            subMap.put(8, "Eight - out of range!"); // Try to add outside the submap range
        }catch(IllegalArgumentException e){
            System.out.println("Caught expected exception: " + e.getMessage());
        }


        System.out.println("Original Map after submap modifications: " + originalMap);
        System.out.println("Submap after modifications: " + subMap);

        //Removing from the submap removes from the original:
        subMap.remove(3);
        System.out.println("Original Map after removing from submap: " + originalMap);
        System.out.println("Submap after removing: " + subMap);


    }
}
