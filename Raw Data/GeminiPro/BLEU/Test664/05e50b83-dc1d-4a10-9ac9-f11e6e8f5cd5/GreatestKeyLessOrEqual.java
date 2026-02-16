import java.util.TreeMap;
import java.util.Map;

public class GreatestKeyLessOrEqual {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value mappings
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Populate the TreeMap with some data
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        // Key to search for
        int givenKey = 25;

        // Get the entry associated with the greatest key less than or equal to givenKey
        Map.Entry<Integer, String> entry = treeMap.floorEntry(givenKey);

        // Print the result
        if (entry != null) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        } else {
            System.out.println("No key found less than or equal to " + givenKey);
        }


        // Test with another key
        givenKey = 15;
         entry = treeMap.floorEntry(givenKey);

        if (entry != null) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        } else {
            System.out.println("No key found less than or equal to " + givenKey);
        }

        // Test with a key that exists
        givenKey = 30;
         entry = treeMap.floorEntry(givenKey);

        if (entry != null) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        } else {
            System.out.println("No key found less than or equal to " + givenKey);
        }


        // Test with a key smaller than the smallest
        givenKey = 5;
        entry = treeMap.floorEntry(givenKey);

        if (entry != null) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        } else {
            System.out.println("No key found less than or equal to " + givenKey);
        }
    }
}
