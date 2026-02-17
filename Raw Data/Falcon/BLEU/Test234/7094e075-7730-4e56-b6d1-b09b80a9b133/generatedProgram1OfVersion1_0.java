import java.util.TreeMap;
import java.util.SortedMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap (which maintains sorted order of keys)
        TreeMap<Integer, String> map = new TreeMap<>();

        // Populate the map with some sample data
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");
        map.put(11, "Eleven");


        // Key up to which we want the submap (exclusive)
        int givenKey = 7;


        // Get the portion of the map whose keys are strictly less than givenKey
        SortedMap<Integer, String> subMap = map.headMap(givenKey);


        // Print the submap
        System.out.println("Original Map: " + map);
        System.out.println("Submap with keys strictly less than " + givenKey + ": " + subMap);

        // Example with String keys:
        TreeMap<String, Integer> stringKeyMap = new TreeMap<>();
        stringKeyMap.put("apple", 1);
        stringKeyMap.put("banana", 2);
        stringKeyMap.put("orange", 3);
        stringKeyMap.put("pear", 4);

        String givenStringKey = "orange";
        SortedMap<String, Integer> stringSubMap = stringKeyMap.headMap(givenStringKey);

        System.out.println("\nString Key Map: " + stringKeyMap);
        System.out.println("String Submap with keys strictly less than '" + givenStringKey + "': " + stringSubMap);


    }
}
