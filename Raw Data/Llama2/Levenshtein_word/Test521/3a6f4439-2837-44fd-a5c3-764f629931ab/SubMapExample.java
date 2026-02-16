import java.util.NavigableMap;
import java.util.TreeMap;

public class SubMapExample {

    public static void main(String[] args) {

        // Create a TreeMap. TreeMap is a NavigableMap implementation.
        NavigableMap<Integer, String> studentGrades = new TreeMap<>();

        // Populate the map with some student IDs and grades
        studentGrades.put(101, "A");
        studentGrades.put(103, "B");
        studentGrades.put(105, "C");
        studentGrades.put(107, "A");
        studentGrades.put(109, "B+");

        // Example 1: Get the portion of the map whose keys are less than 105 (exclusive)
        NavigableMap<Integer, String> subMapExclusive = studentGrades.headMap(105, false);
        System.out.println("Students with ID less than 105 (exclusive): " + subMapExclusive);

        // Example 2: Get the portion of the map whose keys are less than or equal to 105 (inclusive)
        NavigableMap<Integer, String> subMapInclusive = studentGrades.headMap(105, true);
        System.out.println("Students with ID less than or equal to 105 (inclusive): " + subMapInclusive);



        // Example 3: Demonstrate modifying the submap affects the original map
        //  (important to understand if you need a copy instead)

        NavigableMap<Integer, String> subMap = studentGrades.headMap(107, true);
        System.out.println("Original Map before submap modification: " + studentGrades);

        subMap.put(102, "C+"); // Adding to submap
        subMap.remove(101);     // Removing from submap

        System.out.println("Original Map after submap modification: " + studentGrades);  // Changes reflected!

        // Example 4: Creating a copy of a submap to avoid modifying the original
        NavigableMap<Integer, String> copiedSubMap = new TreeMap<>(studentGrades.headMap(107, true));
        copiedSubMap.put(100, "A-");  // Adding to the copy
        System.out.println("Copied Submap: " + copiedSubMap);
        System.out.println("Original Map (unchanged): " + studentGrades); // Original remains unaffected


        //  Example 5:  Empty map handling
        NavigableMap<Integer, String> emptyMap = new TreeMap<>();
        NavigableMap<Integer, String> emptySubmap = emptyMap.headMap(120, true); // Handle empty map gracefully
        System.out.println("Submap of an empty map: " + emptySubmap); 

    }
}



