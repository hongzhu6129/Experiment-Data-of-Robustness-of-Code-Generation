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

        if (fruits.size() >= 2) { // Check if there's at least a second element
            fruits.set(1, newElement);

            // Print the updated ArrayList
            System.out.println("Updated ArrayList: " + fruits);

        } else {
            System.out.println("The ArrayList does not have a second element to replace.");
        }


        // Example with an Integer ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Original numbers list: " + numbers);
        
        if (numbers.size()>=2) {
            numbers.set(1, 25); //replace the second element with 25
             System.out.println("Updated numbers list: " + numbers);
        } else {
             System.out.println("The numbers list does not have a second element to replace.");
        }


    }
}
