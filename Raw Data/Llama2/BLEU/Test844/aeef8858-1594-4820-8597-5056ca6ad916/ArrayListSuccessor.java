import java.util.ArrayList;
import java.util.List;

public class ArrayListSuccessor {

    public static void main(String[] args) {
        // Create an ArrayList
        List<String> myList = new ArrayList<>();

        // Add some elements
        myList.add("Apple");
        myList.add("Banana"); // Element at index 1
        myList.add("Cherry");
        myList.add("Date");


        // Specify the element to replace the second element (index 1) 
        String newElement = "Grapefruit";

        try {
             // Replace the second element (index 1) with the new element.
            myList.set(1, newElement); 

            // Print the updated ArrayList
            System.out.println("Updated ArrayList: " + myList);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Index out of bounds. The ArrayList may not have enough elements.");
        }


        // Example with an ArrayList of Integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20); //  Element at index 1
        numbers.add(30);

        int newNumber = 25;


        try {
            numbers.set(1, newNumber);
            System.out.println("Updated Integer ArrayList: " + numbers);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Index out of bounds. The ArrayList may not have enough elements.");
        }

    }
}
