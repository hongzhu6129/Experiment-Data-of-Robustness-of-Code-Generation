import java.util.TreeMap;

public class GreatestKeyLessThan {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        System.out.println("TreeMap: " + treeMap);


        System.out.println("Greatest key strictly less than 25: " + getGreatestKeyLessThan(treeMap, 25)); // Output: 20
        System.out.println("Greatest key strictly less than 10: " + getGreatestKeyLessThan(treeMap, 10)); // Output: null
        System.out.println("Greatest key strictly less than 5: " + getGreatestKeyLessThan(treeMap, 5));  // Output: null
        System.out.println("Greatest key strictly less than 55: " + getGreatestKeyLessThan(treeMap, 55)); // Output: 50

        // Example with String keys:
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("orange", 3);

        System.out.println("\nString TreeMap: " + stringTreeMap);
        System.out.println("Greatest key strictly less than 'mango': " + getGreatestKeyLessThan(stringTreeMap, "mango")); // Output: orange
        System.out.println("Greatest key strictly less than 'apple': " + getGreatestKeyLessThan(stringTreeMap, "apple")); // Output: null



    }



    public static <K, V> K getGreatestKeyLessThan(TreeMap<K, V> treeMap, K key) {
        if (treeMap == null || treeMap.isEmpty()) {
            return null;
        }

        return treeMap.lowerKey(key); //TreeMap's lowerKey method directly provides the desired functionality.

    }
}
