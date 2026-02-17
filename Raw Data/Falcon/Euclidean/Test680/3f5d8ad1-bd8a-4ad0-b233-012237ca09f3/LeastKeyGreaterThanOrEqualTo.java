import java.util.TreeMap;
import java.util.Map;

public class LeastKeyGreaterThanOrEqualTo {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");

        // Test cases
        System.out.println("Key 2: " + getKeyValueForLeastKeyGreaterThanOrEqualTo(treeMap, 2)); // Output: Key 3: {3=Three}
        System.out.println("Key 3: " + getKeyValueForLeastKeyGreaterThanOrEqualTo(treeMap, 3)); // Output: Key 3: {3=Three}
        System.out.println("Key 4: " + getKeyValueForLeastKeyGreaterThanOrEqualTo(treeMap, 4)); // Output: Key 5: {5=Five}
        System.out.println("Key 10: " + getKeyValueForLeastKeyGreaterThanOrEqualTo(treeMap, 10)); // Output: Key 10: null

        // Example with strings:
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("apple", 1);
        stringTreeMap.put("banana", 2);
        stringTreeMap.put("cherry", 3);

        System.out.println("Key 'apricot': " + getKeyValueForLeastKeyGreaterThanOrEqualTo(stringTreeMap, "apricot")); // Output: Key 'apricot': {banana=2}
        System.out.println("Key 'banana': " + getKeyValueForLeastKeyGreaterThanOrEqualTo(stringTreeMap, "banana")); // Output: Key 'banana': {banana=2}



    }


    public static <K, V> Map.Entry<K, V> getKeyValueForLeastKeyGreaterThanOrEqualTo(TreeMap<K, V> treeMap, K key) {
        if (treeMap == null || treeMap.isEmpty()) {
            return null;
        }

        K leastKeyGreaterThanOrEqualTo = treeMap.ceilingKey(key);  // Use ceilingKey to find the least key >= given key

        if (leastKeyGreaterThanOrEqualTo != null) {
            // If such a key exists, return the key-value mapping as a Map.Entry
            return Map.entry(leastKeyGreaterThanOrEqualTo, treeMap.get(leastKeyGreaterThanOrEqualTo)); 
        } else {
            return null; // Return null if no such key exists
        }
    }
}
