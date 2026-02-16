import java.util.TreeMap;
import java.util.Map;

public class GreatestKeyVisualization {

    public static void main(String[] args) {
        // Example usage:
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(5, "Five");
        treeMap.put(10, "Ten");
        treeMap.put(15, "Fifteen");
        treeMap.put(20, "Twenty");

        int givenKey = 12;

        visualizeGreatestKey(treeMap, givenKey);


        givenKey = 1; // Example with the smallest key
        visualizeGreatestKey(treeMap,givenKey);


        givenKey = 25; // Example with key greater than all present
        visualizeGreatestKey(treeMap, givenKey);
    }

    public static void visualizeGreatestKey(TreeMap<Integer, String> treeMap, int givenKey) {
        if (treeMap.isEmpty()) {
            System.out.println("TreeMap is empty.");
            return;
        }
        Integer greatestKey = treeMap.floorKey(givenKey);

        if (greatestKey != null) {
            System.out.println("Given Key: " + givenKey);
            System.out.println("Greatest Key Less Than or Equal To: " + greatestKey);
            System.out.println("Associated Value: " + treeMap.get(greatestKey));


            // Basic visualization (you can customize this further)
            for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
                String marker = (entry.getKey() == greatestKey) ? "<==" : "";  //Mark the greatest key
                System.out.println(entry.getKey() + ": " + entry.getValue() + " " + marker);
            }
            System.out.println("--------------------");

        } else {
            System.out.println("Given Key: " + givenKey);
            System.out.println("No key less than or equal to " + givenKey + " found."); // Handle the case where there's no smaller key
            System.out.println("--------------------");
        }
    }
}
