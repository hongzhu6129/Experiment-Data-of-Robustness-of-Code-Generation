import java.util.TreeMap;

public class CopyTreeMap {

    public static void main(String[] args) {
        // Create the source TreeMap
        TreeMap<String, Integer> sourceTreeMap = new TreeMap<>();
        sourceTreeMap.put("Apple", 1);
        sourceTreeMap.put("Banana", 2);
        sourceTreeMap.put("Orange", 3);
        sourceTreeMap.put("Grape", 4);

        // Method 1: Using putAll()
        TreeMap<String, Integer> destinationTreeMap1 = new TreeMap<>();
        destinationTreeMap1.putAll(sourceTreeMap);

        System.out.println("Destination TreeMap 1 (using putAll()): " + destinationTreeMap1);


        // Method 2: Using constructor
        TreeMap<String, Integer> destinationTreeMap2 = new TreeMap<>(sourceTreeMap);

        System.out.println("Destination TreeMap 2 (using constructor): " + destinationTreeMap2);


        //Method 3: Iterating and putting entries individually (less efficient but demonstrates another approach)
        TreeMap<String, Integer> destinationTreeMap3 = new TreeMap<>();
        for (String key : sourceTreeMap.keySet()) {
            destinationTreeMap3.put(key, sourceTreeMap.get(key));
        }

        System.out.println("Destination TreeMap 3 (using iteration): " + destinationTreeMap3);

    }
}
