import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapValuesView {

    public static void main(String[] args) {
        // Create a sample HashMap
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);
        studentScores.put("David", 80);


        // Get a Collection view of the values
        Collection<Integer> scores = studentScores.values();


        // Print the original map
        System.out.println("Original Map: " + studentScores);

        // Print the values collection
        System.out.println("Values Collection: " + scores);


        // Demonstrate that changes to the collection reflect in the map
        // (and vice-versa, because it's a view, not a copy)

        System.out.println("\nDemonstrating changes through the view:");
        scores.remove(85); // Remove Bob's score (85)
        System.out.println("Map after removing 85 from the values collection: " + studentScores);


        studentScores.put("Eve", 75); // Add a new entry
        System.out.println("Values Collection after adding Eve to the map: " + scores);



        // Iterating through the values
        System.out.println("\nIterating through the values:");
        for (Integer score : scores) {
            System.out.println(score);
        }

        // Important Note about contains():
        System.out.println("\nUsing contains() on the values collection:");

        System.out.println("Contains 90? " + scores.contains(90)); // Checks if the *value* 90 exists
       
    }
}
