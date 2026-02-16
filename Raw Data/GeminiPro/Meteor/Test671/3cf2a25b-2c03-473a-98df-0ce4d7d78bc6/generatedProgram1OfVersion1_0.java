import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableSetFromMap {

    public static void main(String[] args) {

        // Create a TreeMap (which implements NavigableMap)
        NavigableMap<String, Integer> myMap = new TreeMap<>();

        // Populate the map with some sample data
        myMap.put("Apple", 1);
        myMap.put("Banana", 2);
        myMap.put("Orange", 3);
        myMap.put("Grape", 4);
        myMap.put("Mango", 5);

        // Get a NavigableSet view of the keys
        NavigableSet<String> keySet = myMap.navigableKeySet();

        // Print the NavigableSet of keys
        System.out.println("NavigableSet of keys: " + keySet);

        // Demonstrate some NavigableSet methods (optional)

        System.out.println("First key: " + keySet.first());
        System.out.println("Last key: " + keySet.last());
        System.out.println("Key less than 'Grape': " + keySet.lower("Grape")); // Returns "Banana"
         System.out.println("Key less than or equal to 'Grape': " + keySet.floor("Grape"));  // Returns "Grape"
        System.out.println("Key greater than 'Orange': " + keySet.higher("Orange")); //Returns "Mango"
         System.out.println("Key greater than or equal to 'Orange': " + keySet.ceiling("Orange")); // Returns "Orange"



    }
}
