import java.util.TreeMap;
import java.util.SortedMap;

public class SubMapExample {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        // Get the portion of the map whose keys are less than or equal to 3 (inclusive)
        int givenKey = 3;
        boolean inclusive = true;
        SortedMap<Integer, String> subMapInclusive = map.headMap(givenKey, inclusive); 

        System.out.println("Submap (inclusive): " + subMapInclusive);


        // Get the portion of the map whose keys are strictly less than 3 (exclusive)
        inclusive = false;
        SortedMap<Integer, String> subMapExclusive = map.headMap(givenKey, inclusive);

        System.out.println("Submap (exclusive): " + subMapExclusive);


         //Demonstrate with String keys
        TreeMap<String, Integer> stringMap = new TreeMap<>();
        stringMap.put("apple", 1);
        stringMap.put("banana", 2);
        stringMap.put("cherry", 3);
        stringMap.put("date", 4);


        String givenStringKey = "cherry";
        SortedMap<String, Integer> stringSubMapInclusive = stringMap.headMap(givenStringKey, true);
        System.out.println("String Submap (inclusive): " + stringSubMapInclusive);

        SortedMap<String, Integer> stringSubMapExclusive = stringMap.headMap(givenStringKey, false);
        System.out.println("String Submap (exclusive): " + stringSubMapExclusive);




    }
}
