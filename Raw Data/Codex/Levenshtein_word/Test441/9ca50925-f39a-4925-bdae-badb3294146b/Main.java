import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs. TreeMap automatically sorts keys.
        Map<Integer, String> map = new TreeMap<>();

        // Add some sample data
        map.put(5, "Five");
        map.put(2, "Two");
        map.put(8, "Eight");
        map.put(1, "One");
        map.put(10, "Ten");


        if (!map.isEmpty()) { // Check if the map is empty before getting keys
            Integer firstKey = map.keySet().iterator().next(); // Get the first key
            Integer lastKey = map.descendingKeySet().iterator().next();  //Efficient way to get the last key
            

            System.out.println("First (Lowest) Key: " + firstKey);
            System.out.println("Last (Highest) Key: " + lastKey);


        } else {
            System.out.println("The map is empty.");
        }
    }
}
