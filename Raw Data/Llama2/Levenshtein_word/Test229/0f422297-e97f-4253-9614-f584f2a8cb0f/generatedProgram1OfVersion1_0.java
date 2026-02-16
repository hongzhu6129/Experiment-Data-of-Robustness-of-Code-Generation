import java.util.TreeMap;
import java.util.SortedMap;

public class SubMap {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        int givenKey = 4; // The key up to which we want the submap (exclusive)


        SortedMap<Integer, String> subMap = map.headMap(givenKey);


        // Print the submap
        System.out.println("Original Map: " + map);
        System.out.println("Submap with keys less than " + givenKey + ": " + subMap);


        // Another example with a String key
        TreeMap<String, Integer> stringMap = new TreeMap<>();
        stringMap.put("apple", 1);
        stringMap.put("banana", 2);
        stringMap.put("cherry", 3);
        stringMap.put("date", 4);

        String givenStringKey = "cherry";
        SortedMap<String, Integer> stringSubMap = stringMap.headMap(givenStringKey);

        System.out.println("\nOriginal String Map: " + stringMap);
        System.out.println("String Submap with keys less than " + givenStringKey + ": " + stringSubMap);


    }
}
