import java.util.ArrayList;
import java.util.List;

public class RetrieveElementFromArraylist {

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
        int index = 2;  // We want to retrieve the element at index 2 (Orange)


        try {
            // Retrieve the element at the specified index
            String retrievedFruit = fruits.get(index);

            // Print the retrieved element
            System.out.println("Element at index " + index + ": " + retrievedFruit);

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid index. Index should be between 0 and " + (fruits.size() - 1));
        }
    }
}
