import java.util.TreeMap;
import java.util.Map;

public class RemoveGreatestKey {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs (TreeMap automatically sorts by key)
        TreeMap<Integer, String> myMap = new TreeMap<>();

        // Add some sample entries
        myMap.put(1, "One");
        myMap.put(5, "Five");
        myMap.put(2, "Two");
        myMap.put(10, "Ten");
        myMap.put(7, "Seven");


        if (!myMap.isEmpty()) {
            // Get the greatest key (lastKey() in TreeMap)
            Integer greatestKey = myMap.lastKey();

            // Remove and get the value associated with the greatest key (pollLastEntry() removes and returns the entry)
            Map.Entry<Integer, String> removedEntry = myMap.pollLastEntry();

            // Print the removed key-value pair
            System.out.println("Removed Entry: Key = " + removedEntry.getKey() + ", Value = " + removedEntry.getValue());


            // Print the updated map (after removal)
            System.out.println("Updated Map: " + myMap);

        } else {
            System.out.println("The map is empty.");
        }
    }
}
