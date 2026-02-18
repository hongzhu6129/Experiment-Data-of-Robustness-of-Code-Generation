import java.util.ArrayList;
import java.util.List;

public class ReplaceSecondElement {

    public static void main(String[] args) {
        // Create an ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        // Replace the second element (index 1) with "Mango"
        String newElement = "Mango";
        int indexToReplace = 1; 

        if (indexToReplace >= 0 && indexToReplace < fruits.size()) {
            fruits.set(indexToReplace, newElement);
            System.out.println("ArrayList after replacing the second element: " + fruits);
        } else {
            System.out.println("Invalid index.  Index must be between 0 and " + (fruits.size() - 1));
        }


        // Example with an Integer ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Replace the second element (index 1) with 25
        int newNumber = 25;
        indexToReplace = 1;

        if (indexToReplace >= 0 && indexToReplace < numbers.size()) {
            numbers.set(indexToReplace, newNumber);
            System.out.println("ArrayList after replacing the second element: " + numbers);
        } else {
             System.out.println("Invalid index.  Index must be between 0 and " + (numbers.size() - 1));       
        }
    }
}
