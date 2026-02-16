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


        // Print elements with their positions using a traditional for loop
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Element at position " + i + ": " + fruits.get(i));
        }

        // Print elements with their positions using a for-each loop and a counter
        System.out.println("\nUsing for-each loop with counter:");
        int position = 0;
        for (String fruit : fruits) {
            System.out.println("Element at position " + position + ": " + fruit);
            position++;
        }


        //Using Java 8 streams with forEach and IntStream.range (more advanced)
        System.out.println("\nUsing Java 8 streams:");
        java.util.stream.IntStream.range(0, fruits.size())
                .forEach(i -> System.out.println("Element at position " + i + ": " + fruits.get(i)));


    }
}
