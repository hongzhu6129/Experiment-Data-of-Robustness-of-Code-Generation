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

        // Specify the element to replace the second element
        String newElement = "Mango";

        // Replace the second element (index 1) if the list has at least 2 elements
        if (fruits.size() >= 2) {
            fruits.set(1, newElement); 
        } else {
            System.out.println("ArrayList does not have a second element to replace.");
        }


        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + fruits);


        // Example with an Integer ArrayList:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Original Integer ArrayList: " + numbers);

        int newNumber = 25;

        if (numbers.size() >= 2) {
            numbers.set(1, newNumber);
        } else {
            System.out.println("Integer ArrayList does not have a second element to replace.");
        }

        System.out.println("Updated Integer ArrayList: " + numbers);

        // Example with empty ArrayList
        List<String> emptyList = new ArrayList<>();
        System.out.println("Original Empty ArrayList: " + emptyList);

        String elementToAdd = "Test";
        if(emptyList.size() >= 2) {
            emptyList.set(1, elementToAdd);
        } else {
            System.out.println("Empty ArrayList does not have a second element to replace.");
        }
        System.out.println("Updated Empty ArrayList: " + emptyList);




    }
}
