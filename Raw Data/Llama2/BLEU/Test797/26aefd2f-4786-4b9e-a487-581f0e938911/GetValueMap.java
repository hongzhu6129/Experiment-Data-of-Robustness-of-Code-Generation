import java.util.HashMap;
import java.util.Map;

public class GetValueMap {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("name", "John Doe");
        map.put("age", "30");
        map.put("city", "New York");

        // Get the value associated with the key "name"
        String name = map.get("name");

        // Print the value
        System.out.println("Name: " + name); // Output: Name: John Doe

        // Get the value associated with a key that doesn't exist
        String country = map.get("country"); 

        // Print the value (will be null)
        System.out.println("Country: " + country); // Output: Country: null


        // Example demonstrating handling null (using getOrDefault for a default value)
        String occupation = map.getOrDefault("occupation", "Unknown");
        System.out.println("Occupation: " + occupation); // Output: Occupation: Unknown

         //ContainsKey check
        String keyToFind = "age";
        if(map.containsKey(keyToFind)) {
            System.out.println("Value for " + keyToFind + ": " + map.get(keyToFind)); // Output: Value for age: 30
        } else {
            System.out.println(keyToFind + " not found in the map.");
        }



    }
}
