import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableSetFromMap {

    public static void main(String[] args) {

        // Create a TreeMap (which implements NavigableMap)
        NavigableMap<Integer, String> myMap = new TreeMap<>();

        // Populate the map with some sample data
        myMap.put(1, "One");
        myMap.put(3, "Three");
        myMap.put(2, "Two");
        myMap.put(5, "Five");
        myMap.put(4, "Four");


        // Get a NavigableSet view of the keys
        NavigableSet<Integer> keySet = myMap.navigableKeySet();

        // Print the NavigableSet of keys
        System.out.println("NavigableSet of keys: " + keySet);


        // Demonstrate some NavigableSet methods (optional)
        System.out.println("First key: " + keySet.first());
        System.out.println("Last key: " + keySet.last());
        System.out.println("Key lower than 3: " + keySet.lower(3));
        System.out.println("Key floor to 3: " + keySet.floor(3)); // floor returns the key itself if present
        System.out.println("Key ceiling to 3: " + keySet.ceiling(3)); // ceiling returns the key itself if present.
        System.out.println("Key higher than 3: " + keySet.higher(3));


    }
}
