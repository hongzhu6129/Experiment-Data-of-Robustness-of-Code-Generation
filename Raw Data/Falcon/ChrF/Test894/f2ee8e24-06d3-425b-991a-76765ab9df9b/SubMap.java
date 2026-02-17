import java.util.Map;
import java.util.TreeMap;

public class SubMap {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        int givenKey = 4;

        // Get the submap with keys strictly less than givenKey
        Map<Integer, String> subMap = map.headMap(givenKey);


        // Print the submap
        System.out.println("Original map: " + map);
        System.out.println("Submap with keys less than " + givenKey + ": " + subMap);


        // Another example with a non-existent key:
        givenKey = 10; // Key greater than any in the map
        subMap = map.headMap(givenKey);
        System.out.println("Submap with keys less than " + givenKey + ": " + subMap); //returns the whole map as all keys are smaller

        // Example with String keys
        TreeMap<String, Integer> stringMap = new TreeMap<>();
        stringMap.put("apple", 1);
        stringMap.put("banana", 2);
        stringMap.put("cherry", 3);
        String givenStringKey = "cherry";

        Map<String, Integer> stringSubMap = stringMap.headMap(givenStringKey);
        System.out.println("Original string map: " + stringMap);
        System.out.println("String Submap with keys less than " + givenStringKey + ": " + stringSubMap);
    }
}
