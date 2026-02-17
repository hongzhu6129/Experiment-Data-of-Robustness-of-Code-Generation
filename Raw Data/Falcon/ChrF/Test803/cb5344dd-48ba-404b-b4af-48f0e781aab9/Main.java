import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a sample HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Get a Collection view of the values
        Collection<Integer> values = map.values();

        // Print the values
        System.out.println("Values in the map:");
        for (Integer value : values) {
            System.out.println(value);
        }


         //Demonstrate that changes in the collection are reflected in the map (and vice versa)
        System.out.println("\nDemonstrating linked behavior:");
        System.out.println("Original Map: " + map);

        //Remove a value from the Collection view
        values.remove(2); 

        System.out.println("Map after removing 2 from the values collection: " + map); //Banana is gone

        //Add a value to the map
        map.put("Grape", 4);
        System.out.println("Map after adding Grape:4 : " + map);


        //Iterate through the Collection view again. Note that it reflects the changes made via map.
        System.out.println("Values collection after map modification:");
        for (Integer value : values) {
            System.out.println(value);
        }



    }
}
