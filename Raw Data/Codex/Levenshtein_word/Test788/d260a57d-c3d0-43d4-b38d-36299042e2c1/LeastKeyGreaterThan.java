import java.util.TreeMap;

public class LeastKeyGreaterThan {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        Integer key1 = 35;
        Integer result1 = getLeastKeyGreaterThan(treeMap, key1);
        System.out.println("Least key greater than or equal to " + key1 + ": " + result1); // Output: 40

        Integer key2 = 60;
        Integer result2 = getLeastKeyGreaterThan(treeMap, key2);
        System.out.println("Least key greater than or equal to " + key2 + ": " + result2); // Output: null


        Integer key3 = 10; // Example with a key that exists
        Integer result3 = getLeastKeyGreaterThan(treeMap, key3);
        System.out.println("Least key greater than or equal to " + key3 + ": " + result3); // Output: 10


        Integer key4 = 15; // Example between 10 and 20
        Integer result4 = getLeastKeyGreaterThan(treeMap, key4);
        System.out.println("Least key greater than or equal to " + key4 + ": " + result4); // Output: 20

    }

    public static <K, V> K getLeastKeyGreaterThan(TreeMap<K, V> treeMap, K key) {
        return treeMap.ceilingKey(key); 
    }
}
