import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TailMap {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Populate the TreeMap
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");
        treeMap.put(11, "Eleven");


        int givenKey = 4; // Example given key

        // Get the portion of the map whose keys are greater than givenKey (inclusive)
        Map<Integer, String> tailMapInclusive = treeMap.tailMap(givenKey);
        System.out.println("Tail Map (inclusive): " + tailMapInclusive);


        // Get the portion of the map whose keys are strictly greater than givenKey
        Map<Integer, String> tailMapExclusive = treeMap.tailMap(givenKey, false);
        System.out.println("Tail Map (exclusive): " + tailMapExclusive);



        // Using streams for more complex filtering within the tailMap (example):
         givenKey = 3;
        Map<Integer, String> filteredTailMap = treeMap.tailMap(givenKey) // Get tail map
                .entrySet().stream()             // Convert to stream
                .filter(entry -> entry.getValue().length() > 3) // Filter by value length (example)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); // Collect back into a map

        System.out.println("Filtered Tail Map: " + filteredTailMap);

    }
}
