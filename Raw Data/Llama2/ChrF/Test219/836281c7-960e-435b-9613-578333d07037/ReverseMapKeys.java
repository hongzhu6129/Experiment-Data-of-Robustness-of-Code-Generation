import java.util.TreeMap;
import java.util.Map;
import java.util.NavigableMap;

public class ReverseMapKeys {

    public static void main(String[] args) {
        // Create a sample TreeMap (naturally sorted by key)
        Map<Integer, String> originalMap = new TreeMap<>();
        originalMap.put(1, "One");
        originalMap.put(5, "Five");
        originalMap.put(2, "Two");
        originalMap.put(4, "Four");
        originalMap.put(3, "Three");

        // Get a reverse view of the keys using descendingKeySet()
        NavigableMap<Integer, String> navigableMap = (NavigableMap<Integer, String>) originalMap; // Cast to NavigableMap
        NavigableMap<Integer, String> reversedMap = navigableMap.descendingMap(); // Get the reverse view
        System.out.println("Original map: " + originalMap);        
        System.out.println("Reversed map (keys only): " + reversedMap.keySet());



        // Alternative method using descendingKeySet() directly if you only need the keys:
        System.out.print("Reversed keys using descendingKeySet(): ");
        for (Integer key : navigableMap.descendingKeySet()) { // Iterate directly in reverse order
            System.out.print(key + " ");
        }

    }
}
