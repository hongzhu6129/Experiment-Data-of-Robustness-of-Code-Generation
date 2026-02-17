import java.util.TreeMap;
import java.util.SortedMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap (TreeMap is sorted by keys)
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Populate the TreeMap with some data
        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");
        treeMap.put(40, "Forty");
        treeMap.put(50, "Fifty");
        treeMap.put(60, "Sixty");


        // Given key
        int givenKey = 45;

        // Get the portion of the map whose keys are strictly less than givenKey
        SortedMap<Integer, String> subMap = treeMap.headMap(givenKey);


        // Print the submap
        System.out.println("Submap with keys strictly less than " + givenKey + ":");
        System.out.println(subMap);



        // Example with a different key
        givenKey = 25;
        subMap = treeMap.headMap(givenKey);
        System.out.println("\nSubmap with keys strictly less than " + givenKey + ":");
        System.out.println(subMap);


        //Example when the key is not present
        givenKey = 15; // Key not in map
        subMap = treeMap.headMap(givenKey); 
        System.out.println("\nSubmap with keys strictly less than " + givenKey + ":");
        System.out.println(subMap);


        // Example showing empty submap if given key is less than or equal to smallest key
        givenKey = 10;
        subMap = treeMap.headMap(givenKey);
        System.out.println("\nSubmap with keys strictly less than " + givenKey + ":");
        System.out.println(subMap); 

    }
}
