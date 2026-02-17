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

        // Value to search for
        int searchKey = 3;

        // Check if the key exists using containsKey()
        if (treeMap.containsKey(searchKey)) {
            System.out.println("Key " + searchKey + " found in the TreeMap. Value: " + treeMap.get(searchKey));
        } else {
            System.out.println("Key " + searchKey + " not found in the TreeMap.");
        }

        // Search for a key that doesn't exist
        searchKey = 6;

        if (treeMap.containsKey(searchKey)) {
            System.out.println("Key " + searchKey + " found in the TreeMap. Value: " + treeMap.get(searchKey));
        } else {
            System.out.println("Key " + searchKey + " not found in the TreeMap.");
        }



        // Search for a Value (less efficient - requires iteration)
        String searchValue = "Three";
        boolean valueFound = false;

        for (Integer key : treeMap.keySet()) {  // Iterate through the keys
            if (treeMap.get(key).equals(searchValue)) {
                System.out.println("Value \"" + searchValue + "\" found at key: " + key);
                valueFound = true;
                break; // Exit loop once found (optional, but efficient)
            }
        }

        if (!valueFound) {
            System.out.println("Value \"" + searchValue + "\" not found in the TreeMap.");
        }



    }
}
