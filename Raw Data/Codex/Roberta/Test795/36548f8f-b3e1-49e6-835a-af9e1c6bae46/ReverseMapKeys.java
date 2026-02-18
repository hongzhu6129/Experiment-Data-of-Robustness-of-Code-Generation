import java.util.TreeMap;
import java.util.Map;
import java.util.NavigableMap;

public class ReverseMapKeys {

    public static void main(String[] args) {
        // Example TreeMap (already sorted in ascending order of keys)
        Map<Integer, String> studentScores = new TreeMap<>();
        studentScores.put(101, "Alice");
        studentScores.put(102, "Bob");
        studentScores.put(103, "Charlie");
        studentScores.put(104, "David");
        studentScores.put(105, "Eve");

        System.out.println("Original Map: " + studentScores);

        // Method 1: Using NavigableMap's descendingKeySet() (most efficient for sorted maps)
        if (studentScores instanceof NavigableMap) { // Check if it's a NavigableMap (like TreeMap)
            NavigableMap<Integer, String> navigableMap = (NavigableMap<Integer, String>) studentScores;
            System.out.println("Reverse Keys (using descendingKeySet()): " + navigableMap.descendingKeySet());
        } else {
            System.out.println("Map is not Navigable, cannot use descendingKeySet()");


            // Method 2: Using a reversed TreeMap (creates a new map) 
            // Less efficient as it copies the entire map.
            NavigableMap<Integer, String> reversedMap = new TreeMap<>(java.util.Collections.reverseOrder()); 
            reversedMap.putAll(studentScores);
            System.out.println("Reverse Keys (using reversed TreeMap): " + reversedMap.keySet());


            // Method 3: Iterate and store in a list then reverse (For non-NavigableMaps)
            // Also involves creating a new list.
            java.util.List<Integer> keyList = new java.util.ArrayList<>(studentScores.keySet());
            java.util.Collections.reverse(keyList);
            System.out.println("Reverse Keys (using List reversal): " + keyList);

        }

    }
}


