import java.util.HashMap;
import java.util.Map;

public class CopyMap {

    public static void main(String[] args) {

        // Create the source map
        Map<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("Apple", 1);
        sourceMap.put("Banana", 2);
        sourceMap.put("Orange", 3);

        // Method 1: Using putAll() - Most efficient
        Map<String, Integer> copiedMap1 = new HashMap<>();
        copiedMap1.putAll(sourceMap); 

        printMap(copiedMap1, "Method 1: Using putAll()");


        // Method 2: Using a loop and put()
        Map<String, Integer> copiedMap2 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            copiedMap2.put(entry.getKey(), entry.getValue());
        }

        printMap(copiedMap2, "Method 2: Using loop and put()");


        // Method 3: Java 8+ Stream API and Collectors.toMap()
        Map<String, Integer> copiedMap3 = sourceMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        printMap(copiedMap3, "Method 3: Using Stream API and Collectors.toMap()");


         // Method 4: Using the constructor (Creates a shallow copy) - Be cautious!
        Map<String, Integer> copiedMap4 = new HashMap<>(sourceMap); // Shallow copy

        printMap(copiedMap4, "Method 4: Using the constructor (Shallow copy)");

        // Demonstration of shallow copy implications (Changes reflected in both maps):
        sourceMap.put("Grape", 4); // Modify the original map
        System.out.println("\nAfter modifying the original map (demonstrating shallow copy effect):");
        printMap(sourceMap, "Original map:");
        printMap(copiedMap4, "Copied map (Method 4 - Shallow copy):");



    }


    // Helper function to print the map contents nicely
    public static void printMap(Map<String, Integer> map, String title) {
        System.out.println("\n" + title);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
