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

        // Replace the second element (index 1) with "Mango"
        String newElement = "Mango";

        if (fruits.size() >= 2) { // Check if there's at least a second element
            fruits.set(1, newElement); 
        } else {
            System.out.println("The ArrayList does not have a second element to replace.");
        }

        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + fruits);


        //Example with an Integer ArrayList:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int newNumber = 25;

        if (numbers.size() >= 2) {
            numbers.set(1, newNumber);
        } else {
            System.out.println("The ArrayList does not have a second element to replace.");
        }
        System.out.println("Updated Integer ArrayList: " + numbers);
    }
}
