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

        // Value to search for
        int searchKey = 3;

        // Search for the value using containsKey()
        if (treeMap.containsKey(searchKey)) {
            System.out.println("Key " + searchKey + " found in the TreeMap.");
            String value = treeMap.get(searchKey); // Get the value associated with the key
            System.out.println("Value associated with key " + searchKey + ": " + value);

        } else {
            System.out.println("Key " + searchKey + " not found in the TreeMap.");
        }



        // Example searching for a value that doesn't exist
        searchKey = 6; 
        if (treeMap.containsKey(searchKey)) {
            System.out.println("Key " + searchKey + " found in the TreeMap.");
        } else {
            System.out.println("Key " + searchKey + " not found in the TreeMap.");
        }


        // Search for a value (using containsValue - less efficient for TreeMap)
        String searchValue = "Three";
        if (treeMap.containsValue(searchValue)) {
            System.out.println("Value " + searchValue + " found in the TreeMap.");

            // If you need the key associated with the value, you'll have to iterate:
            for (Integer key : treeMap.keySet()) {
                if (treeMap.get(key).equals(searchValue)) {
                    System.out.println("Key associated with value " + searchValue + ": " + key);
                    break; // Stop iterating once the key is found
                }
            }

        } else {
            System.out.println("Value " + searchValue + " not found in the TreeMap.");
        }
    }
}
