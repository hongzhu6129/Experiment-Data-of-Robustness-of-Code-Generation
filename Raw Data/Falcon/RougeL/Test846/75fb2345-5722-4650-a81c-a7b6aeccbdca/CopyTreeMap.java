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
        System.out.println("Copied TreeMap 1 (using constructor): " + copiedMap1);
        System.out.println("Copied TreeMap 2 (using putAll()): " + copiedMap2);


         //Demonstrate that changes to the copy don't affect the original
        copiedMap1.put("Mango", 5);
        System.out.println("Original TreeMap after modification of copy 1: " + sourceMap); 
        System.out.println("Copied TreeMap 1 after modification : " + copiedMap1);

        copiedMap2.remove("Banana");
        System.out.println("Original TreeMap after modification of copy 2: " + sourceMap);
        System.out.println("Copied TreeMap 2 after modification: " + copiedMap2);



    }
}
