import java.util.TreeMap;

public class LeastKeyGreaterThanOrEqual {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        Integer key1 = 35;
        Integer result1 = getLeastKeyGreaterThanOrEqual(treeMap, key1);
        System.out.println("Least key greater than or equal to " + key1 + ": " + result1); // Output: 40

        Integer key2 = 20;
        Integer result2 = getLeastKeyGreaterThanOrEqual(treeMap, key2);
        System.out.println("Least key greater than or equal to " + key2 + ": " + result2); // Output: 20

        Integer key3 = 60;
        Integer result3 = getLeastKeyGreaterThanOrEqual(treeMap, key3);
        System.out.println("Least key greater than or equal to " + key3 + ": " + result3); // Output: null


        //Example with String keys
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("cherry", 3);

        String key4 = "apricot";
        String result4 = getLeastKeyGreaterThanOrEqual(stringTreeMap, key4);
        System.out.println("Least key greater than or equal to " + key4 + ": " + result4); // Output: banana



    }

    public static <K, V> K getLeastKeyGreaterThanOrEqual(TreeMap<K, V> treeMap, K key) {
       return treeMap.ceilingKey(key);
    }
}
