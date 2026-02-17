import java.util.HashMap;
import java.util.Map;

public class CheckEmptyMap {

    public static void main(String[] args) {
        // Example 1: Empty Map
        Map<String, Integer> map1 = new HashMap<>();

        if (map1.isEmpty()) {
            System.out.println("map1 is empty");
        } else {
            System.out.println("map1 is not empty");
        }

        // Example 2: Non-Empty Map
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("apple", 1);
        map2.put("banana", 2);

        if (map2.isEmpty()) {
            System.out.println("map2 is empty");
        } else {
            System.out.println("map2 is not empty");
        }


        // Example 3:  Another way to create an empty map
        Map<String, Integer> map3 = new HashMap<>(); // Or any other map implementation

        if(map3.size() == 0) {
            System.out.println("map3 is empty");
        } else {
            System.out.println("map3 is not empty");
        }
    }
}
