import java.util.TreeMap;

public class TreeMapAssociateValue {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Associate values with keys
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Orange", 3);

        // Print the TreeMap to verify the association
        System.out.println("TreeMap: " + treeMap);


        // Example of updating a value associated with an existing key
        treeMap.put("Apple", 10); // Updates the value for "Apple"
        System.out.println("TreeMap after update: " + treeMap);
    }
}
