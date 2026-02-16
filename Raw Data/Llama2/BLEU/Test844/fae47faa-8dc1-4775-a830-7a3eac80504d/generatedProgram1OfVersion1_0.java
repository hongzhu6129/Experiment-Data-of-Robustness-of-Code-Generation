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

        System.out.println("Original ArrayList: " + fruits);

        // Element to replace the second element with
        String newFruit = "Mango";


        // Check if the ArrayList has at least two elements
        if (fruits.size() >= 2) {
            // Replace the second element (index 1)
            fruits.set(1, newFruit);

            System.out.println("ArrayList after replacing the second element: " + fruits);


        } else {
            System.out.println("The ArrayList does not have a second element to replace.");
        }


        // Example with Integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nOriginal Integer ArrayList: " + numbers);

        // Replace the second element with 25
        int newNumber = 25;

        if(numbers.size() >= 2) {
            numbers.set(1, newNumber);
            System.out.println("Integer ArrayList after replacing the second element: " + numbers);
        } else {
             System.out.println("The Integer ArrayList does not have a second element to replace.");
        }



        //Demonstrate handling an empty list
         List<String> emptyList = new ArrayList<>();

         System.out.println("\nEmpty List: " + emptyList);
         if (emptyList.size() >= 2) {
             emptyList.set(1, "Something"); // This won't execute
         } else {
            System.out.println("Cannot replace the second element in an empty list.");
        }

    }
}
