import java.util.Map;
import java.util.TreeMap;
import java.util.SortedMap;

public class TailMap {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs in sorted order
        TreeMap<Integer, String> map = new TreeMap<>();

        // Populate the map with some sample data
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");

        // Define the key from which we want to get the tail portion
        int fromKey = 3;


        // Get the portion of the map whose keys are greater than or equal to fromKey (inclusive)
        SortedMap<Integer, String> tailMapInclusive = map.tailMap(fromKey);
        System.out.println("Tail Map (Inclusive): " + tailMapInclusive);

        // Get the portion of the map whose keys are strictly greater than fromKey (exclusive)
        // You can also achieve this using a slightly different approach:
        SortedMap<Integer,String> tailMapExclusive = map.tailMap(fromKey + 1); // Add 1 to exclude fromKey
        System.out.println("Tail Map (Exclusive): " + tailMapExclusive);

        //Example with String keys (remember to compare them properly):
        TreeMap<String, Integer> stringMap = new TreeMap<>();
        stringMap.put("A", 1);
        stringMap.put("B", 2);
        stringMap.put("C", 3);
        stringMap.put("D", 4);

        String fromStringKey = "B";
        SortedMap<String, Integer> stringTailMapInclusive = stringMap.tailMap(fromStringKey);
        System.out.println("String Tail Map (Inclusive): " + stringTailMapInclusive);



    }
}
