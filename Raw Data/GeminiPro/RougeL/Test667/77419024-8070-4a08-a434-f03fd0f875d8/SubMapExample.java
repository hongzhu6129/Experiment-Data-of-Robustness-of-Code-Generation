import java.util.TreeMap;
import java.util.SortedMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap (sorted map)
        TreeMap<Integer, String> map = new TreeMap<>();

        // Populate the map
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");

        // Key to use as the upper bound
        int toKey = 4;

        // Get the submap with keys less than or equal to toKey (inclusive)
        SortedMap<Integer, String> subMapInclusive = map.headMap(toKey, true);

        // Get the submap with keys strictly less than toKey (exclusive)
        SortedMap<Integer, String> subMapExclusive = map.headMap(toKey);

        // Print the submaps
        System.out.println("Inclusive Submap (<= " + toKey + "): " + subMapInclusive);
        System.out.println("Exclusive Submap (< " + toKey + "): " + subMapExclusive);


        // Example with String keys (natural ordering)
        TreeMap<String, Integer> stringMap = new TreeMap<>();
        stringMap.put("Apple", 1);
        stringMap.put("Banana", 2);
        stringMap.put("Orange", 3);
        stringMap.put("Peach", 4);

        String toKeyString = "Orange"; // Inclusive

        SortedMap<String, Integer> stringSubMap = stringMap.headMap(toKeyString, true);

        System.out.println("String Submap (<= \"" + toKeyString + "\"): " + stringSubMap);

    }
}
