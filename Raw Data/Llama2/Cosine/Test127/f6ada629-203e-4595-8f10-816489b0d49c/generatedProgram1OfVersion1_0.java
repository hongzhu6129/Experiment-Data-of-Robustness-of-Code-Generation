import java.util.TreeMap;

public class TreeMapSearch {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add some elements to the TreeMap
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");

        // Search for specific keys
        searchKey(treeMap, 3);   // Key exists
        searchKey(treeMap, 6);   // Key does not exist


        // Search for a range of keys
        System.out.println("\nSearching for keys between 2 and 4 (inclusive):");
        searchRange(treeMap, 2, 4);


    }

    private static <K extends Comparable<K>, V> void searchKey(TreeMap<K, V> treeMap, K key) {
        if (treeMap.containsKey(key)) {
            System.out.println("Key " + key + " found. Value: " + treeMap.get(key));
        } else {
            System.out.println("Key " + key + " not found.");
        }
    }


    private static <K extends Comparable<K>, V> void searchRange(TreeMap<K, V> treeMap, K startKey, K endKey) {
        // subMap() returns a portion of the map from startKey (inclusive) to endKey (exclusive)
        // To include the endKey, we use headMap(endKey, true) which creates a view up to and *including* endKey.


        if (treeMap.comparator() == null &&  // Check if the TreeMap has a natural ordering 
             startKey.compareTo(endKey) <= 0  // and keys are in the right order (avoid IllegalArgumentException)
        ){   
            treeMap.subMap(startKey, true, endKey, true)
                   .forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        } else {
            System.out.println("Invalid key range or custom comparator used."); // Handle cases with custom comparators or reversed keys more gracefully.
        }
    }



}
