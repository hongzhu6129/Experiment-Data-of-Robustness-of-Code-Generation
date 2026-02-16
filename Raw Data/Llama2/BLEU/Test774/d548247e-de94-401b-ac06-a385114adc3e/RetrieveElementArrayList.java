import java.util.ArrayList;
import java.util.List;

public class RetrieveElementArrayList {

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
        int indexToRetrieve = 2; 

        try {
            // Retrieve the element at the specified index
            String retrievedElement = fruits.get(indexToRetrieve);

            // Print the retrieved element
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement);


            //Example demonstrating handling IndexOutOfBoundsException
            int invalidIndex = 10; //This index is out of bounds
            String element = fruits.get(invalidIndex); //This line will throw an exception
            System.out.println(element); //This line will not be reached



        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index. The index should be between 0 and " + (fruits.size() - 1));

            //Optionally, you can print the stack trace for debugging:
            //e.printStackTrace();
        }


    }
}
