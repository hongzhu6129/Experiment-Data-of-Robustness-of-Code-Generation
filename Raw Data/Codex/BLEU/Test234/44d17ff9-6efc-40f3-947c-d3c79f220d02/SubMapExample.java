import java.util.TreeMap;
import java.util.SortedMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Put elements to the map
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");
        treeMap.put(6, "Six");


        // Given Key
        int givenKey = 4;

        // Get the portion of the map whose keys are strictly less than givenKey
        SortedMap<Integer, String> subMap = treeMap.headMap(givenKey);


        // Print the submap
        System.out.println("Submap with keys strictly less than " + givenKey + ": " + subMap);


        //Another Example with a non-existent Key
        givenKey = 7; // Key not present

        subMap = treeMap.headMap(givenKey); //All elements less than 7, which is the whole map in this case.

        System.out.println("Submap with keys strictly less than " + givenKey + ": " + subMap);


        // Example with the smallest key
         givenKey = 1;

         subMap = treeMap.headMap(givenKey);  // Empty map, as there are no keys strictly less than 1.

        System.out.println("Submap with keys strictly less than " + givenKey + ": " + subMap);

    }
}
