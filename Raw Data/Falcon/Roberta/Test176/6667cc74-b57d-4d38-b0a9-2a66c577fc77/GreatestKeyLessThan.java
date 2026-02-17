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
        Integer result1 = getGreatestKeyLessThan(treeMap, key1);
        System.out.println("Greatest key less than " + key1 + ": " + result1); // Output: 30

        Integer key2 = 15;
        Integer result2 = getGreatestKeyLessThan(treeMap, key2);
        System.out.println("Greatest key less than " + key2 + ": " + result2); // Output: 10


        Integer key3 = 5;
        Integer result3 = getGreatestKeyLessThan(treeMap, key3);
        System.out.println("Greatest key less than " + key3 + ": " + result3); // Output: null

        Integer key4 = 55;  // Test with a key greater than any in the map
        Integer result4 = getGreatestKeyLessThan(treeMap, key4);
        System.out.println("Greatest key less than " + key4 + ": " + result4); // Output: 50

        // Example with an empty TreeMap:
        TreeMap<Integer, String> emptyTreeMap = new TreeMap<>();
        Integer key5 = 25;
        Integer result5 = getGreatestKeyLessThan(emptyTreeMap, key5);
        System.out.println("Greatest key less than " + key5 + " (empty map): " + result5); // Output: null



    }

    public static <K, V> K getGreatestKeyLessThan(TreeMap<K, V> treeMap, K key) {
        if (treeMap == null || treeMap.isEmpty()) {
            return null; 
        }
        return treeMap.lowerKey(key);
    }
}
