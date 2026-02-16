import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;


public class HeadMapExample {

    public static void main(String[] args) {
        // Create a TreeMap.
        NavigableMap<Integer, String> studentScores = new TreeMap<>();

        // Put some key-value pairs into the map.
        studentScores.put(70, "Emily");
        studentScores.put(85, "Bob");
        studentScores.put(92, "Alice");
        studentScores.put(65, "David");
        studentScores.put(78, "Jane");


        // Demo 1: Get the portion of the map whose keys are strictly less than 80
        int upperBound = 80;
        NavigableMap<Integer, String> scoresBelow80 = studentScores.headMap(upperBound, false);  // false for strictly less than

        System.out.println("Students with scores strictly less than " + upperBound + ":");
        printMap(scoresBelow80);



        // Demo 2: Get scores strictly less than 70 (inclusive)
        upperBound = 70;
        NavigableMap<Integer, String> scoresBelow70Inclusive = studentScores.headMap(upperBound, true); // true for inclusive
        System.out.println("\nStudents with scores less than or equal to " + upperBound + ":");
        printMap(scoresBelow70Inclusive);


        // Demo 3: Handle empty results:
        upperBound = 60; // No scores below 60
        NavigableMap<Integer, String> scoresBelow60 = studentScores.headMap(upperBound, false); 
        System.out.println("\nStudents with scores strictly less than " + upperBound + ":");
        if (scoresBelow60.isEmpty()) {
            System.out.println("(No students found)");
        } else {
            printMap(scoresBelow60);
        }


        //Important Note: Changes to the submap (headMap, tailMap, subMap) will reflect in the original map and vice versa.  If you need an independent copy, use the constructor:
        NavigableMap<Integer, String> independentCopy = new TreeMap<>(studentScores.headMap(80, false));


    }

    // Helper function to print the map nicely
    public static void printMap(Map<Integer, String> map) {
        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Score: " + entry.getKey() + ", Student: " + entry.getValue());
        }
    }

}
