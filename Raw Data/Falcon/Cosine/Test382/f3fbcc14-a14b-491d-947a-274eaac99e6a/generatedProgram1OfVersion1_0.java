import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, Integer> myMap = new HashMap<>();

        // Associate the specified value with the specified key
        String key = "apple"; // Example key
        int value = 10;     // Example value
        myMap.put(key, value);

        // You can add more key-value pairs as needed
        myMap.put("banana", 20);
        myMap.put("orange", 30);

        // Print the HashMap to verify the association
        System.out.println(myMap); 

        //Retrieve the value associated with "apple"
        System.out.println("Value associated with 'apple': " + myMap.get("apple"));


        //Example demonstrating overwriting an existing key's value
        myMap.put("apple", 15); //Overwrites the previous value of 10
        System.out.println("Value associated with 'apple' after update: " + myMap.get("apple"));


        // Example demonstrating adding a key-value pair with a different data type
        myMap.put("grape", "purple"); // Value is a String
        System.out.println(myMap);

    }
}
