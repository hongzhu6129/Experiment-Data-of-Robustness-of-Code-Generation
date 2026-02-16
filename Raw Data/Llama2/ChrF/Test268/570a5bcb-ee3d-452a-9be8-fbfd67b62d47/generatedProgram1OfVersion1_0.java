import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {

    public static void main(String[] args) {

        // Create a HashMap
        Map<String, String> names = new HashMap<>();

        // Add some elements
        names.put("John", "Doe");
        names.put("Jane", "Smith");
        names.put("Peter", "Jones");

        // Method 1: Iterate through keys and get values
        System.out.println("Iterating using keySet():");
        for (String key : names.keySet()) {
            System.out.println("Key: " + key + ", Value: " + names.get(key));
        }
        System.out.println();


        // Method 2: Iterate through entries (key-value pairs)
        System.out.println("Iterating using entrySet():");
        for (Map.Entry<String, String> entry : names.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();


        // Method 3: Iterate using Java 8 streams and forEach (lambda expression) - requires Java 8+
        System.out.println("Iterating using forEach and lambda expression:");
        names.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // Method 4: Iterating using Java 8 streams and forEach (method reference)  - requires Java 8+
        System.out.println("\nIterating using forEach and method reference:");
        names.entrySet().forEach(System.out::println); // Prints the Entry object itself


    }
}
