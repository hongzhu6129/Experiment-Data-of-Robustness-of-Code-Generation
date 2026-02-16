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


        //Demonstrate that changes to the collection reflect in the map (and vice-versa)
         map.put("Grape", 4); // Add to map
         System.out.println("Values after adding to map:");
          for (Integer value : values) {
             System.out.println(value);
          }

        values.remove(2); //Remove from collection
        System.out.println("Values after removing from collection:");
        for (Integer value : values) {
             System.out.println(value);
         }

        System.out.println("Map after removing from collection (Banana is gone):");
        System.out.println(map);



    }
}
