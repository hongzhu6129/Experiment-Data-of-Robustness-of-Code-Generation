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

        System.out.println("Least key greater than 15: " + getLeastKeyGreaterThan(treeMap, 15)); // Output: 20
        System.out.println("Least key greater than 25: " + getLeastKeyGreaterThan(treeMap, 25)); // Output: 30
        System.out.println("Least key greater than 50: " + getLeastKeyGreaterThan(treeMap, 50)); // Output: null
        System.out.println("Least key greater than 5: " + getLeastKeyGreaterThan(treeMap, 5));   // Output: 10
        System.out.println("Least key greater than -5: " + getLeastKeyGreaterThan(treeMap, -5));   // Output: 10



        // Example with strings as keys:
         TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
         stringTreeMap.put("apple", 1);
         stringTreeMap.put("banana", 2);
         stringTreeMap.put("orange", 3);

        System.out.println("Least key greater than \"apricot\": " + getLeastKeyGreaterThan(stringTreeMap, "apricot")); // Output: banana
        System.out.println("Least key greater than \"zoo\": " + getLeastKeyGreaterThan(stringTreeMap, "zoo"));       // Output: null


    }




    public static <K, V> K getLeastKeyGreaterThan(TreeMap<K, V> treeMap, K key) {

        //TreeMap's higherKey method efficiently finds the least key strictly greater than the given key.
        return treeMap.higherKey(key); 
    }
}
