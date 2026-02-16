import java.util.ArrayList;
import java.util.List;

public class RetrieveElementFromArraylist {

    public static void main(String[] args) {

        // Create an ArrayList of Strings
        List<String> fruits = new ArrayList<>();

        // Add some elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");


        // Specify the index of the element to retrieve
        int indexToRetrieve = 2; // We want to get "Orange"


        try {
            // Retrieve the element at the specified index
            String retrievedElement = fruits.get(indexToRetrieve);

            // Print the retrieved element
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement);


        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index.  Index " + indexToRetrieve + " is out of bounds for the ArrayList.");

        }


        // Example with an invalid index (demonstrating error handling)
        indexToRetrieve = 10; // This index is out of bounds

        try {
            // Retrieve the element at the specified index (this will throw an exception)
            String retrievedElement = fruits.get(indexToRetrieve); 
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement); //This won't execute due to the exception

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index.  Index " + indexToRetrieve + " is out of bounds for the ArrayList.");
        }
    }
}
