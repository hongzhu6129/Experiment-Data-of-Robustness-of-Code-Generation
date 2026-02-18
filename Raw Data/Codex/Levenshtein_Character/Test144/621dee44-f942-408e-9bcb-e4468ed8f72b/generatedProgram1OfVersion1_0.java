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
        studentScores.put("David", 78);
        studentScores.put("Eve", 88);

        // Get the NavigableSet view of the keys
        NavigableSet<String> keys = studentScores.navigableKeySet();

        // Print the original map and the navigable set of keys
        System.out.println("Original Map: " + studentScores);
        System.out.println("Navigable Set of Keys: " + keys);


        // Demonstrate some NavigableSet methods (optional)
        System.out.println("First Key: " + keys.first());
        System.out.println("Last Key: " + keys.last());
        System.out.println("Keys less than 'David': " + keys.headSet("David", false)); // Exclusive
        System.out.println("Keys greater than or equal to 'Bob': " + keys.tailSet("Bob", true)); // Inclusive

        //Changes to the NavigableSet are reflected in the original map and vice-versa.
        keys.remove("Bob");
        System.out.println("Map after removing 'Bob' from keySet: " + studentScores);


    }
}
