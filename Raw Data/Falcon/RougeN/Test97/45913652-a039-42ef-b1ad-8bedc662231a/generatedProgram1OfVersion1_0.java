import java.util.TreeMap;

public class GreatestKeyLessThanOrEqualTo {

    public static void main(String[] args) {
        // Create a TreeMap to store key-value mappings
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add some key-value pairs
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(5, "Five");
        treeMap.put(7, "Seven");
        treeMap.put(9, "Nine");


        // Get the key-value mapping associated with the greatest key less than or equal to a given key
        int givenKey1 = 4;
        java.util.Map.Entry<Integer, String> entry1 = treeMap.floorEntry(givenKey1);
        if (entry1 != null) {
            System.out.println("For key " + givenKey1 + ": Key = " + entry1.getKey() + ", Value = " + entry1.getValue());
        } else {
            System.out.println("No key less than or equal to " + givenKey1 + " found.");
        }



        int givenKey2 = 5; // Example where the key exists
        java.util.Map.Entry<Integer, String> entry2 = treeMap.floorEntry(givenKey2);
        if (entry2 != null) {
            System.out.println("For key " + givenKey2 + ": Key = " + entry2.getKey() + ", Value = " + entry2.getValue());
        } else {
            System.out.println("No key less than or equal to " + givenKey2 + " found."); // Won't execute in this case
        }


        int givenKey3 = 0; // Example where the key is smaller than the smallest key
        java.util.Map.Entry<Integer, String> entry3 = treeMap.floorEntry(givenKey3);
        if (entry3 != null) {
            System.out.println("For key " + givenKey3 + ": Key = " + entry3.getKey() + ", Value = " + entry3.getValue());
        } else {
            System.out.println("No key less than or equal to " + givenKey3 + " found."); 
        }
    }
}
