import java.util.ArrayList;
import java.util.List;

public class InsertAtFirst {

    public static void main(String[] args) {

        // Create an ArrayList of Strings
        List<String> fruits = new ArrayList<>();

        // Add some initial elements (for demonstration)
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println("Original ArrayList: " + fruits);

        // Element to insert at the beginning
        String newFruit = "Mango";

        // Insert the new element at the first position (index 0)
        fruits.add(0, newFruit);


        System.out.println("ArrayList after insertion: " + fruits);


        // Example with Integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        System.out.println("\nOriginal Integer ArrayList: " + numbers);

        int newNumber = 1;
        numbers.add(0, newNumber); // Insert at the beginning

        System.out.println("Integer ArrayList after insertion: " + numbers);


        //Illustrating that add(0, element) shifts other elements
         List<String> colors = new ArrayList<>();
         colors.add("Red");
         colors.add("Green");
         colors.add("Blue");
          System.out.println("\nOriginal Colors ArrayList: " + colors);
          colors.add(0, "Yellow");
          System.out.println("Colors ArrayList after insertion: " + colors);
          colors.add(0,"Purple");
           System.out.println("Colors ArrayList after second insertion: " + colors);




    }
}
