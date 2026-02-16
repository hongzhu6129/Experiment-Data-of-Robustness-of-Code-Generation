import java.util.NavigableMap;
import java.util.TreeMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap (which implements NavigableMap)
        NavigableMap<Integer, String> originalMap = new TreeMap<>();

        // Populate the map with some sample data
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        originalMap.put(3, "Three");
        originalMap.put(4, "Four");
        originalMap.put(5, "Five");
        originalMap.put(6, "Six");


        // Get a portion of the map whose keys are greater than or equal to 3 (inclusive)
        int fromKey = 3; 
        NavigableMap<Integer, String> subMapInclusive = originalMap.tailMap(fromKey);

        // Print the submap (inclusive)
        System.out.println("Submap (inclusive): " + subMapInclusive);


        // Get a portion of the map whose keys are strictly greater than 3 (exclusive)
        NavigableMap<Integer, String> subMapExclusive = originalMap.tailMap(fromKey, false);


        // Print the submap (exclusive)
        System.out.println("Submap (exclusive): " + subMapExclusive);



        // Example with a non-existent key:
        int nonExistentKey = 7;
        NavigableMap<Integer, String> subMapNonExistent = originalMap.tailMap(nonExistentKey);
        System.out.println("Submap (non-existent key): " + subMapNonExistent); // Will return an empty map in this case


        // Example with String keys
        NavigableMap<String, Integer> stringMap = new TreeMap<>();
        stringMap.put("A", 1);
        stringMap.put("B", 2);
        stringMap.put("C", 3);
        stringMap.put("D", 4);

        String fromStringKey = "B";
        NavigableMap<String, Integer> stringSubMap = stringMap.tailMap(fromStringKey);
        System.out.println("String Submap: " + stringSubMap);

    }
}
