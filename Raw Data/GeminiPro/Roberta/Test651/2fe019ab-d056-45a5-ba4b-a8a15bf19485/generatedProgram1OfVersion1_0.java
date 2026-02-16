import java.util.HashMap;
import java.util.Map;

public class GetValueMap {

    public static void main(String[] args) {
        // Create a Map
        Map<String, String> capitalCities = new HashMap<>();

        // Add some key-value pairs to the Map
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington D.C.");

        // Retrieve the value associated with the key "England"
        String capitalOfEngland = capitalCities.get("England");

        // Print the value
        System.out.println("The capital of England is: " + capitalOfEngland);


        // Example of handling a key that doesn't exist:
        String capitalOfSpain = capitalCities.get("Spain"); // Returns null if key not found

        if (capitalOfSpain != null) {
            System.out.println("The capital of Spain is: " + capitalOfSpain);
        } else {
            System.out.println("Key 'Spain' not found in the map.");
        }

         //Using getOrDefault to provide a default value if key is not present
         String capitalOfFrance = capitalCities.getOrDefault("France", "Unknown");
         System.out.println("The capital of France is: " + capitalOfFrance); // Prints "Unknown"


    }
}
