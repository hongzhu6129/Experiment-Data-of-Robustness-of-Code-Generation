import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

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

        // Print the values using the Collection view
        System.out.print("Values: ");
        for (Integer score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();


        // Demonstrate that changes to the Collection view affect the map
        System.out.println("\nDemonstrating changes to the Collection view affect the Map:");
        scores.remove(85); // Remove the value 85

        System.out.println("Map after removing 85 from the Collection view: " + studentScores);



        // Demonstrate adding elements to the Collection (not supported by all Collection views)
        // Note: This WILL throw an UnsupportedOperationException for the default HashMap values view.
        // Some Map implementations may have values() views that support add/remove.
        try {
            scores.add(100); 
        } catch (UnsupportedOperationException e) {
            System.out.println("\nAdding to the values Collection is not supported for this Map implementation.");
            System.out.println("Exception: " + e.getMessage()); // Print the exception message
        }


        // Iterate through the values using a forEach loop (Java 8+)
         System.out.print("\nValues (using forEach): ");
         scores.forEach(System.out::print); // A more concise way to print values
        System.out.println();

    }
}
