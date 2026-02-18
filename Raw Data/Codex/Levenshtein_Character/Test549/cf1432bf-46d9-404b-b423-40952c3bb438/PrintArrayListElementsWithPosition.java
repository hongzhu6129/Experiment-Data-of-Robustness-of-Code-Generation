import java.util.ArrayList;
import java.util.List;

public class PrintArrayListElementsWithPosition {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> myArrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        myArrayList.add("Apple");
        myArrayList.add("Banana");
        myArrayList.add("Orange");
        myArrayList.add("Grape");
        myArrayList.add("Mango");


        // Print the elements with their positions using a for loop and get()
        System.out.println("Printing elements using a for loop and get():");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println("Element at position " + i + ": " + myArrayList.get(i));
        }


        // Alternatively, you can use enhanced for loop with a separate index variable
        System.out.println("\nPrinting elements using an enhanced for loop and an index:");
        int index = 0;
        for (String element : myArrayList) {
            System.out.println("Element at position " + index + ": " + element);
            index++;
        }


          // Or use a forEach loop with a lambda expression that has the index: (Java 8 and later)
        System.out.println("\nPrinting using forEach with lambda and index:");
        myArrayList.forEach((element) ->
                System.out.println("Element at position " + myArrayList.indexOf(element) + ": " + element)
        );


    }
}
