import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class CopyTreeMapToTimeline {

    public static void main(String[] args) {
        // Create a sample TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");


        // Method 1: Using putAll() - Suitable for general TreeMaps
        ConcurrentSkipListMap<Integer, String> timeline1 = new ConcurrentSkipListMap<>();
        timeline1.putAll(treeMap); 

        printTimeline("Timeline 1 (putAll):", timeline1);


        // Method 2: Using constructor - Suitable when the source is a TreeMap
        ConcurrentSkipListMap<Integer, String> timeline2 = new ConcurrentSkipListMap<>(treeMap);

        printTimeline("Timeline 2 (constructor):", timeline2);

    }

    private static void printTimeline(String message, ConcurrentSkipListMap<Integer, String> timeline) {
        System.out.println(message);
        for (Integer key : timeline.keySet()) {
            System.out.println("Key: " + key + ", Value: " + timeline.get(key));
        }
        System.out.println("--------------------");
    }

}
