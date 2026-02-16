import java.util.TreeMap;

public class CopyTreeMap {

    public static void main(String[] args) {
        // Create the source TreeMap
        TreeMap<String, Integer> sourceMap = new TreeMap<>();
        sourceMap.put("Apple", 1);
        sourceMap.put("Banana", 2);
        sourceMap.put("Orange", 3);
        sourceMap.put("Grape", 4);

        // Create the destination TreeMap using the putAll() method
        TreeMap<String, Integer> destinationMap = new TreeMap<>();
        destinationMap.putAll(sourceMap);


        // Print the contents of both TreeMaps to verify the copy
        System.out.println("Source TreeMap:");
        printTreeMap(sourceMap);

        System.out.println("\nDestination TreeMap:");
        printTreeMap(destinationMap);


        // Demonstrating copying using the constructor (alternative method)
        TreeMap<String, Integer> anotherCopy = new TreeMap<>(sourceMap); // Creates a new TreeMap with the same mappings as sourceMap

        System.out.println("\nAnother copy (using constructor):");
        printTreeMap(anotherCopy);
    }

    // Helper method to print the contents of a TreeMap
    public static void printTreeMap(TreeMap<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
