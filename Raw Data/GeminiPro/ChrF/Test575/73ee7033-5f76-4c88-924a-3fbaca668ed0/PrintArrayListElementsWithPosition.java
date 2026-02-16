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

        // Print elements with their positions using a for loop and get()
        System.out.println("Elements with their positions (using get()):");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Element at position " + i + ": " + fruits.get(i));
        }


        // Alternatively, using a for-each loop with a separate index counter
         System.out.println("\nElements with their positions (using for-each and counter):");
        int index = 0;
        for (String fruit : fruits) {
            System.out.println("Element at position " + index + ": " + fruit);
            index++;
        }


    }
}
