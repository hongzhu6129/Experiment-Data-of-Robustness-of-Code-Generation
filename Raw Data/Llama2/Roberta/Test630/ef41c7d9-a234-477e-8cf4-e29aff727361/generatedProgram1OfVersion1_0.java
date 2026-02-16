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

        int key1 = 25;
        Integer result1 = getLeastKeyGreaterThanOrEqual(treeMap, key1);
        System.out.println("Least key greater than or equal to " + key1 + ": " + result1); // Output: 30

        int key2 = 10;
        Integer result2 = getLeastKeyGreaterThanOrEqual(treeMap, key2);
        System.out.println("Least key greater than or equal to " + key2 + ": " + result2); // Output: 10


        int key3 = 55;
        Integer result3 = getLeastKeyGreaterThanOrEqual(treeMap, key3);
        System.out.println("Least key greater than or equal to " + key3 + ": " + result3); // Output: null


        // Example with String keys
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("orange", 3);

        String key4 = "apricot";
        String result4 = getLeastKeyGreaterThanOrEqual(stringTreeMap, key4);
        System.out.println("Least key greater than or equal to " + key4 + ": " + result4); // Output: banana


         String key5 = "apple";
        String result5 = getLeastKeyGreaterThanOrEqual(stringTreeMap, key5);
        System.out.println("Least key greater than or equal to " + key5 + ": " + result5); // Output: apple

        String key6 = "zucchini"; // Greater than all existing keys
        String result6 = getLeastKeyGreaterThanOrEqual(stringTreeMap, key6);
        System.out.println("Least key greater than or equal to " + key6 + ": " + result6); // Output: null


    }


    public static <K, V> K getLeastKeyGreaterThanOrEqual(TreeMap<K, V> treeMap, K key) {
        return treeMap.ceilingKey(key);
    }
}
