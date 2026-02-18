import java.util.TreeMap;
import java.util.SortedMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap (which maintains sorted order)
        TreeMap<Integer, String> map = new TreeMap<>();

        // Populate the map with some data
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");
        map.put(11, "Eleven");


        // Given key (exclusive upper bound)
        int givenKey = 7;

        // Get the submap with keys strictly less than givenKey
        SortedMap<Integer, String> subMap = map.headMap(givenKey);


        // Print the submap
        System.out.println("Submap with keys less than " + givenKey + ":");
        System.out.println(subMap);



        //Example with String keys (natural ordering)
        TreeMap<String, Integer> stringMap = new TreeMap<>();
        stringMap.put("apple", 1);
        stringMap.put("banana", 2);
        stringMap.put("grape", 3);
        stringMap.put("orange", 4);


        String givenStringKey = "grape";
        SortedMap<String, Integer> stringSubMap = stringMap.headMap(givenStringKey);


        System.out.println("\nSubmap with string keys less than " + givenStringKey + ":");
        System.out.println(stringSubMap);


        // Handling cases where the given key doesn't exist:
        int nonExistentKey = 2; // This key is not present in the original map.

        SortedMap<Integer, String> subMap2 = map.headMap(nonExistentKey);
        System.out.println("\nSubmap with keys less than " + nonExistentKey + " (non-existent key):");
        System.out.println(subMap2); // Will still work correctly; returns keys strictly less.
    }
}

