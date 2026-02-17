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

        int key1 = 4;
        Map.Entry<Integer, String> entry1 = getLeastGreaterOrEqual(map, key1);
        System.out.println("For key " + key1 + ": " + entry1); // Output: For key 4: 5=Five

        int key2 = 7;
        Map.Entry<Integer, String> entry2 = getLeastGreaterOrEqual(map, key2);
        System.out.println("For key " + key2 + ": " + entry2); // Output: For key 7: 7=Seven


        int key3 = 8;
        Map.Entry<Integer, String> entry3 = getLeastGreaterOrEqual(map, key3);
        System.out.println("For key " + key3 + ": " + entry3); // Output: For key 8: null


        // Test with empty map
        TreeMap<Integer, String> emptyMap = new TreeMap<>();
        int key4 = 5;
        Map.Entry<Integer, String> entry4 = getLeastGreaterOrEqual(emptyMap, key4);
        System.out.println("For key " + key4 + " (empty map): " + entry4); // Output: For key 5 (empty map): null
    }

    public static <K, V> Map.Entry<K, V> getLeastGreaterOrEqual(TreeMap<K, V> map, K key) {
        if (map == null || map.isEmpty()) {
            return null;
        }

        return map.ceilingEntry(key); 
    }
}
