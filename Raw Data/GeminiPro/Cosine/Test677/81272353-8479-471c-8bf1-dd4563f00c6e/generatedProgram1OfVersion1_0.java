import java.util.TreeMap;
import java.util.SortedMap;

public class TailMapExample {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs
        TreeMap<Integer, String> studentScores = new TreeMap<>();

        // Add some sample data
        studentScores.put(10, "Alice");
        studentScores.put(20, "Bob");
        studentScores.put(30, "Charlie");
        studentScores.put(40, "David");
        studentScores.put(50, "Eve");

        // Given key
        int givenKey = 25;

        // Get the portion of the map where keys are greater than givenKey
        SortedMap<Integer, String> tailMap = studentScores.tailMap(givenKey);


        // Print the tail map
        System.out.println("Portion of map with keys greater than " + givenKey + ":");
        if (!tailMap.isEmpty()) {
             tailMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        } else {
            System.out.println("No entries found.");
        }


        // Example with an inclusive tailMap (keys greater than or equal to givenKey):

        givenKey = 30;
        SortedMap<Integer, String> inclusiveTailMap = studentScores.tailMap(givenKey, true);

        System.out.println("\nPortion of map with keys greater than or equal to " + givenKey + ":");

        if (!inclusiveTailMap.isEmpty()) {
            inclusiveTailMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        } else {
            System.out.println("No entries found.");
        }

    }
}
