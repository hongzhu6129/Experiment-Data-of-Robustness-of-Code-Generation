import java.util.ArrayList;
import java.util.List;

public class InsertAtFirst {

    public static void main(String[] args) {

        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        // Element to insert at the first position
        String newFruit = "Mango";

        // Insert the new element at the beginning
        fruits.add(0, newFruit);

        // Print the updated ArrayList
        System.out.println(fruits);
    }
}
