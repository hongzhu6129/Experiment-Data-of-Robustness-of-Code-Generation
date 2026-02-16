import java.util.NavigableMap;
import java.util.TreeMap;

public class TailMapExample {

    public static void main(String[] args) {
        // Create a TreeMap, which implements NavigableMap
        NavigableMap<Integer, String> studentScores = new TreeMap<>();

        // Populate the map with some sample data
        studentScores.put(70, "Alice");
        studentScores.put(80, "Bob");
        studentScores.put(85, "Charlie");
        studentScores.put(90, "David");
        studentScores.put(95, "Eve");


        // Key from which we want the tail map (inclusive)
        int thresholdKey = 85; 

        // Get the portion of the map whose keys are greater than or equal to thresholdKey
        NavigableMap<Integer, String> tailMapInclusive = studentScores.tailMap(thresholdKey, true);

        System.out.println("Original Map: " + studentScores);
        System.out.println("Tail Map (inclusive) from key " + thresholdKey + ": " + tailMapInclusive);


        // Example with exclusive tailMap
        NavigableMap<Integer, String> tailMapExclusive = studentScores.tailMap(thresholdKey, false);
        System.out.println("Tail Map (exclusive) from key " + thresholdKey + ": " + tailMapExclusive);


        // Illustrate that changes in the tail map affect the original map (and vice-versa) since it's a view
        tailMapInclusive.put(98, "Frank");  // Add to tailMap
        System.out.println("Original Map after adding to tailMap: " + studentScores);

        studentScores.remove(90); // Remove from original
        System.out.println("Tail Map after removing from original: " + tailMapInclusive);




        // Example using subMap for a range of keys
        NavigableMap<Integer, String> subMap = studentScores.subMap(80, true, 95, true); // Keys from 80 (inclusive) to 95 (inclusive)
        System.out.println("Submap from 80 to 95 (inclusive): " + subMap);

    }
}
