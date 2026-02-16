import java.util.ArrayList;
import java.util.List;

public class PrintArrayListElementsWithPosition {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");


        // Method 1: Using a traditional for loop (index-based)
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Element at position " + i + ": " + fruits.get(i));
        }

        System.out.println("\n"); // Add a newline for better readability

        // Method 2: Using an enhanced for loop (for-each loop) with a counter
        System.out.println("Using enhanced for loop with counter:");
        int counter = 0;
        for (String fruit : fruits) {
            System.out.println("Element at position " + counter + ": " + fruit);
            counter++;
        }


        System.out.println("\n"); // Add a newline for better readability


        // Method 3: Using Java 8 streams and forEach with lambda expression (more advanced)
        System.out.println("Using Java 8 streams and forEach:");
        // Create an IntStream to represent the indices
         IntStream.range(0, fruits.size())
                .forEach(i -> System.out.println("Element at position " + i + ": " + fruits.get(i)));


    }
}
