import java.util.TreeMap;
import java.util.Map;

public class FloorKeyMapping {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value mappings. TreeMap is used because
        // it automatically sorts keys in ascending order and provides efficient
        // methods for finding floor keys.
        TreeMap<Integer, String> myMap = new TreeMap<>();

        // Populate the map with some sample data
        myMap.put(10, "Ten");
        myMap.put(20, "Twenty");
        myMap.put(30, "Thirty");
        myMap.put(40, "Forty");
        myMap.put(50, "Fifty");


        // Demonstrate how to get the floor key and its associated value
        demonstrateFloorEntry(myMap, 15);  // Key exists, but smaller - expect 10
        demonstrateFloorEntry(myMap, 20);  // Key exists- expect 20
        demonstrateFloorEntry(myMap, 25);  // Key doesn't exist - expect 20
        demonstrateFloorEntry(myMap, 5);   // Key is smaller than the smallest - expect null
        demonstrateFloorEntry(myMap, 55);   // Key is larger than the largest - expect 50



    }

    public static void demonstrateFloorEntry(TreeMap<Integer, String> map, Integer key) {
        Map.Entry<Integer, String> floorEntry = map.floorEntry(key);

        if (floorEntry != null) {
            Integer floorKey = floorEntry.getKey();
            String floorValue = floorEntry.getValue();
            System.out.println("For key " + key + ", the floor key is: " + floorKey + " and the associated value is: " + floorValue);
        } else {
            System.out.println("For key " + key + ", there is no floor key (key is smaller than the smallest key in the map).");
        }
        System.out.println("--------------------");
    }
}

