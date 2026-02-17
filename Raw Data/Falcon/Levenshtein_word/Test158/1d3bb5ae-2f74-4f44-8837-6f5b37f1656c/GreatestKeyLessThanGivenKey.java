import java.util.TreeMap;
import java.util.Map.Entry;

public class GreatestKeyLessThanGivenKey {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value mappings
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Populate the TreeMap with some sample data
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");

        // Key to search for
        int givenKey = 25;

        // Find the entry associated with the greatest key less than or equal to the given key
        Entry<Integer, String> entry = treeMap.floorEntry(givenKey);

        if (entry != null) {
            System.out.println("Key-Value mapping for greatest key less than or equal to " + givenKey + ":");
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        } else {
            System.out.println("No key found less than or equal to " + givenKey);
        }



        // Example with the minimum key (if givenKey is smaller than any existing key)
        givenKey = 5;

        entry = treeMap.floorEntry(givenKey); 

        if (entry != null) {
            System.out.println("Key-Value mapping for greatest key less than or equal to  " + givenKey + ":");
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        } else {
            System.out.println("No key found less than or equal to " + givenKey);
        }


         // Example where givenKey is larger than all keys in the map - will return the largest key present.
        givenKey = 60;

        entry = treeMap.floorEntry(givenKey); 

        if (entry != null) {
            System.out.println("Key-Value mapping for greatest key less than or equal to  " + givenKey + ":");
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        } else {
            System.out.println("No key found less than or equal to " + givenKey);
        }
    }
}
