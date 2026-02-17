import java.util.TreeMap;
import java.util.SortedMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap (sorted by natural key order)
        TreeMap<Integer, String> map = new TreeMap<>();

        // Populate the map with some data
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");
        map.put(11, "Eleven");


        // Key from which we want to get the submap (exclusive - does not include the key itself)
        int fromKey = 5;

        // Get the submap containing keys greater than fromKey
        SortedMap<Integer, String> subMap = map.tailMap(fromKey);


        // Print the submap
        System.out.println("Original Map: " + map);
        System.out.println("Submap (keys > " + fromKey + "): " + subMap);


        // Example with inclusive submap (includes the fromKey)
        SortedMap<Integer, String> inclusiveSubMap = map.tailMap(fromKey, true);  // Use tailMap with inclusive=true
        System.out.println("Inclusive Submap (keys >= " + fromKey + "): " + inclusiveSubMap);



        // Example with a toKey (exclusive)
        int toKey = 9;
        SortedMap<Integer,String> subMapWithToKey = map.subMap(fromKey, toKey); // Keys > fromkey and < toKey
        System.out.println("Submap (keys > " + fromKey + " and < " + toKey + "): " + subMapWithToKey);


        //Example with inclusive toKey
        SortedMap<Integer,String> inclusiveSubMapWithToKey = map.subMap(fromKey, true, toKey, true); // Keys >= fromkey and <= toKey
        System.out.println("Inclusive Submap (keys >= " + fromKey + " and <= " + toKey + "): " + inclusiveSubMapWithToKey);
    }
}
