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


        System.out.println("Least key greater than or equal to 25: " + getLeastKeyGreaterThanOrEqualTo(treeMap, 25)); // Output: 30
        System.out.println("Least key greater than or equal to 10: " + getLeastKeyGreaterThanOrEqualTo(treeMap, 10)); // Output: 10
        System.out.println("Least key greater than or equal to 5: " + getLeastKeyGreaterThanOrEqualTo(treeMap, 5));  // Output: 10
        System.out.println("Least key greater than or equal to 60: " + getLeastKeyGreaterThanOrEqualTo(treeMap, 60)); // Output: null


        // Example with String keys (natural ordering)
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("Apple", 1);
        stringTreeMap.put("Banana", 2);
        stringTreeMap.put("Orange", 3);

        System.out.println("Least key greater than or equal to \"Banana\": " + getLeastKeyGreaterThanOrEqualTo(stringTreeMap, "Banana")); // Output: Banana
        System.out.println("Least key greater than or equal to \"Apricot\": " + getLeastKeyGreaterThanOrEqualTo(stringTreeMap, "Apricot")); // Output: Apple (because Apricot comes before Apple)
        System.out.println("Least key greater than or equal to \"Watermelon\": " + getLeastKeyGreaterThanOrEqualTo(stringTreeMap,"Watermelon")); // Output: null



    }

    public static <K, V> K getLeastKeyGreaterThanOrEqualTo(TreeMap<K, V> treeMap, K key) {
        return treeMap.ceilingKey(key); // TreeMap's ceilingKey method directly provides this functionality
    }
}
