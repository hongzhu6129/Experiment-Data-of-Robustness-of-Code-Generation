import java.util.HashMap;
import java.util.Map;

public class ClearMap {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> bookPrices = new HashMap<>();
        bookPrices.put("Java for Beginners", 25);
        bookPrices.put("Advanced Java Programming", 40);
        bookPrices.put("Design Patterns", 35);

        // Print the original map
        System.out.println("Original map: " + bookPrices);

        // Remove all mappings
        bookPrices.clear();


        // Print the map after clearing
        System.out.println("Map after clearing: " + bookPrices); 
    }
}
