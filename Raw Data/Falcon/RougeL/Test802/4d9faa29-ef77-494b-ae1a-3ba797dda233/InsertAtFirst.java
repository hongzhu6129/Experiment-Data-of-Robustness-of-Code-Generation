import java.util.ArrayList;
import java.util.List;

public class InsertAtFirst {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> fruits = new ArrayList<>();

        // Add some initial elements (optional)
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        // Print the original list
        System.out.println("Original ArrayList: " + fruits);

        // Element to insert at the beginning
        String newFruit = "Mango";

        // Insert at the first position (index 0)
        fruits.add(0, newFruit);


        // Print the updated list
        System.out.println("ArrayList after inserting at first position: " + fruits);


         // Example with integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        System.out.println("Original number list: " + numbers);

        int newNumber = 1; 
        numbers.add(0, newNumber); // Insert at the beginning
        System.out.println("Number list after insertion: " + numbers);


    }
}
