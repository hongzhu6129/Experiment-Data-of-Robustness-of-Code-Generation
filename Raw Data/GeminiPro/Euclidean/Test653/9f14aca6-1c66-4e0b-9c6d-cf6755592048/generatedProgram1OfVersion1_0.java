import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapValuesView {

    public static void main(String[] args) {
        // Create a sample HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        map.put("Grape", 1); // Duplicate value with "Apple"
        map.put("Mango", 2); // Duplicate value with "Banana"


        // Get a Collection view of the values
        Collection<Integer> values = map.values();

        // Print the values
        System.out.println("Values in the map:");
        for (Integer value : values) {
            System.out.println(value);
        }


        // Demonstrate that changes to the map are reflected in the view
        map.put("Pineapple", 4);  //Add a new key-value pair.
        System.out.println("\nValues after adding 'Pineapple':");
        for (Integer value : values) {  // The values view now includes 4.
            System.out.println(value);
        }

        map.remove("Banana"); //Remove a key-value pair.
        System.out.println("\nValues after removing 'Banana':");
         for (Integer value : values) { // The values view no longer includes 2 (from "Banana").
            System.out.println(value);
        }


    }
}
