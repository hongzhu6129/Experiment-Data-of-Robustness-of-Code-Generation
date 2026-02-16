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


        // Example with String keys:
         TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("cherry", 3);

        String stringKey = "apricot";  // Between "apple" and "banana"
        String higherStringKey = getLeastKeyGreaterThan(stringTreeMap, stringKey);
        System.out.println("Least key greater than " + stringKey + ": " + higherStringKey); // Output: banana


        stringKey = "date"; // Greater than all existing keys
        higherStringKey = getLeastKeyGreaterThan(stringTreeMap, stringKey);
        System.out.println("Least key greater than " + stringKey + ": " + higherStringKey); // Output: null
    }

    public static <K, V> K getLeastKeyGreaterThan(TreeMap<K, V> treeMap, K key) {
        return treeMap.higherKey(key);
    }
}
