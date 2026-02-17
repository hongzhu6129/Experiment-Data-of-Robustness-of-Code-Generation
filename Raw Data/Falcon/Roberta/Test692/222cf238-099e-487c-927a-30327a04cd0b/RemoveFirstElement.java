import java.util.ArrayList;
import java.util.List;

public class RemoveFirstElement {

    public static void main(String[] args) {
        // Create a sample list
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");

        // Remove and return the first element (if the list is not empty)
        String firstElement = null; 
        if (!myList.isEmpty()) {
            firstElement = myList.remove(0);
        }



        // Print the removed element (or a message if the list was empty)
        if (firstElement != null) {
            System.out.println("Removed element: " + firstElement);
        } else {
            System.out.println("The list was empty.");
        }

        // Print the updated list
        System.out.println("Updated list: " + myList);


        // Example with an Integer list:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Integer firstNumber = null;
        if (!numbers.isEmpty()) {
            firstNumber = numbers.remove(0);
        }

        if (firstNumber != null) {
            System.out.println("Removed number: " + firstNumber);
        } else {
            System.out.println("The number list was empty.");
        }
        System.out.println("Updated number list: " + numbers);




    }
}
