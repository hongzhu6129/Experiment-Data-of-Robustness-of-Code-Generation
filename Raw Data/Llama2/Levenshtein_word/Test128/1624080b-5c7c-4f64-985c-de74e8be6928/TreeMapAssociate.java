import java.util.TreeMap;

public class TreeMapAssociate {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs.
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Associate values with keys using put().
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Orange", 3);
        treeMap.put("Grape", 4);


        // Print the TreeMap to verify the associations.
        System.out.println("TreeMap: " + treeMap);


        // Demonstrating associating a new value with an existing key (overwrites previous value)
        treeMap.put("Banana", 10); // Banana's value is now updated to 10.
        System.out.println("TreeMap after update: " + treeMap);


        // Demonstrating that keys are sorted naturally (alphabetical order in this case)
        System.out.println("Keys in sorted order: " + treeMap.keySet());

    }
}
