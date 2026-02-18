import java.util.TreeMap;

public class CopyTreeMap {

    public static void main(String[] args) {
        // Create the original TreeMap (green map)
        TreeMap<String, Integer> greenMap = new TreeMap<>();
        greenMap.put("Apple", 3);
        greenMap.put("Banana", 2);
        greenMap.put("Orange", 5);

        // Method 1: Using the constructor
        TreeMap<String, Integer> copiedMap1 = new TreeMap<>(greenMap);


        // Method 2: Using putAll()
        TreeMap<String, Integer> copiedMap2 = new TreeMap<>();
        copiedMap2.putAll(greenMap);



        // Print the original and copied TreeMaps to verify
        System.out.println("Original TreeMap (greenMap): " + greenMap);
        System.out.println("Copied TreeMap (Method 1): " + copiedMap1);
        System.out.println("Copied TreeMap (Method 2): " + copiedMap2);


    }
}
