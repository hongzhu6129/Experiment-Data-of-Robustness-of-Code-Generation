import java.util.HashMap;
import java.util.Map;

public class CheckOneToOneEmptyMap {

    public static void main(String[] args) {
        // Example 1: Empty map (one-to-one by definition)
        Map<String, Integer> map1 = new HashMap<>();
        System.out.println("Is map1 one-to-one (empty)? " + isOneToOneEmpty(map1)); // Output: true


        // Example 2: One-to-one mapping
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("a", 1);
        map2.put("b", 2);
        map2.put("c", 3); 
        System.out.println("Is map2 one-to-one (empty)? " + isOneToOneEmpty(map2)); // Output: false

        // Example 3: Not one-to-one mapping (duplicate values)
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("a", 1);
        map3.put("b", 2);
        map3.put("c", 1); // Duplicate value
        System.out.println("Is map3 one-to-one (empty)? " + isOneToOneEmpty(map3)); // Output: false
    }

    public static boolean isOneToOneEmpty(Map<?, ?> map) {
        return map.isEmpty(); // A map is one-to-one and empty if and only if it's empty.
    }
}



