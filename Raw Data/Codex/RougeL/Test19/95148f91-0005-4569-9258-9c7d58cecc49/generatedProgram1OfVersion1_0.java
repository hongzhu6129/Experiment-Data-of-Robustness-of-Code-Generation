import java.util.TreeMap;
import java.util.Map;

public class RemoveGreatestKey {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add some entries to the map
        treeMap.put(1, "One");
        treeMap.put(5, "Five");
        treeMap.put(3, "Three");
        treeMap.put(8, "Eight");
        treeMap.put(2, "Two");

        // Check if the map is empty
        if (treeMap.isEmpty()) {
            System.out.println("The map is empty.");
            return;
        }

        // Get the greatest key
        Integer greatestKey = treeMap.lastKey();

        // Get the value associated with the greatest key before removing it
        String value = treeMap.get(greatestKey);

        // Remove the entry with the greatest key
        treeMap.remove(greatestKey);

        // Print the removed entry and the updated map
        System.out.println("Removed entry: " + greatestKey + " => " + value);


        // Find and print the nearest neighbor (if any)
        if (!treeMap.isEmpty()) {
            Integer lowerNeighbor = treeMap.lowerKey(greatestKey);
            Integer higherNeighbor = treeMap.higherKey(greatestKey);

            if (lowerNeighbor != null && higherNeighbor != null) {
                // Both neighbors exist, find the closest
                int diffLower = greatestKey - lowerNeighbor;
                int diffHigher = higherNeighbor - greatestKey;

                Integer nearestNeighbor = (diffLower <= diffHigher) ? lowerNeighbor : higherNeighbor;
                System.out.println("Nearest neighbor to removed key: " + nearestNeighbor + " => " + treeMap.get(nearestNeighbor));


            } else if (lowerNeighbor != null) {
                System.out.println("Nearest neighbor to removed key: " + lowerNeighbor + " => " + treeMap.get(lowerNeighbor));

            } else if (higherNeighbor != null) {
                System.out.println("Nearest neighbor to removed key: " + higherNeighbor + " => " + treeMap.get(higherNeighbor));

            }


        }

        System.out.println("Updated map: " + treeMap);
    }
}
