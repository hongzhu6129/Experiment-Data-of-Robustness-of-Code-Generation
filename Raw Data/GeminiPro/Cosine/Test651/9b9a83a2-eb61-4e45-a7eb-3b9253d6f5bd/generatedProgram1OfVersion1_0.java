import java.util.HashMap;
import java.util.Map;

public class GetComparableForKey {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        // Specify the key
        String key = "banana";

        // Get the comparable of the key (which is the key itself for String keys)
        Comparable<?> comparableKey = key; // String implements Comparable<String>

        // Check if the key exists in the map
        if (map.containsKey(key)) {
            System.out.println("Comparable of key '" + key + "': " + comparableKey);

             // Demonstrate using the comparable for comparison (example)
            String anotherKey = "apple";
            if (comparableKey.compareTo(anotherKey) > 0) {
                System.out.println(key + " is greater than " + anotherKey);
            } else if (comparableKey.compareTo(anotherKey) < 0) {
                System.out.println(key + " is less than " + anotherKey);
            } else {
                System.out.println(key + " is equal to " + anotherKey);
            }


        } else {
            System.out.println("Key '" + key + "' not found in the map.");
        }


        // Example with Integer keys:

         Map<Integer, String> map2 = new HashMap<>();
         map2.put(1, "one");
         map2.put(2, "two");
         map2.put(3, "three");

        Integer key2 = 2;

        Comparable<?> comparableKey2 = key2; // Integer implements Comparable<Integer>

        if (map2.containsKey(key2)) {
           System.out.println("Comparable of key '" + key2 + "': " + comparableKey2);
        } else {
            System.out.println("Key '" + key2 + "' not found in the map.");
        }



    }
}
