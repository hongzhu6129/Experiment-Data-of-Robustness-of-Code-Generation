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

        // Get the collection view of the values
        Collection<Integer> values = map.values();

        // Print the values
        System.out.println("Values in the map:");
        for (Integer value : values) {
            System.out.println(value);
        }


        //Demonstrate that changes to the values collection reflect in the map
        // (and vice-versa, although not shown here explicitly)
        values.remove(2); //Remove the value 2

        System.out.println("\nMap after removing value 2 from the values collection:");
        System.out.println(map);



    }
}
