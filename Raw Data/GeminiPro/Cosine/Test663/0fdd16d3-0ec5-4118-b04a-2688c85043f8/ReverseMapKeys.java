import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.NavigableMap;

public class ReverseMapKeys {

    public static void main(String[] args) {
        // Create a TreeMap (sorted map)
        Map<String, Integer> map = new TreeMap<>();

        // Populate the map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        map.put("Grape", 4);

        // Get a reverse order view of the keys using descendingKeySet()
        NavigableMap<String, Integer> navigableMap = new TreeMap<>(map); // Or if map is already a TreeMap, just cast: (NavigableMap<String, Integer>) map;
        Set<String> reverseKeys = navigableMap.descendingKeySet();

        // Print the keys in reverse order
        System.out.println("Keys in reverse order:");
        for (String key : reverseKeys) {
            System.out.println(key);
        }


        //Alternative approach using a Comparator (for any type of Map):
        System.out.println("\nAlternative approach (using Comparator):");
        TreeMap<String, Integer> reversedMap = new TreeMap<>((s1, s2) -> s2.compareTo(s1)); // Reverse Comparator
        reversedMap.putAll(map); // Populate the reversed map

        for(String key : reversedMap.keySet()){
            System.out.println(key);
        }
    }
}
