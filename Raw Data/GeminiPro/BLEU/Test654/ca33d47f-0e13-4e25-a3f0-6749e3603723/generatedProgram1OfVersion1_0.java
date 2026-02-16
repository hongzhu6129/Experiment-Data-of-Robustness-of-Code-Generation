import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Associate the specified value with the specified key
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Orange", 3);

        // Print the TreeMap to verify the association
        System.out.println(treeMap); 

        // Example of updating an existing key's value:
        treeMap.put("Apple", 10); // Replaces the old value (1) with 10
        System.out.println(treeMap);


        //Example demonstrating that keys are sorted alphabetically (natural ordering for Strings)
        treeMap.put("Grape", 4);
        treeMap.put("Kiwi", 5);
        System.out.println(treeMap); // Output will be sorted by keys
    }
}
