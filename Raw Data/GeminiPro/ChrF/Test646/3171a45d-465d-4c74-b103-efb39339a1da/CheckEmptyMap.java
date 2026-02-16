import java.util.HashMap;
import java.util.Map;

public class CheckEmptyMap {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> map1 = new HashMap<>();

        // Check if the map is empty
        boolean isEmpty1 = map1.isEmpty();
        System.out.println("Is map1 empty? " + isEmpty1); // Output: true

        // Add some key-value pairs to the map
        map1.put("Apple", 1);
        map1.put("Banana", 2);
        map1.put("Orange", 3);


        // Check if the map is empty again
        boolean isEmpty2 = map1.isEmpty();
        System.out.println("Is map1 empty now? " + isEmpty2); // Output: false


        //Another example with an initially empty map
        Map<Integer, String> map2 = new HashMap<>();
        System.out.println("Is map2 empty? " + map2.isEmpty()); // Output: true


    }
}
