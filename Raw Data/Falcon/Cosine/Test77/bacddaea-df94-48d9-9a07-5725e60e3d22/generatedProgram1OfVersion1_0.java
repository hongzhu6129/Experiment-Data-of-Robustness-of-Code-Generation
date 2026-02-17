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
        int indexToRetrieve = 2;  // We want to retrieve the element at index 2 (Orange)

        try {
            // Retrieve the element at the specified index
            String retrievedElement = fruits.get(indexToRetrieve);

            // Print the retrieved element
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement);

        } catch (IndexOutOfBoundsException e) {
            // Handle the case where the specified index is out of bounds
            System.err.println("Error: Invalid index.  Index " + indexToRetrieve + " is out of range.");
        }

           // Demonstrating retrieval with another index:
         indexToRetrieve=0; // Retrieve the first element (Apple)
         try {
                String retrievedElement = fruits.get(indexToRetrieve);
                System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement);
         } catch (IndexOutOfBoundsException e) {
               System.err.println("Error: Invalid index.  Index " + indexToRetrieve + " is out of range."); 
         }


    }
}
