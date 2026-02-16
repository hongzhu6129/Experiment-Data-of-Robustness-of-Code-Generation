import java.util.HashMap;
import java.util.Map;

public class CheckEmptyMap {

    public static void main(String[] args) {
        // Example 1: Empty map
        Map<String, Integer> map1 = new HashMap<>();
        checkEmptyMap(map1); // Output: Map is empty

        // Example 2: Non-empty map
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("apple", 1);
        map2.put("banana", 2);
        checkEmptyMap(map2); // Output: Map is not empty
    }

    public static void checkEmptyMap(Map<?, ?> map) {
        if (map.isEmpty()) {
            System.out.println("Map is empty");
        } else {
            System.out.println("Map is not empty");
        }
    }
}
