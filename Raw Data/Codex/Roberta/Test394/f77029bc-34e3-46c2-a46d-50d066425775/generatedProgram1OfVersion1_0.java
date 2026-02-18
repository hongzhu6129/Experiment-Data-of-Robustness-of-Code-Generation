import java.util.TreeMap;

public class ClearTreeMap {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add some elements to the TreeMap
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Orange", 3);
        treeMap.put("Grape", 4);

        // Print the initial TreeMap
        System.out.println("Initial TreeMap: " + treeMap);

        // Clear all elements from the TreeMap
        treeMap.clear();


        // Print the TreeMap after clearing
        System.out.println("TreeMap after clearing: " + treeMap);


        // Demonstrating adding elements after clearing
        treeMap.put("Mango", 5);
        treeMap.put("Pineapple", 6);
        System.out.println("TreeMap after adding new elements: " + treeMap);

        // Another way to check if the TreeMap is empty is using isEmpty()
        if (treeMap.isEmpty()) {
            System.out.println("The TreeMap is empty.");
        } else {
            System.out.println("The TreeMap is not empty.");
        }



    }
}
