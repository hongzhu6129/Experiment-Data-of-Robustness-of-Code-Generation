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
        int index = 2; // We want to retrieve the element at index 2 (which is "Orange")

        try {
            // Retrieve the element at the specified index
            String retrievedElement = fruits.get(index);

            // Print the retrieved element
            System.out.println("Element at index " + index + ": " + retrievedElement);


            //Example demonstrating handling of IndexOutOfBoundsException
            int invalidIndex = 10; //This index is out of bounds

            try {
                String element = fruits.get(invalidIndex);
                System.out.println("Element at invalid index " + invalidIndex + ": " + element); //This won't be reached if the exception is thrown

            } catch (IndexOutOfBoundsException e) {
                System.err.println("Error: Invalid index " + invalidIndex + ". " + e.getMessage());

            }



        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index " + index + ". " + e.getMessage());
        }


    }
}
