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


        //Demonstrate that changes in the collection affect the map
        // (and vice-versa, because it's a view, not a copy)

        System.out.println("\nRemoving element 2 from the values collection:");
        values.remove(2); //This will remove the entry with value 2 ("Banana") from the map


         System.out.println("Map after removal:");
         for (Map.Entry<String, Integer> entry : map.entrySet()) {
             System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
         }

         System.out.println("\nAdding element 5 to the map directly:");
         map.put("Mango",5);


         System.out.println("Values collection after adding to the map:"); //The values collection reflects the map change
         for (Integer value : values) {
            System.out.println(value);
        }




    }
}
