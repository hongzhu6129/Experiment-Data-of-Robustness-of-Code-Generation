import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableSetFromMap {

    public static void main(String[] args) {

        // Create a TreeMap (which implements NavigableMap)
        NavigableMap<String, Integer> studentScores = new TreeMap<>();

        // Add some entries to the map
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);
        studentScores.put("David", 78);
        studentScores.put("Eve", 88);


        // Get a NavigableSet view of the keys
        NavigableSet<String> studentNames = studentScores.navigableKeySet();

        // Print the NavigableSet of keys
        System.out.println("NavigableSet of student names: " + studentNames);

        // Demonstrate some NavigableSet methods (optional)
        System.out.println("First student (alphabetically): " + studentNames.first());
        System.out.println("Last student (alphabetically): " + studentNames.last());
        System.out.println("Students before 'David': " + studentNames.headSet("David", false)); // exclusive
        System.out.println("Students from 'Bob' onwards: " + studentNames.tailSet("Bob", true)); // inclusive


    }
}
