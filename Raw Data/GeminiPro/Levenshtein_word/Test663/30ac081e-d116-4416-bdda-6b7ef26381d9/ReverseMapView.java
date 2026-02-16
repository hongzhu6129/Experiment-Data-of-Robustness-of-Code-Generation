import java.util.TreeMap;
import java.util.Map;
import java.util.NavigableMap;

public class ReverseMapView {

    public static void main(String[] args) {
        // Create a TreeMap (sorted map)
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        // Get a reverse view of the keys using descendingKeySet()
        NavigableMap<Integer, String> reverseMap = ((TreeMap<Integer, String>) map).descendingMap();


        // Print the original map
        System.out.println("Original Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Print the reversed map 
        System.out.println("\nReversed Map (Keys):");
         for (Map.Entry<Integer, String> entry : reverseMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


         // Alternatively, if you ONLY need the keys in reverse order:
        System.out.println("\nReversed Keys Only:");
        for (Integer key : ((TreeMap<Integer, String>) map).descendingKeySet()) {
            System.out.println(key);
        }
    }
}
