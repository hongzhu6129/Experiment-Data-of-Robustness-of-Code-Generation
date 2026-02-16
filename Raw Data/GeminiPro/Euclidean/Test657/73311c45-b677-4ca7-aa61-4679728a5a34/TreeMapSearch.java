import java.util.TreeMap;

public class TreeMapSearch {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Populate the TreeMap with some key-value pairs
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");

        // Search for a specific key
        int keyToSearch = 3;
        if (treeMap.containsKey(keyToSearch)) {
            String value = treeMap.get(keyToSearch);
            System.out.println("Key " + keyToSearch + " found with value: " + value);
        } else {
            System.out.println("Key " + keyToSearch + " not found in the TreeMap.");
        }


        // Search for a key that doesn't exist
        keyToSearch = 6; 
        if (treeMap.containsKey(keyToSearch)) {
            String value = treeMap.get(keyToSearch);
            System.out.println("Key " + keyToSearch + " found with value: " + value);
        } else {
            System.out.println("Key " + keyToSearch + " not found in the TreeMap.");
        }


        // Search for a value (less efficient - requires iteration)
        String valueToSearch = "Two";
        boolean valueFound = false;
        for (String val : treeMap.values()) {
            if (val.equals(valueToSearch)) {
                valueFound = true;
                break; 
            }
        }

        if (valueFound) {
            System.out.println("Value '" + valueToSearch + "' found in the TreeMap.");
        } else {
            System.out.println("Value '" + valueToSearch + "' not found in the TreeMap.");
        }



    }
}
