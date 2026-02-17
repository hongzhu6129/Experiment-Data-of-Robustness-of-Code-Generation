import java.util.HashMap;
import java.util.Map;

public class ClearMap {

    public static void main(String[] args) {

        // Create a sample map
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 92);
        studentGrades.put("David", 78);

        // Print the original map
        System.out.println("Original Map: " + studentGrades);

        // Remove all mappings using clear()
        studentGrades.clear();

        // Print the map after clearing
        System.out.println("Map after clearing: " + studentGrades);


        // Example demonstrating checking for emptiness:
        if (studentGrades.isEmpty()) {
            System.out.println("The map is now empty.");
        } else {
            System.out.println("The map is not empty."); // This won't execute in this case.
        }


        //  Another example creating a new map after clearing:
        studentGrades = new HashMap<>(); //  Now 'studentGrades' refers to a brand new, empty map.
        studentGrades.put("Eve", 95);
        System.out.println("New map: " + studentGrades);


    }
}
