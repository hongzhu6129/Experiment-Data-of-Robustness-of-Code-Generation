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
        map.put("Grape", 4);

        // Get a Collection view of the values
        Collection<Integer> values = map.values();

        // Print the values
        System.out.println("Values in the map:");
        for (Integer value : values) {
            System.out.println(value);
        }


        //Demonstrate that changes to the collection affect the map
        System.out.println("\nDemonstrating changes to the collection view affect the map:");

        values.remove(2); // Remove the value 2

        System.out.println("Map after removing 2 from the values collection:");
        System.out.println(map); // Banana is now removed as its value was 2.


        //Demonstrate that changes to the map affect the collection view
        map.put("Mango", 5);


        System.out.println("\nMap after adding \"Mango\":5");
        System.out.println(map);


        System.out.println("Values collection after adding to map:");
        for(Integer value : values){
            System.out.println(value); // 5 (from Mango) will be included.
        }

    }
}
