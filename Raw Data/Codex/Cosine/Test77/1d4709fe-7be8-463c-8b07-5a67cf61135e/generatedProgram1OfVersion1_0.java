import java.util.ArrayList;
import java.util.List;

public class RetrieveElementArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<>();

        // Add some elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");


        // Specify the index of the element to retrieve
        int indexToRetrieve = 2; // We want to get "Orange" (index starts from 0)


        try {
            // Retrieve the element at the specified index
            String retrievedElement = fruits.get(indexToRetrieve);

            // Print the retrieved element
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement);

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index.  Index " + indexToRetrieve + " is out of bounds.");
        }



        // Example retrieving with an invalid index (demonstrates error handling):
         indexToRetrieve = 10; // Out of bounds 

        try {
            String retrievedElement = fruits.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement); // This won't execute if an exception is thrown.

        } catch (IndexOutOfBoundsException e) {
             System.err.println("Error: Invalid index.  Index " + indexToRetrieve + " is out of bounds.");
        }
    }
}
