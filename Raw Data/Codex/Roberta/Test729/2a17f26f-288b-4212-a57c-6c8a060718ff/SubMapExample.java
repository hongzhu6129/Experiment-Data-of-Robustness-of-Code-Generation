import java.util.TreeMap;
import java.util.SortedMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        int givenKey = 3;
        boolean inclusive = true; // Change to false for exclusive

        // Get the submap
        SortedMap<Integer, String> subMap =  getPortion(map, givenKey, inclusive);

        // Print the submap
        System.out.println("Original Map: " + map);
        System.out.println("Submap (keys <= " + givenKey + " - inclusive: " + inclusive + "): " + subMap);



        givenKey = 3;
        inclusive = false;

        subMap = getPortion(map, givenKey, inclusive);
         System.out.println("Submap (keys <= " + givenKey + " - inclusive: " + inclusive + "): " + subMap);


        givenKey = 0; // Test with a key smaller than any in the map
        inclusive = true;

        subMap = getPortion(map, givenKey, inclusive);
         System.out.println("Submap (keys <= " + givenKey + " - inclusive: " + inclusive + "): " + subMap);


    }


    public static SortedMap<Integer, String> getPortion(TreeMap<Integer, String> map, int givenKey, boolean inclusive) {
        if (inclusive) {
            return map.headMap(givenKey, true); // Inclusive
        } else {
            return map.headMap(givenKey, false); // Exclusive
        }
    }

}
