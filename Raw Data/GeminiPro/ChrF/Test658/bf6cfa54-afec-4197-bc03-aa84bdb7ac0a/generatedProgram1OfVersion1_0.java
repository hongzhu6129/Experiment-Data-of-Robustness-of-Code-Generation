import java.util.TreeMap;
import java.util.Set;

public class TreeMapKeys {

    public static void main(String[] args) {

        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add some key-value pairs
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Orange", 3);
        treeMap.put("Grape", 4);

        // Get all keys using keySet()
        Set<String> keys = treeMap.keySet();

        // Print the keys
        System.out.println("Keys of the TreeMap:");
        for (String key : keys) {
            System.out.println(key);
        }


        // Another way to iterate (using Java 8+ streams and lambdas - though it's slightly outside the strict "only use main" requirement.  If you must avoid this, remove the below lines)
        System.out.println("\nKeys using Stream API:");  //Just a visual separator
        treeMap.keySet().forEach(System.out::println);



    }
}
