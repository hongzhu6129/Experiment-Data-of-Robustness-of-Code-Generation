import java.util.Map;
import java.util.TreeMap;

public class GetFirstAndLastKey {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs (TreeMap automatically sorts keys)
        Map<Integer, String> myMap = new TreeMap<>();

        // Add some entries to the map
        myMap.put(5, "Five");
        myMap.put(2, "Two");
        myMap.put(8, "Eight");
        myMap.put(1, "One");
        myMap.put(10, "Ten");


        if (!myMap.isEmpty()) {
            // Get the first (lowest) key
            Integer firstKey = myMap.keySet().stream().findFirst().orElse(null);

            // Get the last (highest) key
            Integer lastKey = myMap.keySet().stream().skip(myMap.size() - 1).findFirst().orElse(null);


            System.out.println("First (Lowest) Key: " + firstKey); // Output: 1
            System.out.println("Last (Highest) Key: " + lastKey);  // Output: 10


            //More efficient way using TreeMap specific methods (if you know it's a TreeMap)
            //Applicable only to SortedMap like TreeMap and NavigableMap.
            if (myMap instanceof TreeMap) {
                 TreeMap<Integer, String> treeMap = (TreeMap<Integer, String>) myMap;
                 Integer firstKeyTreeMap = treeMap.firstKey();
                 Integer lastKeyTreeMap = treeMap.lastKey();

                 System.out.println("First Key (TreeMap method): " + firstKeyTreeMap); // Output: 1
                 System.out.println("Last Key (TreeMap method): " + lastKeyTreeMap); // Output: 10
            }

        } else {
            System.out.println("The map is empty.");
        }
    }
}
