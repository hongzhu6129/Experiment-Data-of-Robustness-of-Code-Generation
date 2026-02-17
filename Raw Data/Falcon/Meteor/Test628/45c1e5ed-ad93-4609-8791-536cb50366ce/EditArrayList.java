import java.util.ArrayList;
import java.util.List;

public class EditArrayList {

    public static void main(String[] args) {
        // Create an ArrayList
        List<String> fruits = new ArrayList<>();

        // Add some initial elements
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        // Print the original list
        System.out.println("Original ArrayList: " + fruits);

        // Edit the element at the first position (index 0)
        String newFruit = "Grape";
        fruits.set(0, newFruit); // The set() method replaces the element


        // Print the updated list
        System.out.println("Updated ArrayList: " + fruits);
    }
}
