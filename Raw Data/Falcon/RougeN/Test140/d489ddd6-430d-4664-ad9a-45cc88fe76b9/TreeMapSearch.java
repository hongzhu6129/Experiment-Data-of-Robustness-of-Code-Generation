import java.util.TreeMap;

public class TreeMapSearch {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Put some key-value pairs into the TreeMap
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");

        // Key to search for
        int keyToSearch = 3;

        // Search for the key using containsKey()
        if (treeMap.containsKey(keyToSearch)) {
            System.out.println("Key " + keyToSearch + " found in the TreeMap.");
            String value = treeMap.get(keyToSearch); // Get the value associated with the key
            System.out.println("Value associated with key " + keyToSearch + ": " + value);
        } else {
            System.out.println("Key " + keyToSearch + " not found in the TreeMap.");
        }


        // Example searching for a key that doesn't exist
        keyToSearch = 7; 
        if (treeMap.containsKey(keyToSearch)) {
            System.out.println("Key " + keyToSearch + " found in the TreeMap.");
        } else {
            System.out.println("Key " + keyToSearch + " not found in the TreeMap.");
        }
    }
}
