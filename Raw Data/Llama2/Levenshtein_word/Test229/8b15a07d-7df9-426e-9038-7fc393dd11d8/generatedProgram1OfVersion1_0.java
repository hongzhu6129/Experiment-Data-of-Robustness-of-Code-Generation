import java.util.TreeMap;
import java.util.SortedMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Populate the TreeMap with some sample data
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");
        treeMap.put(6, "Six");

        // Key to find the portion of the map less than
        int toKey = 4;

        // Get the portion of the map whose keys are strictly less than toKey
        SortedMap<Integer, String> subMap = treeMap.headMap(toKey);


        // Print the submap
        System.out.println("Submap with keys strictly less than " + toKey + ":");
        System.out.println(subMap);


        // Example with String keys
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("A", 1);
        stringTreeMap.put("B", 2);
        stringTreeMap.put("C", 3);
        stringTreeMap.put("D", 4);

        String stringToKey = "C";
        SortedMap<String, Integer> stringSubMap = stringTreeMap.headMap(stringToKey);

        System.out.println("\nSubmap with string keys strictly less than " + stringToKey + ":");
        System.out.println(stringSubMap);



        // Handle cases where the map is empty or the toKey is the smallest key
        TreeMap<Integer, String> emptyMap = new TreeMap<>();
        int emptyToKey = 5;
        SortedMap<Integer, String> emptySubMap = emptyMap.headMap(emptyToKey); // Returns an empty map
        System.out.println("\nSubmap of empty map: " + emptySubMap);

        TreeMap<Integer, String> smallestKeyMap = new TreeMap<>();
        smallestKeyMap.put(5, "Five");
        int smallestToKey = 5; 
        SortedMap<Integer, String> smallestKeySubMap = smallestKeyMap.headMap(smallestToKey);  // Returns an empty map
        System.out.println("\nSubmap with toKey equal to smallest key: " + smallestKeySubMap);
    }
}
