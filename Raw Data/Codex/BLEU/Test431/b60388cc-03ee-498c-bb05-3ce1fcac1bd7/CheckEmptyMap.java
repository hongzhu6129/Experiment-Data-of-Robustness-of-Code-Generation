import java.util.HashMap;
import java.util.Map;

public class CheckEmptyMap {

    public static void main(String[] args) {

        // Method 1: Using isEmpty()
        Map<String, Integer> map1 = new HashMap<>();
        boolean isEmpty1 = map1.isEmpty();
        System.out.println("Is map1 empty? (using isEmpty()): " + isEmpty1); // Output: true

        map1.put("apple", 1);
        isEmpty1 = map1.isEmpty();
        System.out.println("Is map1 empty now? (using isEmpty()): " + isEmpty1); // Output: false


        // Method 2: Checking size()
        Map<String, Integer> map2 = new HashMap<>();
        boolean isEmpty2 = map2.size() == 0;
        System.out.println("Is map2 empty? (using size()): " + isEmpty2); // Output: true


        map2.put("banana", 2);
        map2.put("orange", 3);
        isEmpty2 = map2.size() == 0;
        System.out.println("Is map2 empty now? (using size()): " + isEmpty2); // Output: false


        // Example with an initially populated map:
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("grape", 4);
        map3.put("kiwi", 5);

        boolean isEmpty3 = map3.isEmpty();
        System.out.println("Is map3 empty? (using isEmpty()): " + isEmpty3); // Output: false
        isEmpty3 = map3.size() == 0;
        System.out.println("Is map3 empty? (using size()): " + isEmpty3); // Output: false

        map3.clear(); // remove all mappings
        isEmpty3 = map3.isEmpty();
        System.out.println("Is map3 empty after clearing? (using isEmpty()): " + isEmpty3); // Output: true
         isEmpty3 = map3.size() == 0;
        System.out.println("Is map3 empty after clearing? (using size()): " + isEmpty3); // Output: true


    }
}
