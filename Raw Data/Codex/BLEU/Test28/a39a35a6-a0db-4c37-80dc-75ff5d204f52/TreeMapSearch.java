import java.util.TreeMap;

public class TreeMapSearch {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add some key-value pairs
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("orange", 3);
        treeMap.put("grape", 4);

        // Search for a specific key
        String keyToSearch = "banana";
        if (treeMap.containsKey(keyToSearch)) {
            System.out.println("Key '" + keyToSearch + "' found. Value: " + treeMap.get(keyToSearch));
        } else {
            System.out.println("Key '" + keyToSearch + "' not found.");
        }

        // Search for a key that doesn't exist
        keyToSearch = "pineapple";
        if (treeMap.containsKey(keyToSearch)) {
            System.out.println("Key '" + keyToSearch + "' found. Value: " + treeMap.get(keyToSearch));
        } else {
            System.out.println("Key '" + keyToSearch + "' not found.");
        }


        // Search for a specific value (less efficient than key search)
        Integer valueToSearch = 3;

        for (String key : treeMap.keySet()) {  // Iterate through keys
            if (treeMap.get(key).equals(valueToSearch)) {
                System.out.println("Value " + valueToSearch + " found for key: " + key);
                break; // Exit loop once found (assuming values may not be unique)
            }
        }


    }
}
