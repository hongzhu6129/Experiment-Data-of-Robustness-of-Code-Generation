import java.util.TreeMap;

public class CopyTreeMap {

    public static void main(String[] args) {

        // Create a source TreeMap
        TreeMap<String, Integer> sourceMap = new TreeMap<>();
        sourceMap.put("Apple", 1);
        sourceMap.put("Banana", 2);
        sourceMap.put("Orange", 3);
        sourceMap.put("Grape", 4);


        // Method 1: Using the putAll() method (most efficient)
        TreeMap<String, Integer> copiedMap1 = new TreeMap<>();
        copiedMap1.putAll(sourceMap);

        System.out.println("Copied Map 1 (putAll): " + copiedMap1);


        // Method 2: Using the constructor (creates a shallow copy)
        TreeMap<String, Integer> copiedMap2 = new TreeMap<>(sourceMap);

        System.out.println("Copied Map 2 (constructor): " + copiedMap2);


        // Method 3: Iterating and putting each entry (less efficient, but demonstrates the logic)
        TreeMap<String, Integer> copiedMap3 = new TreeMap<>();
        for (String key : sourceMap.keySet()) {
            copiedMap3.put(key, sourceMap.get(key));
        }

        System.out.println("Copied Map 3 (iteration): " + copiedMap3);



        // Demonstrating that changes to the original DO NOT affect copies made using putAll or the constructor
        sourceMap.put("Mango", 5);  // Modify the original

        System.out.println("Original Map after modification: " + sourceMap);
        System.out.println("Copied Map 1 (putAll) after modification: " + copiedMap1);
        System.out.println("Copied Map 2 (constructor) after modification: " + copiedMap2);


        //Important note about shallow copy: If the values in your TreeMap are mutable objects (like other collections or custom objects), 
        //changes to those objects WILL be reflected in both the original and copied maps using putAll and the constructor approach.
        //For a deep copy, you would need to clone each value object as well.


    }
}
