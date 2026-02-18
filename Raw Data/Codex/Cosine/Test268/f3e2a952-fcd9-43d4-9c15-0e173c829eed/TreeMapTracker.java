import java.util.TreeMap;

public class TreeMapTracker {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add some key-value pairs
        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("orange", 3);
        treeMap.put("grape", 4);

        // Key to track
        String keyToTrack = "orange";

        // Check if the key exists
        if (treeMap.containsKey(keyToTrack)) {
            System.out.println("Key '" + keyToTrack + "' found. Value: " + treeMap.get(keyToTrack));

            // Demonstrate updating the value for the tracked key
            treeMap.put(keyToTrack, 10); // Update the value
            System.out.println("Updated value for '" + keyToTrack + "': " + treeMap.get(keyToTrack));

             // Demonstrate removing the tracked key
            treeMap.remove(keyToTrack);
            System.out.println("Key '" + keyToTrack + "' removed.");


            // Check again if the key exists after removal
             if (treeMap.containsKey(keyToTrack)) {
                System.out.println("Key '" + keyToTrack + "' found. Value: " + treeMap.get(keyToTrack));
            } else {
                System.out.println("Key '" + keyToTrack + "' not found.");
            }


        } else {
            System.out.println("Key '" + keyToTrack + "' not found.");
        }


        // Track a key that doesn't exist initially, then add it.
        String newKey = "kiwi";
        if (treeMap.containsKey(newKey)) {
             System.out.println("Key '" + newKey + "' found. Value: " + treeMap.get(newKey));
        } else {
            System.out.println("Key '" + newKey + "' not found.");
            treeMap.put(newKey, 5); // Add the new key
            System.out.println("Key '" + newKey + "' added. Value: " + treeMap.get(newKey));
        }

          // Iterate and print to show current state of the TreeMap.
          System.out.println("Current TreeMap entries:");
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
