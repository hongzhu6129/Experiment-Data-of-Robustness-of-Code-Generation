import java.util.HashMap;
import java.util.Map;

public class CheckKeyInMap {

    public static void main(String[] args) {

        // Create a sample map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);


        // Test if keys exist using containsKey()
        String key1 = "apple";
        String key2 = "grape";

        if (myMap.containsKey(key1)) {
            System.out.println("The map contains the key '" + key1 + "'");
        } else {
            System.out.println("The map does not contain the key '" + key1 + "'");
        }

        if (myMap.containsKey(key2)) {
            System.out.println("The map contains the key '" + key2 + "'");
        } else {
            System.out.println("The map does not contain the key '" + key2 + "'");
        }



        // Demonstrating using get() (less efficient but shows an alternative)
        //  get() returns null if the key is not found
        if (myMap.get(key1) != null) {
            System.out.println("The map contains the key '" + key1 + "' (using get)");
        } else {
            System.out.println("The map does not contain the key '" + key1 + "' (using get)");
        }

        if (myMap.get(key2) != null) {
             System.out.println("The map contains the key '" + key2 + "' (using get)");
        } else {
            System.out.println("The map does not contain the key '" + key2 + "' (using get)");
        }
    }
}
