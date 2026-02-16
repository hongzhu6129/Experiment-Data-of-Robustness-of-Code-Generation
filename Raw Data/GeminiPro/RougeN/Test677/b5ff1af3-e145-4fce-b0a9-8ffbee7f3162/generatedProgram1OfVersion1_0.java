import java.util.TreeMap;
import java.util.SortedMap;

public class TailMap {

    public static void main(String[] args) {
        // Create a TreeMap (TreeMap maintains sorted order of keys)
        TreeMap<Integer, String> map = new TreeMap<>();

        // Populate the map with some data
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");
        map.put(11, "Eleven");


        // Given key (e.g., 5)
        int givenKey = 5;

        // Get the portion of the map whose keys are greater than givenKey
        SortedMap<Integer, String> tailMap = map.tailMap(givenKey); 

        // Note: tailMap includes the given key.  If you want *strictly* greater, use:
        // SortedMap<Integer, String> tailMapExclusive = map.tailMap(givenKey + 1); // If keys are integers.
       // For other key types, you'll need to find a way to get the "next" key, which might involve iterators or specific logic depending on the key type.


        // Print the tail map
        System.out.println("Original Map: " + map);
        System.out.println("Tail Map (inclusive): " + tailMap);


        // Example with String keys (you must ensure they are comparable, e.g., using String's natural ordering)
        TreeMap<String, Integer> stringMap = new TreeMap<>();
        stringMap.put("Apple", 1);
        stringMap.put("Banana", 2);
        stringMap.put("Orange", 3);
        String givenStringKey = "Banana";

        SortedMap<String, Integer> stringTailMap = stringMap.tailMap(givenStringKey);

        System.out.println("\nString Keyed Map Example:");
        System.out.println("Original Map: " + stringMap);
        System.out.println("Tail Map (inclusive): " + stringTailMap);


         // Example for exclusive tailmap with String keys - you might need custom logic depending on how "next" is defined for your key type:
        String nextKey = stringMap.higherKey(givenStringKey);  // higherKey gets the next key 
        if (nextKey != null) {
             SortedMap<String, Integer> stringTailMapExclusive = stringMap.tailMap(nextKey);
             System.out.println("Tail Map (exclusive): " + stringTailMapExclusive);
        } else {
             System.out.println("Given key is the highest; no exclusive tail map exists.");
        }
    }
}
