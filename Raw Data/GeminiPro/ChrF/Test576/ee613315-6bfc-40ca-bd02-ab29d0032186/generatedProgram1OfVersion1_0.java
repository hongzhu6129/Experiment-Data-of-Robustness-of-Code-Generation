import java.util.ArrayList;
import java.util.List;

public class AppendToList {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // Element to append
        String newElement = "Grape";

        // Append the element to the end of the list
        myList.add(newElement);

        // Print the updated list
        System.out.println("Updated list: " + myList);


        // Example with Integer List
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int newNumber = 4;

        numbers.add(newNumber);

        System.out.println("Updated numbers list: " + numbers);

          // Example demonstrating appending to an initially empty list
        List<Double> doubles = new ArrayList<>(); // Start with an empty list

        double newDouble = 3.14;
        doubles.add(newDouble);

        System.out.println("Updated doubles list (initially empty): " + doubles);
    }
}
