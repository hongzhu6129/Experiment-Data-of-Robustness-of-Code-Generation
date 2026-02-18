import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class ReverseMapKeys {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs (TreeMap automatically sorts keys)
        Map<String, Integer> bookMap = new TreeMap<>();

        // Add some book titles and their publication years
        bookMap.put("The Hitchhiker's Guide to the Galaxy", 1979);
        bookMap.put("Pride and Prejudice", 1813);
        bookMap.put("To Kill a Mockingbird", 1960);
        bookMap.put("1984", 1949);

        // Get the keys of the map as a Set
        Set<String> keys = bookMap.keySet();

        // Create a new TreeMap with a reverse comparator to store keys in reverse order
        TreeMap<String, Integer> reversedMap = new TreeMap<>(java.util.Collections.reverseOrder()); 

        // Add the keys from the original map to the reversed map (values are irrelevant here)
        for (String key : keys) {
            reversedMap.put(key, bookMap.get(key)); // We can put any value � original value used for demonstration
        }


        // Print the keys in reverse order
        System.out.println("Books in reverse order of title:");
        for (String key : reversedMap.keySet()) {
            System.out.println(key + ": " + reversedMap.get(key)); // Prints key and original value
        }



        // Alternative approach using descendingKeySet() (Java 8+ and if using a NavigableMap like TreeMap)

        System.out.println("\nAlternative approach using descendingKeySet():");
         for (String key : bookMap.descendingKeySet()) {
            System.out.println(key + ": " + bookMap.get(key));
        }

    }
}
