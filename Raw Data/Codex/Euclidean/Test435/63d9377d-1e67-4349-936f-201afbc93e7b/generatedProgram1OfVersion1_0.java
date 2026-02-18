import java.util.TreeMap;

public class LeastKeyGreaterThanGivenKey {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");


        Integer key1 = 25;
        Integer higherKey1 = getLeastKeyGreaterThan(treeMap, key1);
        System.out.println("Least key greater than " + key1 + ": " + higherKey1); // Output: 30

        Integer key2 = 15;
        Integer higherKey2 = getLeastKeyGreaterThan(treeMap, key2);
        System.out.println("Least key greater than " + key2 + ": " + higherKey2); // Output: 20


        Integer key3 = 55;
        Integer higherKey3 = getLeastKeyGreaterThan(treeMap, key3);
        System.out.println("Least key greater than " + key3 + ": " + higherKey3); // Output: null


        Integer key4 = 10;  // Key exists in the map
        Integer higherKey4 = getLeastKeyGreaterThan(treeMap, key4);
        System.out.println("Least key greater than " + key4 + ": " + higherKey4); // Output: 20

         TreeMap<Integer, String> emptyMap = new TreeMap<>();
         Integer key5 = 5;
         Integer higherKey5 = getLeastKeyGreaterThan(emptyMap, key5);
         System.out.println("Least key greater than " + key5 + " in an empty map : " + higherKey5); // Output: null

    }

    public static <K, V> K getLeastKeyGreaterThan(TreeMap<K, V> treeMap, K key) {
        if (treeMap == null || treeMap.isEmpty()) {
            return null;
        }

        return treeMap.higherKey(key); 
    }
}
