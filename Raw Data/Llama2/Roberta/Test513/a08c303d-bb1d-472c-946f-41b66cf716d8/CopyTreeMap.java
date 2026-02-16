import java.util.TreeMap;

public class CopyTreeMap {

    public static void main(String[] args) {

        // Create a source TreeMap
        TreeMap<String, Integer> sourceMap = new TreeMap<>();
        sourceMap.put("Apple", 5);
        sourceMap.put("Banana", 2);
        sourceMap.put("Orange", 3);

        // Create a destination TreeMap (Method 1: Using putAll())
        TreeMap<String, Integer> destinationMap1 = new TreeMap<>();
        destinationMap1.putAll(sourceMap);

        // Print the destination TreeMap
        System.out.println("Destination TreeMap (Method 1): " + destinationMap1);


        // Create a destination TreeMap (Method 2: Using constructor)
        TreeMap<String, Integer> destinationMap2 = new TreeMap<>(sourceMap);


        // Print the destination TreeMap
        System.out.println("Destination TreeMap (Method 2): " + destinationMap2);



        // Create a destination TreeMap (Method 3: Iterating and putting)
        TreeMap<String, Integer> destinationMap3 = new TreeMap<>();
        for (String key : sourceMap.keySet()) {
            destinationMap3.put(key, sourceMap.get(key));
        }
        System.out.println("Destination TreeMap (Method 3): " + destinationMap3);


    }
}
