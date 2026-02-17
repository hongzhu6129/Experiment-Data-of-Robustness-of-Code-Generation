import java.util.HashMap;
import java.util.Map;

public class CheckKeyInMap {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);

        // Key to check
        String keyToCheck = "banana";

        // Check if the key exists using containsKey()
        if (myMap.containsKey(keyToCheck)) {
            System.out.println("The map contains the key '" + keyToCheck + "'");
        } else {
            System.out.println("The map does not contain the key '" + keyToCheck + "'");
        }


        // Example with a key that doesn't exist.
        keyToCheck = "grape";

        if (myMap.containsKey(keyToCheck)) {
            System.out.println("The map contains the key '" + keyToCheck + "'");
        } else {
            System.out.println("The map does not contain the key '" + keyToCheck + "'");
        }
    }
}
