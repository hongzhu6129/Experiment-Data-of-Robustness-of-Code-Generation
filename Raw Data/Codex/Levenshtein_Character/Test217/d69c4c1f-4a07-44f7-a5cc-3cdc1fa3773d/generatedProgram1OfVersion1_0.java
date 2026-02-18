import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class RemoveLeastKeyMap {

    public static void main(String[] args) {
        // Example usage:
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(5, "Five");
        map.put(2, "Two");

        if (!map.isEmpty()) {
            Map.Entry<Integer, String> leastEntry = removeLeastKeyEntry(map);
            if (leastEntry != null) {
                System.out.println("Removed entry: Key = " + leastEntry.getKey() + ", Value = " + leastEntry.getValue());
            }
        } else {
            System.out.println("Map is empty.");
        }

        System.out.println("Remaining map: " + map);


        // Another example with an empty map initially
        Map<Integer, String> emptyMap = new HashMap<>();
        Map.Entry<Integer, String> leastEntryEmpty = removeLeastKeyEntry(emptyMap); // Should return null

        if (leastEntryEmpty == null) {
            System.out.println("The map was empty, nothing removed.");
        }
    }



    public static Map.Entry<Integer, String> removeLeastKeyEntry(Map<Integer, String> map) {
        if (map.isEmpty()) {
            return null;  // Handle empty map case
        }

        TreeSet<Integer> sortedKeys = new TreeSet<>(map.keySet()); // Use TreeSet for sorted keys
        int leastKey = sortedKeys.first();


        String value = map.remove(leastKey); // Remove and get the value
        return new AbstractMap.SimpleEntry<>(leastKey, value); //AbstractMap is accessible without additional import
    }

     //Helper class to create a SimpleEntry to return. Could also just return an array
     // if Java 9+, we could use Map.entry(key, value) factory method but sticking with Java 8 compatibility here

     private static abstract class AbstractMap{
        public static class SimpleEntry<K,V> implements Map.Entry<K,V> {
            private final K key;
            private V value;
    
            public SimpleEntry(K key, V value) {
                this.key   = key;
                this.value = value;
            }
    
    
            public K getKey() {
                return key;
            }
    
            public V getValue() {
                return value;
            }
    
            public V setValue(V value) {
                V oldValue = this.value;
                this.value = value;
                return oldValue;
            }
        }

     }
}
