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


        // Another way to iterate (using a forEach loop with lambda expression)
        System.out.println("\nKeys using forEach:");
        keys.forEach(System.out::println);



        // Demonstrating sorted order (TreeMap maintains natural ordering of keys)
        System.out.println("\nDemonstrating sorted order:");

         TreeMap<Integer, String> numbers = new TreeMap<>();
        numbers.put(5, "Five");
        numbers.put(2, "Two");
        numbers.put(8, "Eight");
        numbers.put(1, "One");

        numbers.keySet().forEach(System.out::println);


    }
}
