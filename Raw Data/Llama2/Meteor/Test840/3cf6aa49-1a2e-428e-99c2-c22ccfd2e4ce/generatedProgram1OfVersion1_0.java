import java.util.TreeMap;

public class LeastKeyGreaterThanOrEqualTo {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        Integer key1 = 25;
        Integer result1 = getLeastKeyGreaterThanOrEqualTo(treeMap, key1);
        System.out.println("Least key greater than or equal to " + key1 + ": " + result1); // Output: 30

        Integer key2 = 10;
        Integer result2 = getLeastKeyGreaterThanOrEqualTo(treeMap, key2);
        System.out.println("Least key greater than or equal to " + key2 + ": " + result2); // Output: 10


        Integer key3 = 55;
        Integer result3 = getLeastKeyGreaterThanOrEqualTo(treeMap, key3);
        System.out.println("Least key greater than or equal to " + key3 + ": " + result3); // Output: null


        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("orange", 3);

        String key4 = "apricot";
        String result4 = getLeastKeyGreaterThanOrEqualTo(stringTreeMap, key4);
        System.out.println("Least key greater than or equal to " + key4 + ": " + result4); // Output: banana


         String key5 = "apple";
        String result5 = getLeastKeyGreaterThanOrEqualTo(stringTreeMap, key5);
        System.out.println("Least key greater than or equal to " + key5 + ": " + result5); // Output: apple


        String key6 = "zebra";
        String result6= getLeastKeyGreaterThanOrEqualTo(stringTreeMap, key6);
        System.out.println("Least key greater than or equal to " + key6 + ": " + result6); // Output: null

    }

    public static <K, V> K getLeastKeyGreaterThanOrEqualTo(TreeMap<K, V> treeMap, K key) {
        return treeMap.ceilingKey(key); 
    }
}
