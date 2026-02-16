import java.util.TreeMap;
import java.util.Map;

public class RemoveGreatestKey {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs. TreeMap automatically sorts keys in ascending order.
        TreeMap<Integer, String> myMap = new TreeMap<>();

        // Add some sample data
        myMap.put(1, "One");
        myMap.put(5, "Five");
        myMap.put(2, "Two");
        myMap.put(10, "Ten");
        myMap.put(7, "Seven");


        if (!myMap.isEmpty()) {
            // Get the greatest key (last entry in the sorted TreeMap)
            Integer greatestKey = myMap.lastKey();

            // Get the value associated with the greatest key
            String greatestValue = myMap.get(greatestKey);

            // Remove the entry with the greatest key
            myMap.remove(greatestKey);


            // Visualize the removed key-value pair
            System.out.println("Removed Key-Value Pair:");
            System.out.println("Key: " + greatestKey + ", Value: " + greatestValue);

            // Visualize the remaining map (optional)
            System.out.println("\nRemaining Map:");
            for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

        } else {
            System.out.println("The map is empty.");
        }

    }
}
