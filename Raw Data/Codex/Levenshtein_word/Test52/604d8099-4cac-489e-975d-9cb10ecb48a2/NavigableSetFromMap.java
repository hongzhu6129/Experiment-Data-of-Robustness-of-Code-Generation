import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableSetFromMap {

    public static void main(String[] args) {

        // 1. Create a TreeMap (which implements NavigableMap)
        NavigableMap<String, Integer> studentScores = new TreeMap<>();

        // 2. Populate the TreeMap
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);
        studentScores.put("David", 78);
        studentScores.put("Eve", 88);


        // 3. Get the NavigableSet view of the keys
        NavigableSet<String> studentNames = studentScores.navigableKeySet();

        // 4. Demonstrate NavigableSet operations

        System.out.println("Original set of student names: " + studentNames);

        System.out.println("First student (lexicographically): " + studentNames.first());
        System.out.println("Last student (lexicographically): " + studentNames.last());

        System.out.println("Students before 'David': " + studentNames.headSet("David", false)); // Exclusive
        System.out.println("Students including and before 'David': " + studentNames.headSet("David", true)); // Inclusive
        
        System.out.println("Students from 'Bob' (inclusive) to 'Eve' (exclusive): " + studentNames.subSet("Bob", true, "Eve", false));


        System.out.println("Students after 'Charlie': " + studentNames.tailSet("Charlie", false)); // Exclusive
        System.out.println("Students including and after 'Charlie': " + studentNames.tailSet("Charlie", true)); // Inclusive

        // Note: Changes made to the NavigableSet will be reflected in the original map, and vice-versa.


        // Example demonstrating this:
        studentNames.remove("Bob"); // Removing from the NavigableSet
        System.out.println("Map after removing 'Bob' from the NavigableSet: " + studentScores);

        studentScores.put("Frank", 92);  // Adding to the original Map
        System.out.println("NavigableSet after adding 'Frank' to the Map: " + studentNames);



        // Additional NavigableSet methods (descending order, etc.)
        NavigableSet<String> reversedNames = studentNames.descendingSet();
        System.out.println("Student names in reverse (descending) order: " + reversedNames);

        System.out.println("Highest student name less than 'Eve': " + studentNames.lower("Eve"));
        System.out.println("Lowest student name greater than 'Charlie': " + studentNames.higher("Charlie"));


    }
}
