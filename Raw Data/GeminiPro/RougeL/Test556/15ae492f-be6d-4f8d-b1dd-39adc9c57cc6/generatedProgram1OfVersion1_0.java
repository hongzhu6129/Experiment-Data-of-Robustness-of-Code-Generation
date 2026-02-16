import java.util.ArrayList;
import java.util.List;

public class InsertAtFirst {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> fruits = new ArrayList<>();

        // Add some initial elements
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        // Element to insert at the beginning
        String newFruit = "Mango";

        // Insert the new element at the first position (index 0)
        fruits.add(0, newFruit);

        // Print the updated ArrayList
        System.out.println(fruits); 
    }
}
