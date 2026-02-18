import java.util.ArrayList;
import java.util.List;

public class PrintArrayListElementsWithPosition {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<>();

        // Add some elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grape");

        // Print the elements with their positions using a for loop and get()
        System.out.println("Elements with their positions (using get()):");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Element at position " + i + ": " + fruits.get(i));
        }

        // Alternatively, print the elements with their positions using a for-each loop and a counter
        System.out.println("\nElements with their positions (using counter):");
        int counter = 0; 
        for (String fruit : fruits) {
            System.out.println("Element at position " + counter + ": " + fruit);
            counter++;
        }


          // Yet another way, using Java 8 streams and forEach with an IntStream:
        System.out.println("\nElements with their positions (using IntStream):");

         java.util.stream.IntStream.range(0, fruits.size())
                 .forEach(i -> System.out.println("Element at position " + i + ": " + fruits.get(i)));



    }
}
