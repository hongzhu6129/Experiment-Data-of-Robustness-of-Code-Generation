import java.util.TreeMap;

public class GreatestKeyLessThanOrEqual {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "Ten");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");

        int key1 = 25;
        int key2 = 30;
        int key3 = 5;
        int key4 = 60;


        printFloorEntry(map, key1); // Output: 20=Twenty
        printFloorEntry(map, key2); // Output: 30=Thirty
        printFloorEntry(map, key3); // Output: null (no key less than or equal to 5)
        printFloorEntry(map, key4); // Output: 50=Fifty

    }

    private static void printFloorEntry(TreeMap<Integer, String> map, int key) {
        java.util.Map.Entry<Integer, String> entry = map.floorEntry(key);
        if (entry != null) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        } else {
            System.out.println(null); // Or handle the case as needed
        }
    }
}
