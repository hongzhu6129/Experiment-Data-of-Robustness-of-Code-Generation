import java.util.NavigableMap;
import java.util.TreeMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap
        NavigableMap<Integer, String> originalMap = new TreeMap<>();

        // Populate the map
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        originalMap.put(3, "Three");
        originalMap.put(4, "Four");
        originalMap.put(5, "Five");
        originalMap.put(6, "Six");


        // Define the start and end keys for the submap
        int startKey = 2; // Inclusive
        int endKey = 5;   // Inclusive

        // Get the submap using subMap()
        NavigableMap<Integer, String> subMap = originalMap.subMap(startKey, true, endKey, true);


        // Print the original map
        System.out.println("Original Map: " + originalMap);

        // Print the submap
        System.out.println("Submap: " + subMap);


        // Example with exclusive end key
        NavigableMap<Integer, String> subMapExclusive = originalMap.subMap(startKey, true, endKey, false); // Exclude end key
        System.out.println("Submap (Exclusive End Key): " + subMapExclusive);


        //  Handle cases where keys might not exist:
        startKey = 1;
        endKey = 10; // Key 10 doesn't exist, but the submap will still work up to the largest key present

        NavigableMap<Integer, String> subMapExtended = originalMap.subMap(startKey, true, endKey, true);
        System.out.println("Submap (Extended range): " + subMapExtended);



    }
}
