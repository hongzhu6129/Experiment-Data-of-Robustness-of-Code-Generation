import java.util.TreeMap;

public class FloorKey {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Populate the TreeMap
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        // Test cases
        findFloorKey(treeMap, 15); // Output: 10
        findFloorKey(treeMap, 30); // Output: 30
        findFloorKey(treeMap, 5);  // Output: null
        findFloorKey(treeMap, 55); // Output: 50


    }

    public static void findFloorKey(TreeMap<Integer, String> treeMap, int key) {
        Integer floorKey = treeMap.floorKey(key);

        if (floorKey != null) {
            System.out.println(floorKey); 
        } else {
            System.out.println(null); // Or handle the null case as needed (e.g., print a message)
        }
    }
}
