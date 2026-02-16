import java.util.TreeMap;

public class TreeMapClear {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add some elements
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Orange", 3);
        treeMap.put("Grape", 4);

        // Print the initial TreeMap
        System.out.println("Initial TreeMap: " + treeMap);

        // Delete all elements using clear()
        treeMap.clear();

        // Print the TreeMap after clearing
        System.out.println("TreeMap after clearing: " + treeMap);


        // Example demonstrating adding elements back after clearing
        treeMap.put("Mango", 5);
        treeMap.put("Pineapple", 6);

        System.out.println("TreeMap after adding new elements: " + treeMap);



        //Illustrating that clear() removes all mappings, not just values.
        TreeMap<String, Integer> anotherTreeMap = new TreeMap<>();
        anotherTreeMap.put("Red", 1);
        anotherTreeMap.put("Green", 2);


        System.out.println("Another TreeMap before clearing keys and values: " + anotherTreeMap);
        anotherTreeMap.clear(); // Removes both keys ("Red", "Green") AND their associated values.
        System.out.println("Another TreeMap after clearing keys and values: " + anotherTreeMap);


    }
}
