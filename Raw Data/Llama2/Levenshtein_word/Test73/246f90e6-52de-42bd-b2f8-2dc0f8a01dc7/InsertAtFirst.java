import java.util.LinkedList;
import java.util.List;

public class InsertAtFirst {

    public static void main(String[] args) {
        // Create a LinkedList (sophisticated list)
        List<String> myList = new LinkedList<>();

        // Add some initial elements (optional)
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // Element to insert at the first position
        String newElement = "Grape";

        // Insert the new element at the beginning of the list
        myList.add(0, newElement); // The add(index, element) method inserts at a specific index


        // Print the updated list
        System.out.println("List after insertion: " + myList); 
    }
}
