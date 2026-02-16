import java.util.TreeMap;

public class SearchTreeMap {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Populate the TreeMap with some sample data
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");

        // Value to search for
        Integer searchKey = 3;

        // Search for the value using containsKey()
        if (treeMap.containsKey(searchKey)) {
            System.out.println("Value " + searchKey + " found in the TreeMap.");
        } else {
            System.out.println("Value " + searchKey + " not found in the TreeMap.");
        }



         // Example searching for a non-existent key
        searchKey = 6; 
        if (treeMap.containsKey(searchKey)) {
            System.out.println("Value " + searchKey + " found in the TreeMap.");
        } else {
            System.out.println("Value " + searchKey + " not found in the TreeMap.");
        }
    }
}
