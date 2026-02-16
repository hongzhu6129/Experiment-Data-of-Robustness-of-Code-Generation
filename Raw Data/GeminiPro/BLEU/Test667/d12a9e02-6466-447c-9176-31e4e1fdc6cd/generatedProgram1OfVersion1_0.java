import java.util.NavigableMap;
import java.util.TreeMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap (which implements NavigableMap)
        NavigableMap<Integer, String> studentScores = new TreeMap<>();

        // Populate the map with some data
        studentScores.put(10, "Alice");
        studentScores.put(20, "Bob");
        studentScores.put(30, "Charlie");
        studentScores.put(40, "David");
        studentScores.put(50, "Eve");

        // Get the portion of the map whose keys are less than or equal to 30 (inclusive)
        NavigableMap<Integer, String> subMapInclusive = studentScores.headMap(30, true);

        System.out.println("Inclusive Submap (<= 30):");
        printMap(subMapInclusive);


        // Get the portion of the map whose keys are strictly less than 30 (exclusive)
        NavigableMap<Integer, String> subMapExclusive = studentScores.headMap(30, false);

        System.out.println("\nExclusive Submap (< 30):");
        printMap(subMapExclusive);


        // Example using a specific use-case (finding students with scores below a passing grade)
        int passingGrade = 35;
        NavigableMap<Integer, String> failingStudents = studentScores.headMap(passingGrade, false); 

        System.out.println("\nFailing Students (Score < " + passingGrade + "):");
        printMap(failingStudents);


        //Demonstrating headMap with no elements
        NavigableMap<Integer, String> emptySubmap = studentScores.headMap(5, false); //No keys less than 5
        System.out.println("\nEmpty Submap:");
        printMap(emptySubmap);  //Will print nothing as the map is empty


    }



    // Helper function to print a map
    public static void printMap(NavigableMap<Integer, String> map) {
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }


}
