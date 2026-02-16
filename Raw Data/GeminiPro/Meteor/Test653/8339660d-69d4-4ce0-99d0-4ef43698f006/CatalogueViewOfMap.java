import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CatalogueViewOfMap {

    public static void main(String[] args) {
        // Create a sample HashMap
        HashMap<Integer, String> productMap = new HashMap<>();
        productMap.put(1, "Laptop");
        productMap.put(2, "Mouse");
        productMap.put(3, "Keyboard");
        productMap.put(4, "Monitor");
        productMap.put(5, "Printer");


        // Method 1: Using entrySet() and a for-each loop (Recommended)
        System.out.println("Catalogue View (using entrySet()):");
        Set<Map.Entry<Integer, String>> entries = productMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Product ID: " + entry.getKey() + ", Product Name: " + entry.getValue());
        }

        System.out.println("\n---\n"); // Separator


        // Method 2: Using keySet() and get()
        System.out.println("Catalogue View (using keySet() and get()):");
        Set<Integer> keys = productMap.keySet();
        for (Integer key : keys) {
            System.out.println("Product ID: " + key + ", Product Name: " + productMap.get(key));
        }


        System.out.println("\n---\n"); // Separator


        // Method 3: Java 8+ Stream API (more concise)
        System.out.println("Catalogue View (using Stream API):");
        productMap.forEach((key, value) -> System.out.println("Product ID: " + key + ", Product Name: " + value));


         System.out.println("\n---\n"); // Separator

        // Method 4:  String.format for better formatting
        System.out.println("Catalogue View (using String.format):");
        for (Map.Entry<Integer, String> entry : productMap.entrySet()) {
           System.out.println(String.format("Product ID: %-5d Product Name: %s", entry.getKey(), entry.getValue())); // %-5d left-aligns the ID in a 5-character field
        }




    }
}
