import java.util.TreeMap;
import java.util.SortedMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap (TreeMap keeps keys sorted)
        TreeMap<Integer, String> map = new TreeMap<>();

        // Populate the map
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");


        int givenKey = 6; // Example given key

        // Get the portion of the map whose keys are strictly less than givenKey
        SortedMap<Integer, String> subMap = map.headMap(givenKey); 

        // Print the submap
        System.out.println("Original Map: " + map);
        System.out.println("Submap with keys less than " + givenKey + ": " + subMap);



        //Another example with a different given key
        givenKey = 3;
        subMap = map.headMap(givenKey);
        System.out.println("\nSubmap with keys less than " + givenKey + ": " + subMap);



        // Example with String keys (natural ordering)
        TreeMap<String, Integer> stringMap = new TreeMap<>();
        stringMap.put("Apple", 1);
        stringMap.put("Banana", 2);
        stringMap.put("Cherry", 3);
        stringMap.put("Date", 4);

        String givenStringKey = "Cherry";
        SortedMap<String, Integer> stringSubMap = stringMap.headMap(givenStringKey);

        System.out.println("\nString Map: " + stringMap);
        System.out.println("String Submap with keys less than \"" + givenStringKey + "\": " + stringSubMap);

    }
}
