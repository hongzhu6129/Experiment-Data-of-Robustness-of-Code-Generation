import java.util.ConcurrentNavigableMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MapPortion {

    public static void main(String[] args) {
        // Example usage:
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");


        int givenKey = 6;

        // Get the portion of the map whose keys are strictly less than givenKey.
        NavigableMap<Integer, String> headMap = map.headMap(givenKey, false);  // false for strictly less than


        // Print the headMap (portion of the original map)
        System.out.println("Portion of map with keys strictly less than " + givenKey + ":");
        System.out.println(headMap);



        // Example with ConcurrentNavigableMap (thread-safe):
        ConcurrentNavigableMap<Integer, String> concurrentMap = new java.util.concurrent.ConcurrentSkipListMap<>();
        concurrentMap.put(2, "Two");
        concurrentMap.put(4, "Four");
        concurrentMap.put(6, "Six");
        concurrentMap.put(8, "Eight");
        concurrentMap.put(10, "Ten");

        int concurrentGivenKey = 7;

        ConcurrentNavigableMap<Integer, String> concurrentHeadMap = concurrentMap.headMap(concurrentGivenKey, false);

        System.out.println("\nPortion of concurrent map with keys strictly less than " + concurrentGivenKey + ":");
        System.out.println(concurrentHeadMap);
    }
}
