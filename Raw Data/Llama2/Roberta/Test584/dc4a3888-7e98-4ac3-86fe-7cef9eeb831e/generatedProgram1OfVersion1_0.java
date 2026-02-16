import java.util.TreeMap;
import java.util.Map;

public class GreatestKeyVisualization {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value pairs. TreeMap is used because it maintains sorted order of keys.
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Populate the TreeMap with some sample data
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        // Key to search for
        int givenKey = 35;

        // Get the entry associated with the greatest key less than or equal to the given key
        Map.Entry<Integer, String> entry = treeMap.floorEntry(givenKey);


        if (entry != null) {
            // Visualize the key-value pair
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

            // Additional visualization (optional - you can customize this part)
            visualizeTreeMap(treeMap, entry.getKey()); 

        } else {
            System.out.println("No key found less than or equal to " + givenKey);
        }
    }


    // Optional:  A simple visualization method (you can customize this)
    public static void visualizeTreeMap(TreeMap<Integer, String> map, int highlightKey) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String output = entry.getKey() + ":" + entry.getValue();
            if (entry.getKey() == highlightKey) {
                output = ">> " + output + " <<"; // Highlight the found key
            }
            System.out.println(output);
        }
        System.out.println("---------------------"); // Separator
    }
}
