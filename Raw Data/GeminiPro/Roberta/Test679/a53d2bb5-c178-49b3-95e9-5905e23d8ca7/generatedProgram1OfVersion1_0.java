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

        Integer key1 = 35;
        Integer key2 = 55;
        Integer key3 = 5;
        Integer key4 = 20;


        Integer result1 = getLeastKeyGreaterThanOrEqualTo(treeMap, key1);
        Integer result2 = getLeastKeyGreaterThanOrEqualTo(treeMap, key2);
        Integer result3 = getLeastKeyGreaterThanOrEqualTo(treeMap, key3);
        Integer result4 = getLeastKeyGreaterThanOrEqualTo(treeMap, key4);

        System.out.println("Least key greater than or equal to " + key1 + ": " + result1); // Output: 40
        System.out.println("Least key greater than or equal to " + key2 + ": " + result2); // Output: null
        System.out.println("Least key greater than or equal to " + key3 + ": " + result3); // Output: 10
        System.out.println("Least key greater than or equal to " + key4 + ": " + result4); // Output: 20


    }

    public static <K, V> K getLeastKeyGreaterThanOrEqualTo(TreeMap<K, V> treeMap, K key) {
        return treeMap.ceilingKey(key); 
    }
}
