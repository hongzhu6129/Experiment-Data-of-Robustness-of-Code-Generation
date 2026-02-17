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


        // Print elements with their positions using a for loop and get() method
        System.out.println("Printing using traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Element at position " + i + ": " + fruits.get(i));
        }


        //Alternative method: using a for-each loop with a counter. Less efficient but demonstrably correct.
        System.out.println("\nPrinting using for-each loop with counter:");
        int counter = 0;
        for (String fruit: fruits){
            System.out.println("Element at position " + counter + ": " + fruit);
            counter++;
        }
    }
}
