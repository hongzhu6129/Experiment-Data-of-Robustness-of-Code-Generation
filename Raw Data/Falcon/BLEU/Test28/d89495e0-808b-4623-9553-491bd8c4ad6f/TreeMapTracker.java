import java.util.TreeMap;

public class TreeMapTracker {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add some sample data
        treeMap.put(1, "Apple");
        treeMap.put(5, "Banana");
        treeMap.put(3, "Orange");
        treeMap.put(2, "Grape");
        treeMap.put(4, "Mango");


        // Value to track
        String valueToTrack = "Orange";

        // Check if the value exists in the TreeMap
        if (treeMap.containsValue(valueToTrack)) {
            System.out.println("Value '" + valueToTrack + "' found in the TreeMap.");

            // Find the key associated with the value (more complex since TreeMap is primarily key-based)
            for (Integer key : treeMap.keySet()) {
                if (treeMap.get(key).equals(valueToTrack)) {
                    System.out.println("Key associated with '" + valueToTrack + "': " + key);
                    break; // Stop searching after the first match if only one key is expected
                }
            }



        } else {
            System.out.println("Value '" + valueToTrack + "' not found in the TreeMap.");
        }



         // Tracking based on Key (if you have the key):
        int keyToTrack = 3;

        if (treeMap.containsKey(keyToTrack)) {
            System.out.println("Key " + keyToTrack + " found. Value: " + treeMap.get(keyToTrack));
        } else {
            System.out.println("Key " + keyToTrack + " not found.");
        }


        // Demonstrate handling null values
        treeMap.put(6, null); // Adding a null value

        // Check if null exists (using containsValue is tricky with null)
        if (treeMap.values().stream().anyMatch(x -> x == null) ) {
            System.out.println("TreeMap contains a null value.");
        }


    }
}
