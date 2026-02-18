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


        System.out.println("Original TreeMap: " + treeMap);

        // Test cases
        System.out.println("Least key >= 15: " + getLeastKeyGreaterThanOrEqualTo(treeMap, 15)); // Output: 20
        System.out.println("Least key >= 20: " + getLeastKeyGreaterThanOrEqualTo(treeMap, 20)); // Output: 20
        System.out.println("Least key >= 5: " + getLeastKeyGreaterThanOrEqualTo(treeMap, 5));  // Output: 10
        System.out.println("Least key >= 60: " + getLeastKeyGreaterThanOrEqualTo(treeMap, 60)); // Output: null
        System.out.println("Least key >= 35: " + getLeastKeyGreaterThanOrEqualTo(treeMap, 35)); // Output: 40

         // Example with Strings as keys (ensure they are Comparable)
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("Apple", 1);
        stringTreeMap.put("Banana", 2);
        stringTreeMap.put("Orange", 3);

        System.out.println("\nString TreeMap: " + stringTreeMap);
        System.out.println("Least key >= \"Banana\": " + getLeastKeyGreaterThanOrEqualTo(stringTreeMap, "Banana")); // Banana
        System.out.println("Least key >= \"Apricot\": " + getLeastKeyGreaterThanOrEqualTo(stringTreeMap, "Apricot")); // Apple (lexicographically greater than Apricot)
        System.out.println("Least key >= \"Watermelon\": " + getLeastKeyGreaterThanOrEqualTo(stringTreeMap, "Watermelon")); // null


    }


    public static <K, V> K getLeastKeyGreaterThanOrEqualTo(TreeMap<K, V> treeMap, K key) {
        // Use ceilingKey() method of TreeMap to efficiently find the least key greater than or equal to the given key.
        return treeMap.ceilingKey(key); 
    }
}
