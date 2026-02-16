import java.util.HashMap;
import java.util.Map;

public class FillMapValue {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);

        // Specify the key and the value to fill
        String keyToFill = "grape";
        int fillValue = 10;


        // Fill the value (if key exists, update; otherwise, insert)
        myMap.put(keyToFill, fillValue); // put() handles both insertion and update



        // Print the updated map
        System.out.println("Updated map: " + myMap);



        // Example demonstrating update of an existing key:
        keyToFill = "banana";
        fillValue = 20;
        myMap.put(keyToFill, fillValue);  //banana's value is now updated
        System.out.println("Map after updating banana: " + myMap);


         //A more verbose approach if you need different logic for insert vs. update.  
         //This demonstrates how to handle cases differently using containsKey().
        keyToFill = "mango";
        fillValue = 30;

        if (myMap.containsKey(keyToFill)) {
            // Key exists, update the value (e.g. add to existing)
            myMap.put(keyToFill, myMap.get(keyToFill) + fillValue); 
            System.out.println("Updated existing key: " + myMap);
        } else {
            // Key does not exist, insert the key-value pair
             myMap.put(keyToFill, fillValue);
            System.out.println("Inserted new key: " + myMap);
        }

    }
}
