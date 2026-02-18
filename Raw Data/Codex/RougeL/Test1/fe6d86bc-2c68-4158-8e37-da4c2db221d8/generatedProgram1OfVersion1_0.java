import java.util.NavigableMap;
import java.util.TreeMap;

public class MapPortion {

    public static void main(String[] args) {
        // Create a TreeMap (which implements NavigableMap)
        NavigableMap<Integer, String> bookMap = new TreeMap<>();

        // Populate the map with some sample data
        bookMap.put(1, "Book A");
        bookMap.put(5, "Book B");
        bookMap.put(10, "Book C");
        bookMap.put(15, "Book D");
        bookMap.put(20, "Book E");

        // Key to check against
        int givenKey = 12;

        // Whether to include the given key in the portion (inclusive)
        boolean inclusive = true;


        // Get the portion of the map
        NavigableMap<Integer, String> portion;

        if (inclusive) {
            portion = bookMap.headMap(givenKey, true); 
        } else {
            portion = bookMap.headMap(givenKey, false);
        }

        // Print the portion of the map
        System.out.println("Portion of map with keys less than " 
                           + (inclusive ? "or equal to " : "")
                           + givenKey + ":");
        System.out.println(portion);


        // Example with a different key and inclusive = false
        givenKey = 5;
        inclusive = false;

        if (inclusive) {
            portion = bookMap.headMap(givenKey, true); 
        } else {
            portion = bookMap.headMap(givenKey, false);
        }

        System.out.println("\nPortion of map with keys strictly less than " + givenKey + ":");
        System.out.println(portion);


         //Demonstrate handling empty map
        NavigableMap<Integer, String> emptyMap = new TreeMap<>();
        givenKey = 5;
        inclusive = true;
        portion = emptyMap.headMap(givenKey, inclusive);
        System.out.println("\nPortion of an empty map:");
        System.out.println(portion); // Will print an empty map {}

    }
}
