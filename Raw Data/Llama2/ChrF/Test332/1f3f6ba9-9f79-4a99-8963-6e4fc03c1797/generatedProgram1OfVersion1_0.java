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

        // Specify the new element
        String newElement = "mango";

        // Replace the second element if the list has at least two elements
        if (strings.size() >= 2) {
            strings.set(1, newElement); // Index 1 is the second element
        } else {
            System.out.println("The list does not have a second element to replace.");
        }

        // Print the modified ArrayList
        System.out.println(strings);


        // Example with integers:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        int newNumber = 10;

        if (numbers.size() >= 2) {
            numbers.set(1, newNumber);
        } else {
            System.out.println("The list does not have a second element to replace.");
        }
        System.out.println(numbers);

    }
}
