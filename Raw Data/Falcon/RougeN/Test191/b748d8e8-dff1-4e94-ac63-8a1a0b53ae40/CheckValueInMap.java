import java.util.HashMap;
import java.util.Map;

public class CheckValueInMap {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, String> myMap = new HashMap<>();
        myMap.put("apple", "red");
        myMap.put("banana", "yellow");
        myMap.put("grape", "purple");

        // Value to search for
        String valueToFind = "yellow";

        // Check if the map contains the value
        boolean containsValue = myMap.containsValue(valueToFind);

        // Print the result
        if (containsValue) {
            System.out.println("The map contains the value: " + valueToFind);
        } else {
            System.out.println("The map does not contain the value: " + valueToFind);
        }


        //Another example demonstrating that containsValue() checks *values*, not keys
        String keyToFind = "yellow"; //Same string, but now used as a *key* search

        if(myMap.containsKey(keyToFind)){ //containsKey() checks *keys*
            System.out.println("The map contains the key: " + keyToFind);
        } else {
             System.out.println("The map does not contain the key: " + keyToFind); //This will be printed in this case.
        }



        // Example with null value
        myMap.put("kiwi", null);  //Adding a key with a null value
        boolean containsNull = myMap.containsValue(null);

        if (containsNull) {
            System.out.println("The map contains a null value.");
        } else {
            System.out.println("The map does not contain a null value.");  // Won't be printed if a null value is present.
        }

    }
}
