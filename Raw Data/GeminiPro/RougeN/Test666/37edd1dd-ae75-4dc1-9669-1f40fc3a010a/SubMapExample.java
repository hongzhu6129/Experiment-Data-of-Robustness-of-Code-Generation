import java.util.TreeMap;
import java.util.SortedMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs.
        TreeMap<Integer, String> map = new TreeMap<>();

        // Populate the TreeMap with some data.
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");


        // Given key (exclusive upper bound).
        int givenKey = 4;

        // Get the portion of the map whose keys are strictly less than givenKey.
        SortedMap<Integer, String> subMap = map.headMap(givenKey); 

        // Print the submap.
        System.out.println("Original Map: " + map);
        System.out.println("Submap with keys less than " + givenKey + ": " + subMap);

        // Example with a non-existent key
        givenKey = 7;  // A key not present in the original map
        subMap = map.headMap(givenKey);
        System.out.println("Submap with keys less than " + givenKey + ": " + subMap); // Returns everything less than 7 (which is the entire original map in this case)

        givenKey = 0; // A key smaller than any in the map.
        subMap = map.headMap(givenKey);
        System.out.println("Submap with keys less than " + givenKey + ": " + subMap); // Returns an empty map.


    }
}
