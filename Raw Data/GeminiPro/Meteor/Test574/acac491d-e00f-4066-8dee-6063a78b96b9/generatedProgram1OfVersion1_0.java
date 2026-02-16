import java.util.ArrayList;
import java.util.List;

public class ReplaceSecondElement {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + fruits);

        // Replace the second element (index 1) with "Mango"
        String newElement = "Mango";

        if (fruits.size() >= 2) { // Check if the list has at least 2 elements
            fruits.set(1, newElement); // Replace element at index 1

            // Print the modified ArrayList
            System.out.println("Modified ArrayList: " + fruits);
        } else {
            System.out.println("ArrayList does not have a second element to replace.");
        }



        // Example with integers:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Original numbers: " + numbers);

        if(numbers.size() >= 2) {
            numbers.set(1, 25);  // Replace the second element (20) with 25
            System.out.println("Modified numbers: " + numbers);

        } else {
            System.out.println("Numbers list does not have a second element to replace.");
        }
    }
}
