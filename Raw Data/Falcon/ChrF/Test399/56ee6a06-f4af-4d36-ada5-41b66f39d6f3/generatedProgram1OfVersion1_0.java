import java.util.TreeMap;

public class HigherKey {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");

        System.out.println("Higher key than 2: " + higherKey(treeMap, 2)); // Output: 3
        System.out.println("Higher key than 3: " + higherKey(treeMap, 3)); // Output: 5
        System.out.println("Higher key than 6: " + higherKey(treeMap, 6)); // Output: 7
        System.out.println("Higher key than 7: " + higherKey(treeMap, 7)); // Output: null


        // Additional Tests
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("a", 1);
        stringTreeMap.put("c", 3);
        stringTreeMap.put("e", 5);

        System.out.println("Higher key than b: " + higherKey(stringTreeMap, "b")); // Output: c
        System.out.println("Higher key than d: " + higherKey(stringTreeMap, "d")); // Output: e
        System.out.println("Higher key than e: " + higherKey(stringTreeMap, "e")); // Output: null
        System.out.println("Higher key than f: " + higherKey(stringTreeMap, "f")); // Output: null


        // Empty TreeMap Test
        TreeMap<Integer, String> emptyTreeMap = new TreeMap<>();
         System.out.println("Higher key than 2 in empty map: " + higherKey(emptyTreeMap, 2)); // Output: null


    }

    public static <K, V> K higherKey(TreeMap<K, V> treeMap, K key) {
        return treeMap.higherKey(key);
    }
}
