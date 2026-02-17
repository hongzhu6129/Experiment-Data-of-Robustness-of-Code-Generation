import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveLargestSetEntry {

    public static void main(String[] args) {
        // Example usage:
        Map<String, Set<Integer>> map = new HashMap<>();

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        map.put("A", set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        map.put("B", set2);

        Set<Integer> set3 = new HashSet<>();
        set3.add(6);
        map.put("C", set3);

        Map.Entry<String, Set<Integer>> largestEntry = removeLargestSet(map);

        if (largestEntry != null) {
            System.out.println("Removed key: " + largestEntry.getKey());
            System.out.println("Removed value (set): " + largestEntry.getValue());
        } else {
            System.out.println("Map is empty or null.");
        }

        System.out.println("Remaining map: " + map);


    }

    public static Map.Entry<String, Set<Integer>> removeLargestSet(Map<String, Set<Integer>> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }

        Map.Entry<String, Set<Integer>> largestEntry = null;
        int largestSize = -1;

        for (Map.Entry<String, Set<Integer>> entry : map.entrySet()) {
            int currentSize = entry.getValue().size();
            if (currentSize > largestSize) {
                largestSize = currentSize;
                largestEntry = entry;
            }
        }


        if (largestEntry != null) {
            map.remove(largestEntry.getKey()); // Remove the entry from the map
            return largestEntry;              // Return the removed largest entry.
        }

        return null; // Shouldn't happen unless map is null or empty (already checked)
    }

}
