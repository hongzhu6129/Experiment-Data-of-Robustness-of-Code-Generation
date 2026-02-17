import java.util.TreeMap;

public class FloorKey {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "Ten");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");


        int key1 = 25;
        int key2 = 15;
        int key3 = 5;
        int key4 = 55; //Key greater than any in the map
        int key5 = 30; // Key equal to a key in the map


        printFloorEntry(map, key1); // Output: 20 -> Twenty
        printFloorEntry(map, key2); // Output: 10 -> Ten
        printFloorEntry(map, key3); // Output: null (no key less than or equal to 5)
        printFloorEntry(map, key4); // Output: 50 -> Fifty
        printFloorEntry(map, key5); // Output: 30 -> Thirty


    }

    private static void printFloorEntry(TreeMap<Integer, String> map, int key) {
        Integer floorKey = map.floorKey(key);

        if (floorKey != null) {
            String value = map.get(floorKey);
            System.out.println(floorKey + " -> " + value);
        } else {
            System.out.println("null"); // Indicate no such key
        }
    }
}

