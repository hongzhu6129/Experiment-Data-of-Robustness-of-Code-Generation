import java.util.HashMap;
import java.util.Map;

public class ClearMap {

    public static void main(String[] args) {

        // Create a sample map
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 92);
        studentGrades.put("David", 78);

        // Print the original map
        System.out.println("Original map: " + studentGrades);

        // Remove all mappings using clear()
        studentGrades.clear();

        // Print the map after clearing
        System.out.println("Map after clearing: " + studentGrades);


        // Demonstrating clearing an already empty map (no effect, but doesn't cause errors)
        Map<String, String> emptyMap = new HashMap<>();
        System.out.println("Initially empty map: " + emptyMap);
        emptyMap.clear();  // Clearing an empty map
        System.out.println("Empty map after clear(): " + emptyMap);


        // Another example with a different map type (TreeMap) to show generality
        // TreeMap is sorted by keys
        java.util.TreeMap<Integer, String> productPrices = new java.util.TreeMap<>();
        productPrices.put(1, "$10");
        productPrices.put(2, "$25");
        productPrices.put(3, "$15");

        System.out.println("Original TreeMap: " + productPrices);
        productPrices.clear();
        System.out.println("TreeMap after clearing: " + productPrices);


    }
}
