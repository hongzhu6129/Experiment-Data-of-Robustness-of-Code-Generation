import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableSetViewOfKeys {

    public static void main(String[] args) {
        // Create a TreeMap (which implements NavigableMap)
        NavigableMap<String, Integer> studentScores = new TreeMap<>();

        // Add some entries to the map
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);
        studentScores.put("David", 80);
        studentScores.put("Eve", 92);

        // Get a NavigableSet view of the keys
        NavigableSet<String> keys = studentScores.navigableKeySet();

        // Print the NavigableSet of keys
        System.out.println("NavigableSet of keys: " + keys);

        // Demonstrate some NavigableSet methods
        System.out.println("First key: " + keys.first());
        System.out.println("Last key: " + keys.last());
        System.out.println("Key before 'Charlie': " + keys.lower("Charlie"));
        System.out.println("Key after 'Bob': " + keys.higher("Bob"));
        System.out.println("Keys from 'Bob' (inclusive) to 'Eve' (exclusive): " + keys.subSet("Bob", true, "Eve", false));


        // Example using descendingKeySet for reverse order
        NavigableSet<String> reverseKeys = studentScores.descendingKeySet();
        System.out.println("NavigableSet of keys in reverse order: " + reverseKeys);

         //Illustrate the difference between keySet() and navigableKeySet()
        System.out.println("Normal keySet(): "+ studentScores.keySet()); //Doesn't guarantee sorted order, though TreeMap does maintain it
        System.out.println("Navigable keySet(): "+ studentScores.navigableKeySet()); //Specifically provides navigation methods and sorted order.

    }
}
