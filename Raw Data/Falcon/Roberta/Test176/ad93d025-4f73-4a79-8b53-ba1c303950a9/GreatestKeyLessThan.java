import java.util.TreeMap;

public class GreatestKeyLessThan {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        Integer key1 = 35;
        Integer key2 = 15;
        Integer key3 = 5;
        Integer key4 = 55; // Key greater than all existing keys

        System.out.println("Greatest key less than " + key1 + ": " + getGreatestKeyLessThan(treeMap, key1)); // Output: 30
        System.out.println("Greatest key less than " + key2 + ": " + getGreatestKeyLessThan(treeMap, key2)); // Output: 10
        System.out.println("Greatest key less than " + key3 + ": " + getGreatestKeyLessThan(treeMap, key3)); // Output: null
        System.out.println("Greatest key less than " + key4 + ": " + getGreatestKeyLessThan(treeMap, key4)); // Output: 50

     }

    public static <K, V> K getGreatestKeyLessThan(TreeMap<K, V> treeMap, K key) {
        if (treeMap == null || treeMap.isEmpty()) {
            return null; 
        }

        return treeMap.lowerKey(key); 
    }
}
