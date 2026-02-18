import java.util.ArrayList;
import java.util.List;

public class ReplaceSecondElement {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");
        strings.add("grape");

        // Specify the element to replace the second element with
        String newElement = "mango";

        // Check if the ArrayList has at least two elements
        if (strings.size() >= 2) {
            // Replace the second element (index 1)
            strings.set(1, newElement); 

            // Print the modified ArrayList
            System.out.println("Modified ArrayList: " + strings);

        } else {
            System.out.println("ArrayList does not have enough elements to replace the second one.");
        }


        // Example with integers
         List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int newNumber = 25;

        if (numbers.size() >= 2) {
            numbers.set(1, newNumber);
            System.out.println("Modified ArrayList of numbers: " + numbers);
        } else {
            System.out.println("ArrayList of numbers does not have enough elements to replace the second one.");
        }


    }
}
