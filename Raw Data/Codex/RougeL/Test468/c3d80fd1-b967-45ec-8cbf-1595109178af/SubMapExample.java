import java.util.NavigableMap;
import java.util.TreeMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap (you can use other NavigableMap implementations too)
        NavigableMap<Integer, String> originalMap = new TreeMap<>();

        // Populate the map with some sample data
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        originalMap.put(3, "Three");
        originalMap.put(4, "Four");
        originalMap.put(5, "Five");
        originalMap.put(6, "Six");

        // Define the start and end keys for the submap (inclusive)
        int fromKey = 2;
        int toKey = 5;

        // Get the submap. subMap() is inclusive of the fromKey and exclusive of the toKey.
        // If you want the toKey inclusive, use the subMap(fromKey, true, toKey, true) overload.
        NavigableMap<Integer, String> subMap = originalMap.subMap(fromKey, true, toKey, true);


        // Print the original map and the submap
        System.out.println("Original Map: " + originalMap);
        System.out.println("Submap from " + fromKey + " to " + toKey + ": " + subMap);



        // Example with String keys:
        NavigableMap<String, Integer> stringMap = new TreeMap<>();
        stringMap.put("Apple", 1);
        stringMap.put("Banana", 2);
        stringMap.put("Cherry", 3);
        stringMap.put("Date", 4);
        stringMap.put("Elderberry", 5);

        String fromString = "Banana";
        String toString = "Date";

        NavigableMap<String, Integer> stringSubMap = stringMap.subMap(fromString, true, toString, true);
        System.out.println("\nOriginal String Map: " + stringMap);
        System.out.println("String Submap from " + fromString + " to " + toString + ": " + stringSubMap);
    }
}
