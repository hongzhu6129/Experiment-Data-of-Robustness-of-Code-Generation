import java.util.TreeMap;

public class LeastKeyGreaterThan {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");

        Integer key1 = 4;
        Integer higherKey1 = getLeastKeyGreaterThan(treeMap, key1);
        System.out.println("Least key greater than " + key1 + ": " + higherKey1); // Output: 5

        Integer key2 = 7;
        Integer higherKey2 = getLeastKeyGreaterThan(treeMap, key2);
        System.out.println("Least key greater than " + key2 + ": " + higherKey2); // Output: 9


        Integer key3 = 9;
        Integer higherKey3 = getLeastKeyGreaterThan(treeMap, key3);
        System.out.println("Least key greater than " + key3 + ": " + higherKey3); // Output: null


        Integer key4 = 0;
        Integer higherKey4 = getLeastKeyGreaterThan(treeMap, key4);
        System.out.println("Least key greater than " + key4 + ": " + higherKey4); // Output: 1


    }

    public static <K, V> K getLeastKeyGreaterThan(TreeMap<K, V> treeMap, K key) {
        return treeMap.higherKey(key);
    }
}
