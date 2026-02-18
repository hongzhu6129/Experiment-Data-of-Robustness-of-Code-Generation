import java.util.TreeMap;
import java.util.SortedMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap (sorted map)
        TreeMap<Integer, String> bookMap = new TreeMap<>();

        // Add some books to the map
        bookMap.put(101, "Java Programming");
        bookMap.put(102, "Data Structures and Algorithms");
        bookMap.put(103, "Database Management Systems");
        bookMap.put(104, "Web Development");
        bookMap.put(105, "Software Engineering");

        // Given key (exclusive upper bound)
        int givenKey = 104;

        // Get the portion of the map whose keys are strictly less than givenKey
        SortedMap<Integer, String> subMap = bookMap.headMap(givenKey);

        // Print the submap
        System.out.println("Books with keys less than " + givenKey + ":");
        for (Integer key : subMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + subMap.get(key));
        }


        // Example with no matching keys (empty submap)
        givenKey = 100;  // Key smaller than any in the map
        subMap = bookMap.headMap(givenKey);
        System.out.println("\nBooks with keys less than " + givenKey + ":");

        if (subMap.isEmpty()) {
            System.out.println("(Empty submap)");
        } else {
            for (Integer key : subMap.keySet()) {
                System.out.println("Key: " + key + ", Value: " + subMap.get(key));
            }
        }



        // Example with key greater than or equal to the largest key (full map returned as submap)
        givenKey = 106;
        subMap = bookMap.headMap(givenKey);  
        System.out.println("\nBooks with keys less than " + givenKey + ":");
        for (Integer key : subMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + subMap.get(key));
        }


    }
}
