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
        Integer result1 = getLeastKeyGreaterThan(treeMap, key1);
        System.out.println("Least key greater than " + key1 + ": " + result1); // Output: 5

        Integer key2 = 7;
        Integer result2 = getLeastKeyGreaterThan(treeMap, key2);
        System.out.println("Least key greater than " + key2 + ": " + result2); // Output: 9

        Integer key3 = 9;
        Integer result3 = getLeastKeyGreaterThan(treeMap, key3);
        System.out.println("Least key greater than " + key3 + ": " + result3); // Output: null


        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("cherry", 3);

        String key4 = "banana";
        String result4 = getLeastKeyGreaterThan(stringTreeMap, key4);
         System.out.println("Least key greater than " + key4 + ": " + result4); // cherry

         String key5 = "cherry";
        String result5 = getLeastKeyGreaterThan(stringTreeMap, key5);
         System.out.println("Least key greater than " + key5 + ": " + result5); // null
    }

    public static <K, V> K getLeastKeyGreaterThan(TreeMap<K, V> treeMap, K key) {
        return treeMap.higherKey(key);
    }
}
