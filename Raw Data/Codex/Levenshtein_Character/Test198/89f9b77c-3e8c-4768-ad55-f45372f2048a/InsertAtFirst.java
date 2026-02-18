import java.util.ArrayList;
import java.util.List;

public class InsertAtFirst {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> myList = new ArrayList<>();

        // Add some initial elements (optional)
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // Print the original list
        System.out.println("Original List: " + myList);


        // Element to insert at the beginning
        String newElement = "Grape";


        // Insert at the first position (index 0)
        myList.add(0, newElement);


        // Print the updated list
        System.out.println("List after insertion: " + myList);

    }
}
