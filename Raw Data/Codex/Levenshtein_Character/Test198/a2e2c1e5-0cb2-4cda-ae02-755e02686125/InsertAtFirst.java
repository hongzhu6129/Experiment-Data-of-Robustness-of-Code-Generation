import java.util.ArrayList;
import java.util.List;

public class InsertAtFirst {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> colors = new ArrayList<>();

        // Add some initial elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Element to insert at the beginning
        String newColor = "Yellow";

        // Insert the new element at the first position (index 0)
        colors.add(0, newColor); // The add() method with an index inserts at that position

        // Print the updated ArrayList
        System.out.println(colors); // Output: [Yellow, Red, Green, Blue]


        // Example with integers:
         List<Integer> numbers = new ArrayList<>();
         numbers.add(2);
         numbers.add(4);
         numbers.add(6);

         int newNumber = 1;
         numbers.add(0, newNumber);

         System.out.println(numbers); // Output: [1, 2, 4, 6]


    }
}
