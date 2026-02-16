import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CheckMapContainsSet {

    public static void main(String[] args) {
        // Create a sample map
        Map<Set<String>, String> map = new HashMap<>();

        // Create some sample sets
        Set<String> set1 = Set.of("apple", "banana");
        Set<String> set2 = Set.of("grape", "orange");
        Set<String> set3 = Set.of("apple", "banana"); // Identical to set1

        // Add mappings to the map
        map.put(set1, "fruits1");
        map.put(set2, "fruits2");

        // Test if the map contains mappings for the specified sets
        System.out.println("Map contains set1: " + map.containsKey(set1)); // Output: true
        System.out.println("Map contains set2: " + map.containsKey(set2)); // Output: true
        System.out.println("Map contains set3: " + map.containsKey(set3)); // Output: true (because set3 is equal to set1)


        // Demonstrate that set equality matters, not object identity
        Set<String> set4 = new java.util.HashSet<>(set1);  // set4 has the same elements but is a different object

        System.out.println("Map contains set4: " + map.containsKey(set4)); // Output: true (set4 is equal to set1)



        Set<String> set5 = Set.of("apple", "mango"); // Different set


        System.out.println("Map contains set5: " + map.containsKey(set5)); // Output: false

        // Test with a null set (should return false and not throw an exception with a properly implemented Map)
        System.out.println("Map contains null set: " + map.containsKey(null)); //  May vary by Map implementation (HashMap allows null keys)
    }
}
