import java.util.ArrayList;
import java.util.List;

public class RetrieveElementArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> colors = new ArrayList<>();

        // Add some elements to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        // Specify the index of the element to retrieve
        int index = 2; // Example: retrieve the element at index 2 (Blue)


        try {
            // Retrieve the element at the specified index using .get()
            String element = colors.get(index);

            // Print the retrieved element
            System.out.println("Element at index " + index + ": " + element);


        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index.  Index " + index + " is out of bounds.");
        }

        // Example with an invalid index (demonstrates error handling):
        index = 10; // Out of bounds

        try {
             String element = colors.get(index);  // This will throw an IndexOutOfBoundsException
             System.out.println("Element at index " + index + ": " + element); // This won't execute
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Index " + index + " is out of bounds.");
        }



    }
}
