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


        // Define the start and end keys for the submap (inclusive)
        int startKey = 2;
        int endKey = 5;

        // Get the submap using subMap()  
        NavigableMap<Integer, String> subMap = originalMap.subMap(startKey, true, endKey, true);

        // Print the original map and the submap
        System.out.println("Original Map: " + originalMap);
        System.out.println("Submap: " + subMap);



        //Example with Strings (keys must be Comparable)
        NavigableMap<String, Integer> stringMap = new TreeMap<>();
        stringMap.put("apple", 1);
        stringMap.put("banana", 2);
        stringMap.put("cherry", 3);
        stringMap.put("date", 4);
        stringMap.put("elderberry", 5);

        String startString = "banana";
        String endString = "date";

        NavigableMap<String, Integer> stringSubMap = stringMap.subMap(startString, true, endString, true);
        System.out.println("\nString Map: " + stringMap);
        System.out.println("String Submap: " + stringSubMap);



        // Handling cases where keys might not exist:
        // It's generally a good idea to check if keys exist before calling subMap, 
        // especially if you are using inclusive endpoints and nulls are not allowed
        // or when the fromKey is greater than the toKey.  The behavior can be complex
        // in these edge cases (see the NavigableMap documentation).


        int start = 8; // Key does not exist
        int end = 10;   // Key does not exist

        if (originalMap.containsKey(start) && originalMap.containsKey(end) && start <= end) {
             // Only create the submap if both keys exist AND start <= end
            NavigableMap<Integer, String> subMap2 = originalMap.subMap(start, true, end, true);
            System.out.println("\nSubmap2 (potentially empty): " + subMap2); // Likely empty in this case
        } else {
            System.out.println("\nCannot create Submap2. Invalid start/end keys.");
        }
    }
}
