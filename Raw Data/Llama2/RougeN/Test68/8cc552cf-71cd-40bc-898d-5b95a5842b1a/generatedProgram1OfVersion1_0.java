import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class MapValuesView {

    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Get a collection view of the values contained in this map
        Collection<String> values = capitalCities.values();

        // Print the values
        System.out.println("Values in the map:");
        for (String value : values) {
            System.out.println(value); 
        }


        //Demonstrate that changes to the collection reflect in the map and vice versa
        System.out.println("\nDemonstrating changes to collection reflect in map:");
        values.remove("Berlin"); // Removing from collection

        System.out.println("Map after removing 'Berlin' from collection:");
        for (Map.Entry<String, String> entry : capitalCities.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        System.out.println("\nDemonstrating changes to map reflect in collection:");
        capitalCities.put("France", "Paris"); // Adding to map
        
        System.out.println("Collection after adding 'France:Paris' to the map:");

         for (String value : values) {
            System.out.println(value); 
        }


    }
}
