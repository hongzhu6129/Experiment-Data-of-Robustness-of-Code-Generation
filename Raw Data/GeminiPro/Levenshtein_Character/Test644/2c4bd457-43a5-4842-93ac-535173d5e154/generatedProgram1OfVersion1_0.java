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

        // Method 2: Using a loop and put()
        Map<String, Integer> copiedMap2 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            copiedMap2.put(entry.getKey(), entry.getValue());
        }

        // Method 3: Java 8 Stream API (for more complex scenarios or transformations)
        Map<String, Integer> copiedMap3 = sourceMap.entrySet().stream()
                .collect(HashMap::new, (m, e) -> m.put(e.getKey(), e.getValue()), HashMap::putAll);


        // Print the copied maps to verify
        System.out.println("Copied Map 1 (putAll): " + copiedMap1);
        System.out.println("Copied Map 2 (loop): " + copiedMap2);
        System.out.println("Copied Map 3 (Stream): " + copiedMap3);


        //Demonstrate that changes to copiedMap1 do *not* affect sourceMap (shallow copy):
        copiedMap1.put("Grape", 4);
        System.out.println("sourceMap after modification to copiedMap1: " + sourceMap); //Grape is not in sourceMap
        System.out.println("copiedMap1 after modification: " + copiedMap1); //Grape *is* in copiedMap1




    }
}
