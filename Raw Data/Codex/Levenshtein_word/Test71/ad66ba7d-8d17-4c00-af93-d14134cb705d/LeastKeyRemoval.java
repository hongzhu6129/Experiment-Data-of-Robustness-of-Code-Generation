import java.util.TreeMap;
import java.util.Map;

public class LeastKeyRemoval {

    public static void main(String[] args) {
        // Use a TreeMap to maintain sorted order based on keys
        Map<Integer, String> studentScores = new TreeMap<>();

        // Add some key-value pairs (student ID, student name)
        studentScores.put(103, "Alice");
        studentScores.put(101, "Bob");
        studentScores.put(105, "Charlie");
        studentScores.put(102, "David");

        System.out.println("Original Map: " + studentScores);

        // Remove and get the entry with the least key

        if (!studentScores.isEmpty()) {
            // Method 1: Using firstKey() and remove()
            Integer leastKey = studentScores.firstKey();
            String leastKeyValue = studentScores.remove(leastKey);
            System.out.println("Removed Entry (Method 1): Key = " + leastKey + ", Value = " + leastKeyValue);


            // Method 2: Using pollFirstEntry() (more efficient)
             // Repopulate for demonstration, assuming the map was modified earlier
            studentScores.put(103, "Alice"); 
            studentScores.put(101, "Bob");
            studentScores.put(105, "Charlie");
            studentScores.put(102, "David");

            Map.Entry<Integer, String> leastEntry = studentScores.pollFirstEntry(); // Returns and removes the entry
            if (leastEntry != null) { // Check if the map was not empty
                System.out.println("Removed Entry (Method 2): Key = " + leastEntry.getKey() + ", Value = " + leastEntry.getValue());
            }



            System.out.println("Map after removal: " + studentScores);
        } else {
            System.out.println("The map is empty.");
        }


        // Example showing how to handle an empty map gracefully with pollFirstEntry:
        studentScores.clear(); // Clear the map to make it empty
        Map.Entry<Integer, String> leastEntry2 = studentScores.pollFirstEntry();
        if (leastEntry2 == null) {
            System.out.println("The map was empty. No entry removed.");
        }

        //Further explanation of the methods used in the example program.

        System.out.println("\nExplanation of Methods:");
        System.out.println("TreeMap: A sorted map implementation that maintains key-value pairs in ascending order of keys.");
        System.out.println("firstKey(): Returns the first (lowest) key currently in the map.");
        System.out.println("remove(key): Removes the mapping for a key from this map if it is present.");
        System.out.println("pollFirstEntry(): Removes and returns the first (lowest) entry from the map, or null if the map is empty.");



    }
}
