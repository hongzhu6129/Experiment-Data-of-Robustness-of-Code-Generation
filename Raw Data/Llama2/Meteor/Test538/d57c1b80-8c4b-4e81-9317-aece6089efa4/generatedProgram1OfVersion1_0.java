import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class CheckMapForSet {

    public static void main(String[] args) {
        // Create a sample map
        Map<Set<String>, Integer> map = new HashMap<>();

        // Create some sample sets
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");

        Set<String> set2 = new HashSet<>();
        set2.add("grape");
        set2.add("orange");

        Set<String> set3 = new HashSet<>(); // Empty set
        
        Set<String> set4 = new HashSet<>();
        set4.add("apple");
        set4.add("banana"); // set4 is equal to set1


        // Add mappings to the map
        map.put(set1, 10);
        map.put(set2, 20);
        map.put(set3, 30);


        // Test if the map contains mappings for the specified sets
        System.out.println("Map contains set1: " + map.containsKey(set1)); // Output: true
        System.out.println("Map contains set2: " + map.containsKey(set2)); // Output: true
        System.out.println("Map contains set3: " + map.containsKey(set3)); // Output: true
        System.out.println("Map contains set4: " + map.containsKey(set4)); // Output: true (set1 and set4 are equal)


        Set<String> set5 = new HashSet<>();
        set5.add("apple");
        set5.add("grape"); // Different from the sets already in the map

        System.out.println("Map contains set5: " + map.containsKey(set5)); // Output: false


        //Demonstrate importance of using Set.equals() for checking equality
        Set<String> set6 = new HashSet<>();
        set6.add("banana");
        set6.add("apple"); //Same elements as set1, but different order

        System.out.println("Map contains set6: " + map.containsKey(set6)); // Output: true (HashSet.equals() checks contents, not order)


    }
}
