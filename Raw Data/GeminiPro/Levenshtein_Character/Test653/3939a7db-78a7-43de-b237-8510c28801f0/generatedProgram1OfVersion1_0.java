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


        //Demonstrate that changes to the collection affect the map (and vice-versa)

        //Remove a value from the Collection view
        values.remove(2); 

        System.out.println("\nMap after removing '2' from the values collection:");
        System.out.println(map); // Notice that entries with value 2 are removed.



         //Add a value to the Map
        map.put("Kiwi", 4);
        System.out.println("\nValues collection after adding 'Kiwi':4 to the map:");

        for(Integer value : values){  //The values collection reflects the map change.
            System.out.println(value);
        }


    }
}
