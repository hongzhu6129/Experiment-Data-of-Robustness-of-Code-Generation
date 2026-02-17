import java.util.ArrayList;
import java.util.List;

public class EditArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<>();

        // Add some initial elements
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        // Print the original list
        System.out.println("Original ArrayList: " + fruits);


        // Edit the element at the first position (index 0)
        String newFruit = "Mango";
        if (!fruits.isEmpty()) { // Check if the list is empty to avoid IndexOutOfBoundsException
            fruits.set(0, newFruit);
        } else {
            System.out.println("ArrayList is empty. Cannot edit.");
            return; // Exit the program early if the list is empty
        }

        // Print the updated list
        System.out.println("Updated ArrayList: " + fruits);


        // Example with Integer ArrayList:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        System.out.println("Original Numbers: " + numbers);

        if (!numbers.isEmpty()) {
            numbers.set(0, 10);
        } else {
             System.out.println("Numbers ArrayList is empty. Cannot edit.");
             return; // Exit if the list is empty
        }

        System.out.println("Updated Numbers: " + numbers);

    }
}
