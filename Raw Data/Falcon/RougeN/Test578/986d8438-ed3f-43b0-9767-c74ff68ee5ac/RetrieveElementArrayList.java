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
        fruits.add("Mango");
        fruits.add("Grape");

        // Specify the index of the element to retrieve
        int index = 2;

        try {
            // Retrieve the element at the specified index
            String element = fruits.get(index);

            // Print the retrieved element
            System.out.println("Element at index " + index + ": " + element);

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index. Index must be between 0 and " + (fruits.size() - 1));
         }


        // Example demonstrating retrieving with an invalid index:
         index = 10; //An index that is out of bounds

         try {
            String element = fruits.get(index);
            System.out.println("Element at index " + index + ": " + element); //This won't execute due to the exception
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index. Index must be between 0 and " + (fruits.size() - 1)); 
        }
    }
}
