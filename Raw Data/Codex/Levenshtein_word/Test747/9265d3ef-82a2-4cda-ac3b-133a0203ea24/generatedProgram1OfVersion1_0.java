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

        // Given key
        int givenKey = 4;

        // Get the portion of the map whose keys are strictly less than givenKey
        SortedMap<Integer, String> subMap = treeMap.headMap(givenKey);  // Exclusive of givenKey

        // Print the submap
        System.out.println("Submap with keys strictly less than " + givenKey + ": " + subMap);


        // Example with String keys (demonstrating natural ordering)
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("Apple", 1);
        stringTreeMap.put("Banana", 2);
        stringTreeMap.put("Orange", 3);
        stringTreeMap.put("Pineapple", 4);

        String givenStringKey = "Orange"; //Exclusive

        SortedMap<String, Integer> stringSubMap = stringTreeMap.headMap(givenStringKey);
        System.out.println("String Submap with keys strictly less than '" + givenStringKey + "': " + stringSubMap);


        // Example demonstrating empty submap if givenKey is the smallest
        int smallestKey = 1;
        SortedMap<Integer, String> emptySubMap = treeMap.headMap(smallestKey);
        System.out.println("Submap with keys strictly less than " + smallestKey + ": " + emptySubMap);


    }
}
