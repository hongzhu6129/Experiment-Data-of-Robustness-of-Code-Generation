import java.util.TreeMap;
import java.util.Map;

public class FillMapPortion {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");

        int givenKey = 6;
        String fillValue = "Filled";

        fillPortion(map, givenKey, fillValue);

        // Print the updated map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }



        //Another Example
         TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(2, "Two");
        map2.put(4, "Four");
        map2.put(6, "Six");
        map2.put(8, "Eight");
        map2.put(10, "Ten");

        int givenKey2 = 3;  // Example key
        String fillValue2 = "Filled";

        fillPortion(map2, givenKey2, fillValue2);

        // Print the updated map
        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


    private static void fillPortion(TreeMap<Integer, String> map, int givenKey, String fillValue) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() < givenKey) {
                map.put(entry.getKey(), fillValue); // Replace existing value
            } else {
                break; // Stop iterating once keys >= givenKey are encountered (TreeMap is sorted)
            }
        }
    }
}

