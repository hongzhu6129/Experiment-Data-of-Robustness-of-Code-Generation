import java.util.Map;
import java.util.TreeMap;
import java.util.SortedMap;

public class TailMapExample {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs. TreeMap is used because
        // it maintains the natural ordering of keys, which is essential for
        // getting a portion of the map based on key comparison.
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Populate the TreeMap with some sample data.
        employeeMap.put(101, "Alex");
        employeeMap.put(102, "Brian");
        employeeMap.put(103, "Charles");
        employeeMap.put(104, "David");
        employeeMap.put(105, "Edward");


        // Get the portion of the map whose keys are greater than or equal to 103 (inclusive).
        SortedMap<Integer, String> tailMapInclusive = employeeMap.tailMap(103);

        System.out.println("Tail Map (Inclusive): " + tailMapInclusive);



        // Get the portion of the map whose keys are strictly greater than 103 (exclusive).
        SortedMap<Integer, String> tailMapExclusive = employeeMap.tailMap(103, false);

        System.out.println("Tail Map (Exclusive): " + tailMapExclusive);

        //Example with String keys (natural ordering):
         TreeMap<String, Integer> stringKeyMap = new TreeMap<>();

        stringKeyMap.put("Apple", 1);
        stringKeyMap.put("Banana", 2);
        stringKeyMap.put("Cherry", 3);
        stringKeyMap.put("Date", 4);

        SortedMap<String, Integer> stringTailMap = stringKeyMap.tailMap("Banana");
        System.out.println("String Tail Map: " + stringTailMap); 



    }
}
