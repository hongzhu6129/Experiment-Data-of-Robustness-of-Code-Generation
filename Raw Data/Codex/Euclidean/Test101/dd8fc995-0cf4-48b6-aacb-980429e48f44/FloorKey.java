import java.util.TreeMap;

public class FloorKey {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        System.out.println("Floor key of 15: " + getFloorKey(treeMap, 15)); // Output: 10
        System.out.println("Floor key of 25: " + getFloorKey(treeMap, 25)); // Output: 20
        System.out.println("Floor key of 5: " + getFloorKey(treeMap, 5));  // Output: null
        System.out.println("Floor key of 50: " + getFloorKey(treeMap, 50)); // Output: 40
        System.out.println("Floor key of 55: " + getFloorKey(treeMap, 55)); // Output: 50

         TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("orange", 3);

        System.out.println("Floor key of 'apricot': " + getFloorKey(stringTreeMap, "apricot")); // Output: apple
        System.out.println("Floor key of 'avocado': " + getFloorKey(stringTreeMap, "avocado"));// Output: banana
        System.out.println("Floor key of 'aardvark': " + getFloorKey(stringTreeMap,"aardvark"));// Output: null


    }


    public static <K, V> K getFloorKey(TreeMap<K, V> treeMap, K key) {
        if (treeMap == null || treeMap.isEmpty()) {
            return null;
        }

        K floorKey = treeMap.floorKey(key);
        if (floorKey != null && floorKey.equals(key)) {
            return treeMap.lowerKey(key);
        } else {
            return floorKey;
        }

    }
}
