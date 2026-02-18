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
        int index = 2;  // We want to retrieve the element at index 2 (Orange)

        try {
            // Retrieve the element at the specified index
            String retrievedElement = fruits.get(index);

            // Print the retrieved element
            System.out.println("Element at index " + index + ": " + retrievedElement);


            // Example with an invalid index (demonstrating error handling):
            int invalidIndex = 10; // Index out of bounds

            String element = fruits.get(invalidIndex); // This will throw an IndexOutOfBoundsException


        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index.  Index " + index + " is out of bounds for the ArrayList."); // Or invalidIndex if demonstrating the error example
            // In a real application you might handle this more gracefully (e.g. return a default value or log the error)
        }
    }
}

