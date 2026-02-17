import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class ClearNavigableSetKeys {

    public static void main(String[] args) {
        // Create a TreeMap (which implements NavigableMap)
        NavigableMap<String, Integer> navigableMap = new TreeMap<>();

        // Add some key-value pairs
        navigableMap.put("apple", 1);
        navigableMap.put("banana", 2);
        navigableMap.put("orange", 3);
        navigableMap.put("grape", 4);

        // Get the NavigableSet of keys
        NavigableSet<String> navigableSet = navigableMap.navigableKeySet();

        System.out.println("Original NavigableSet: " + navigableSet);

        // Clear the NavigableSet (which also clears the keys from the map)
        navigableSet.clear();


        System.out.println("NavigableSet after clearing: " + navigableSet);
        System.out.println("Map after clearing NavigableSet: " + navigableMap);


        //Example demonstrating clearing the map directly and observing the NavigableSet
        NavigableMap<String, Integer> navigableMap2 = new TreeMap<>();

        // Add some key-value pairs
        navigableMap2.put("apple", 1);
        navigableMap2.put("banana", 2);
        navigableMap2.put("orange", 3);
        navigableMap2.put("grape", 4);

        NavigableSet<String> navigableSet2 = navigableMap2.navigableKeySet();

        System.out.println("\nOriginal NavigableSet2: " + navigableSet2);
        System.out.println("Original Map2: " + navigableMap2);


        // Clear the map directly
        navigableMap2.clear();

        System.out.println("NavigableSet2 after clearing map directly: " + navigableSet2); // This will also be empty
        System.out.println("Map2 after clearing: " + navigableMap2);

    }
}
