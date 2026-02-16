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

        printMap(copiedMap1, "Method 1 (putAll):");



        // Method 2: Using a loop and put()
        Map<String, Integer> copiedMap2 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            copiedMap2.put(entry.getKey(), entry.getValue());
        }

        printMap(copiedMap2, "Method 2 (loop and put):");

        //Method 3: Java 8 Stream API (concise but might have slightly more overhead)
        Map<String, Integer> copiedMap3 = sourceMap.entrySet().stream()
                .collect(HashMap::new, (m, e) -> m.put(e.getKey(), e.getValue()), HashMap::putAll);

         printMap(copiedMap3, "Method 3 (Java 8 Stream):");

        // Method 4: Using the constructor (creates a shallow copy)
        // Be careful with this as modifications in one map might reflect in the other if values are mutable objects
        Map<String, Integer> copiedMap4 = new HashMap<>(sourceMap);

        printMap(copiedMap4, "Method 4 (Constructor - Shallow Copy):");



    }

    private static void printMap(Map<String, Integer> map, String message) {
        System.out.println(message);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();
    }
}

