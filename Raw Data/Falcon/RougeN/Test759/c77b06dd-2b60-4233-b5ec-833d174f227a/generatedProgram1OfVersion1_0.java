import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.SortedMap;

public class SubMapExample {

    public static void main(String[] args) {

        // Create a TreeMap (you can use other NavigableMap implementations)
        NavigableMap<Integer, String> originalMap = new TreeMap<>();

        // Populate the map with some data
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        originalMap.put(3, "Three");
        originalMap.put(4, "Four");
        originalMap.put(5, "Five");
        originalMap.put(6, "Six");

        // Define the start and end keys for the submap
        int fromKey = 2;  // Inclusive
        int toKey = 5;    // Inclusive 

        // Get the submap (inclusive of both fromKey and toKey)
        SortedMap<Integer, String> subMapInclusive = originalMap.subMap(fromKey, true, toKey, true);


        // Get the submap (exclusive of toKey)
        SortedMap<Integer, String> subMapExclusiveTo = originalMap.subMap(fromKey, true, toKey, false);

         // Get the submap (exclusive of fromKey)
        SortedMap<Integer, String> subMapExclusiveFrom = originalMap.subMap(fromKey, false, toKey, true);

        // Get the submap (exclusive of both fromKey and toKey)
        SortedMap<Integer, String> subMapExclusiveBoth = originalMap.subMap(fromKey, false, toKey, false);



        // Print the original map
        System.out.println("Original Map: " + originalMap);

        // Print the submaps
        System.out.println("Submap (inclusive): " + subMapInclusive);
        System.out.println("Submap (exclusive toKey): " + subMapExclusiveTo);
        System.out.println("Submap (exclusive fromKey): " + subMapExclusiveFrom);
        System.out.println("Submap (exclusive both): " + subMapExclusiveBoth);



        // IMPORTANT: Changes to the submap reflect in the original map (and vice-versa)
        subMapInclusive.put(3, "Modified Three"); 
        System.out.println("Original Map after modification via submap: " + originalMap);



    }
}
