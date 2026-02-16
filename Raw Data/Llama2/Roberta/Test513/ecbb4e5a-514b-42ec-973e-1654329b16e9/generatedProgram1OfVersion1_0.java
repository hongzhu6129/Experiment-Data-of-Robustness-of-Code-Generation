import java.util.TreeMap;

public class CopyTreeMap {

    public static void main(String[] args) {
        // Create the source TreeMap
        TreeMap<String, Integer> sourceMap = new TreeMap<>();
        sourceMap.put("Apple", 1);
        sourceMap.put("Banana", 2);
        sourceMap.put("Orange", 3);
        sourceMap.put("Grape", 4);

        // Method 1: Using the constructor
        TreeMap<String, Integer> copiedMap1 = new TreeMap<>(sourceMap);

        // Method 2: Using putAll()
        TreeMap<String, Integer> copiedMap2 = new TreeMap<>();
        copiedMap2.putAll(sourceMap);


        // Print the contents of the copied TreeMaps to verify
        System.out.println("Copied Map 1 (Constructor): " + copiedMap1);
        System.out.println("Copied Map 2 (putAll()): " + copiedMap2);



        //Demonstrate that changes to the copy do not affect the original

        copiedMap1.put("Mango", 5);  //Add to the copy
        copiedMap2.remove("Banana"); //Remove from the other copy

        System.out.println("\nAfter modifications:");
        System.out.println("Original Map: " + sourceMap);
        System.out.println("Copied Map 1 (Constructor): " + copiedMap1);
        System.out.println("Copied Map 2 (putAll()): " + copiedMap2);

    }
}
