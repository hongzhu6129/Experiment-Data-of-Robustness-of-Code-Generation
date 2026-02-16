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
        System.out.println("Elements of ArrayList with their positions:");
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println("Element at position " + i + ": " + myArrayList.get(i));
        }


        //Alternatively, using enhanced for loop with an index counter
        System.out.println("\nUsing enhanced for loop with index:");
        int index = 0;
        for (String element : myArrayList) {
            System.out.println("Element at position " + index + ": " + element);
            index++;
        }


    }
}
