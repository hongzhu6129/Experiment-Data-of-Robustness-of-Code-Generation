import java.util.TreeMap;

public class GreatestKeyStrictlyLessThan {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");

        Integer key1 = 4;
        Integer result1 = getGreatestKeyStrictlyLessThan(treeMap, key1);
        System.out.println("Greatest key strictly less than " + key1 + ": " + result1); // Output: 3

        Integer key2 = 1;
        Integer result2 = getGreatestKeyStrictlyLessThan(treeMap, key2);
        System.out.println("Greatest key strictly less than " + key2 + ": " + result2); // Output: null


        Integer key3 = 10;
        Integer result3 = getGreatestKeyStrictlyLessThan(treeMap, key3);
        System.out.println("Greatest key strictly less than " + key3 + ": " + result3); // Output: 9
    }


    public static <K, V> K getGreatestKeyStrictlyLessThan(TreeMap<K, V> treeMap, K key) {
        if (treeMap == null || treeMap.isEmpty()) {
            return null;
        }

        return treeMap.lowerKey(key); 
    }
}
