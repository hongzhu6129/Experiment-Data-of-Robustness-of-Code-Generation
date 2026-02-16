import java.util.TreeMap;
import java.util.Map;

public class LeastGreaterOrEqualKey {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");

        System.out.println(getLeastGreaterOrEqual(map, 2));  // Output: 3=Three
        System.out.println(getLeastGreaterOrEqual(map, 3));  // Output: 3=Three
        System.out.println(getLeastGreaterOrEqual(map, 6));  // Output: 7=Seven
        System.out.println(getLeastGreaterOrEqual(map, 10)); // Output: null


    }

    public static <K extends Comparable<K>, V> Map.Entry<K, V> getLeastGreaterOrEqual(TreeMap<K, V> map, K key) {
        // Use ceilingEntry to efficiently find the least key greater than or equal to the given key.
       return map.ceilingEntry(key); 
    }
}
