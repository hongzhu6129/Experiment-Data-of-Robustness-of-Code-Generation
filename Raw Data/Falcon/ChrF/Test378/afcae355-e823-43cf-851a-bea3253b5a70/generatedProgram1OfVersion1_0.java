import java.util.HashMap;

public class AddToHashMap {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> myMap = new HashMap<>();

        // Associate a value with a key
        String key = "apple";
        int value = 1;

        myMap.put(key, value);


        // You can add more key-value pairs if needed
        myMap.put("banana", 2);
        myMap.put("orange", 3);

        // Print the HashMap to verify (optional)
        System.out.println(myMap); 
    }
}
