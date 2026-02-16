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

        Integer key2 = 55;
        Integer higherKey2 = getLeastKeyGreaterThan(treeMap, key2);
        System.out.println("Least key greater than " + key2 + ": " + higherKey2); // Output: null


        Integer key3 = 20;
        Integer higherKey3 = getLeastKeyGreaterThan(treeMap, key3);
        System.out.println("Least key greater than " + key3 + ": " + higherKey3); // Output: 30

        // Example with different data types (String keys):
         TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("orange", 3);

        String stringKey = "apricot";
        String higherStringKey = getLeastKeyGreaterThan(stringTreeMap, stringKey);
        System.out.println("Least key greater than " + stringKey + ": " + higherStringKey); // Output: banana


    }

    public static <K, V> K getLeastKeyGreaterThan(TreeMap<K, V> treeMap, K key) {
        return treeMap.higherKey(key);
    }
}
