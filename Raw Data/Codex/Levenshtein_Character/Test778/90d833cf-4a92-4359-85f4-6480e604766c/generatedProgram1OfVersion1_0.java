import java.util.TreeMap;

public class TreeMapSearch {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add some key-value pairs
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");


        // Key to search for
        int keyToSearch = 3;

        // Search for the key
        if (treeMap.containsKey(keyToSearch)) {
            System.out.println("Key " + keyToSearch + " found. Value: " + treeMap.get(keyToSearch));
        } else {
            System.out.println("Key " + keyToSearch + " not found in the TreeMap.");
        }

         // Search for a key that doesn't exist
        keyToSearch = 7;  
        if (treeMap.containsKey(keyToSearch)) {
            System.out.println("Key " + keyToSearch + " found. Value: " + treeMap.get(keyToSearch));
        } else {
            System.out.println("Key " + keyToSearch + " not found in the TreeMap.");
        }


        // Using get() to search (returns null if not found)
        String value = treeMap.get(2);
        if (value != null) {
            System.out.println("Key 2 found. Value: " + value);
        } else {
            System.out.println("Key 2 not found using get()."); // This won't print because key 2 exists
        }

        value = treeMap.get(10); // Key 10 doesn't exist
        if (value != null) {
            System.out.println("Key 10 found. Value: " + value); 
        } else {
            System.out.println("Key 10 not found using get().");
        }
    }
}
