import java.util.TreeMap;
import java.util.Map;

public class RemoveGreatestKey {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs. TreeMap automatically sorts entries by key.
        TreeMap<Integer, String> myMap = new TreeMap<>();

        // Add some sample data
        myMap.put(1, "One");
        myMap.put(5, "Five");
        myMap.put(2, "Two");
        myMap.put(8, "Eight");
        myMap.put(3, "Three");


        if (!myMap.isEmpty()) {
            // Get the greatest key (lastKey in a TreeMap)
            Integer greatestKey = myMap.lastKey();

            // Get the value associated with the greatest key
            String greatestValue = myMap.get(greatestKey);

            // Remove the entry with the greatest key
            myMap.remove(greatestKey);


            // Output: Key-value visualization *before* removal (for demonstration)
            System.out.println("Original Map:");
            visualizeMap(myMap); //Helper function, see below

             myMap.put(greatestKey,greatestValue); //putting it back for proper visualization of removal

            // Output:  Key-value pair removed
            System.out.println("\nRemoved Key-Value Pair: (" + greatestKey + ", " + greatestValue + ")");

            // Output: Key-value visualization *after* removal
            myMap.remove(greatestKey);
            System.out.println("\nMap after removal:");
            visualizeMap(myMap);



        } else {
            System.out.println("The map is empty.");
        }
    }



     // Helper function to visualize the map contents more clearly 
    public static void visualizeMap(TreeMap<Integer, String> map) {
        if (map.isEmpty()) {
            System.out.println("Map is empty.");
            return;
        }

        System.out.print("{");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue());
            if (entry.getKey() != map.lastKey()) { // Check if it's the last entry
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }


}
