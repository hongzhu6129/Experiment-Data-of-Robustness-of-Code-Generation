import java.util.TreeMap;

public class GreatestKeyLessThan {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");

        Integer key1 = 4;
        Integer result1 = getGreatestKeyLessThan(treeMap, key1);
        System.out.println("Greatest key less than " + key1 + ": " + result1); // Output: 3

        Integer key2 = 1;
        Integer result2 = getGreatestKeyLessThan(treeMap, key2);
        System.out.println("Greatest key less than " + key2 + ": " + result2); // Output: null


        Integer key3 = 10;
        Integer result3 = getGreatestKeyLessThan(treeMap, key3);
        System.out.println("Greatest key less than " + key3 + ": " + result3); // Output: 9
    }

    public static <K, V> K getGreatestKeyLessThan(TreeMap<K, V> treeMap, K key) {
        if (treeMap == null || key == null) {
            return null;
        }
        return treeMap.lowerKey(key);


    }
}
