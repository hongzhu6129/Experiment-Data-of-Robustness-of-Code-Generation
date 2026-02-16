import java.util.NavigableMap;
import java.util.TreeMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap (you can use other NavigableMap implementations as well)
        NavigableMap<Integer, String> originalMap = new TreeMap<>();

        // Populate the map with some data
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        originalMap.put(3, "Three");
        originalMap.put(4, "Four");
        originalMap.put(5, "Five");
        originalMap.put(6, "Six");

        // Define the start and end keys for the submap (inclusive)
        int fromKey = 2;
        int toKey = 5;

        // Get the submap. 
        // Note: subMap()'s inclusivity/exclusivity of boundaries can be controlled with extra boolean parameters.  
        //  See documentation for details: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/NavigableMap.html#subMap(K,boolean,K,boolean)
        NavigableMap<Integer, String> subMap = originalMap.subMap(fromKey, true, toKey, true);

        // Print the submap
        System.out.println("Submap (inclusive): " + subMap);



        // Example demonstrating exclusive upper bound:
        NavigableMap<Integer, String> subMapExclusive = originalMap.subMap(fromKey, true, toKey, false);
        System.out.println("Submap (exclusive upper bound): " + subMapExclusive);



        // Handling cases where keys might not exist:
        fromKey = 0; // Key not in map
        toKey = 7;  // Key not in map

        // The subMap operation gracefully handles cases where keys might not exist.
        //  It acts as if it finds the closest existing keys within the range.
        NavigableMap<Integer, String> subMapWithMissingKeys = originalMap.subMap(fromKey, true, toKey, true);
        System.out.println("Submap with missing keys: " + subMapWithMissingKeys); // will contain all entries



        // What to do if the range is invalid (e.g. fromKey > toKey) is up to the developer.
        //  The subMap method *might* return an empty map, but this is implementation dependent.
        //   It's better to explicitly check for invalid ranges beforehand.
        fromKey = 6;
        toKey = 1;
        if (fromKey > toKey) {
            System.out.println("Invalid range. fromKey cannot be greater than toKey.");
        } else {
            NavigableMap<Integer, String> potentiallyEmptySubMap = originalMap.subMap(fromKey, true, toKey, true);
            System.out.println("Submap with invalid range (likely empty): " + potentiallyEmptySubMap);
        }



    }
}
