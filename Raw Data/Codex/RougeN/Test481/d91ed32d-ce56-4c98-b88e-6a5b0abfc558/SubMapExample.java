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


        // Example 1: Get submap where keys are strictly greater than 3
        int fromKey = 3;
        SortedMap<Integer, String> subMapExclusive = map.tailMap(fromKey, false); 
        System.out.println("Submap (exclusive): " + subMapExclusive);


        // Example 2: Get submap where keys are greater than or equal to 3
        fromKey = 3;
        SortedMap<Integer, String> subMapInclusive = map.tailMap(fromKey); //inclusive by default
        System.out.println("Submap (inclusive): " + subMapInclusive);


        // Example 3:  Demonstrating with Strings (natural ordering)
        TreeMap<String, Integer> stringMap = new TreeMap<>();
        stringMap.put("Apple", 1);
        stringMap.put("Banana", 2);
        stringMap.put("Cherry", 3);
        stringMap.put("Date", 4);

        String fromStringKey = "Banana";
        SortedMap<String, Integer> stringSubMap = stringMap.tailMap(fromStringKey);
        System.out.println("String Submap: " + stringSubMap);

    }
}
