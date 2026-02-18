import java.util.TreeMap;

public class CeilingKey {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");

        int key1 = 4;
        Integer ceilingKey1 = findCeilingKey(treeMap, key1);
        System.out.println("Ceiling key for " + key1 + ": " + ceilingKey1); // Output: 5

        int key2 = 9;
        Integer ceilingKey2 = findCeilingKey(treeMap, key2);
        System.out.println("Ceiling key for " + key2 + ": " + ceilingKey2); // Output: null


        int key3 = 0;  // Test a key smaller than the smallest
        Integer ceilingKey3 = findCeilingKey(treeMap, key3);
        System.out.println("Ceiling key for " + key3 + ": " + ceilingKey3); // Output: 1



        // Example with a different data type (String keys)
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("orange", 3);

        String key4 = "apricot";
        String ceilingKey4 = findCeilingKey(stringTreeMap, key4);
        System.out.println("Ceiling key for " + key4 + ": " + ceilingKey4); // Output: banana

    }



    public static <K, V> K findCeilingKey(TreeMap<K, V> treeMap, K key) {
        return treeMap.higherKey(key); // Directly use TreeMap's higherKey method
    }
}



