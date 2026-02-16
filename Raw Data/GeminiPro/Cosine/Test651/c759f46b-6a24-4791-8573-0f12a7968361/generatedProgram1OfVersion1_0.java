import java.util.HashMap;
import java.util.Map;

public class GetValueMap {

    public static void main(String[] args) {
        // Create a map
        Map<String, String> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("name", "John Doe");
        map.put("age", "30");
        map.put("city", "New York");

        // Specify the key to retrieve
        String key = "age";

        // Get the value associated with the key
        String value = map.get(key);


        // Print the value (handling null if the key isn't found)
        if (value != null) {
            System.out.println("The value for key '" + key + "' is: " + value);
        } else {
            System.out.println("Key '" + key + "' not found in the map.");
        }



        // Example of getting a value that might not exist.
        String cityValue = map.get("country");  //  "country" key isn't in the map.

        if (cityValue != null) {
            System.out.println("Country: " + cityValue);
        } else {
            System.out.println("Key 'country' not found.");
        }


        // Using getOrDefault to provide a default value if the key is not present.
        String defaultCountry = "Unknown";
        String countryValue = map.getOrDefault("country", defaultCountry);
        System.out.println("Country (using getOrDefault): " + countryValue); // Output: Unknown


    }
}
