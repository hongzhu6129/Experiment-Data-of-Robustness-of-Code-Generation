import java.util.HashMap;
import java.util.Map;

public class ClearMap {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> bookPrices = new HashMap<>();
        bookPrices.put("Java Programming", 50);
        bookPrices.put("Data Structures and Algorithms", 60);
        bookPrices.put("Database Management", 75);

        // Print the map before clearing
        System.out.println("Original map: " + bookPrices);

        // Remove all mappings from the map
        bookPrices.clear();

        // Print the map after clearing
        System.out.println("Map after clearing: " + bookPrices); 
    }
}
