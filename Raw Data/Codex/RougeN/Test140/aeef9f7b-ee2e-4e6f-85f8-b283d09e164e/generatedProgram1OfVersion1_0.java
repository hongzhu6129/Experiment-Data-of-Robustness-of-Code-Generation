import java.util.TreeMap;

public class TreeMapSearch {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add some key-value pairs to the TreeMap
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");

        // Key to search for
        int keyToSearch = 3;

        // Search for the key using containsKey()
        if (treeMap.containsKey(keyToSearch)) {
            System.out.println("Key " + keyToSearch + " found in the TreeMap. Value: " + treeMap.get(keyToSearch));
        } else {
            System.out.println("Key " + keyToSearch + " not found in the TreeMap.");
        }


        // Example with a key that's not present
        keyToSearch = 6;  //this key doesn't exist
         if (treeMap.containsKey(keyToSearch)) {
            System.out.println("Key " + keyToSearch + " found in the TreeMap. Value: " + treeMap.get(keyToSearch));
        } else {
            System.out.println("Key " + keyToSearch + " not found in the TreeMap.");
        }
    }
}
