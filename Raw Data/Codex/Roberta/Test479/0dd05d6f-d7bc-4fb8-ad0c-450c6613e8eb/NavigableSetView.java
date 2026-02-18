import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableSetView {

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
        NavigableSet<String> keys = studentScores.navigableKeySet();

        // Print the keys
        System.out.println("Keys in the NavigableSet view:");
        for (String key : keys) {
            System.out.println(key);
        }

        // Demonstrate some NavigableSet methods (optional)
        System.out.println("\nDemonstrating NavigableSet methods:");

        System.out.println("First key: " + keys.first()); 
        System.out.println("Last key: " + keys.last());
        System.out.println("Key lower than 'Charlie': " + keys.lower("Charlie"));
        System.out.println("Key floor to 'Charlie': " + keys.floor("Charlie")); // "Charlie" itself
        System.out.println("Key ceiling to 'Charlie': " + keys.ceiling("Charlie")); // "Charlie" itself
        System.out.println("Key higher than 'Charlie': " + keys.higher("Charlie"));


        // Example: Getting a sub-set of keys
        NavigableSet<String> subSet = keys.subSet("Bob", true, "David", false); // Inclusive of "Bob", exclusive of "David"
        System.out.println("\nSubset of keys from 'Bob' to (excluding) 'David':");
        for (String key : subSet) {
            System.out.println(key); 
        }



    }
}
