import java.util.ArrayList;
import java.util.List;

public class InsertAtFirst {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> colors = new ArrayList<>();

        // Add some initial elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Element to insert at the beginning
        String newColor = "Yellow";

        // Insert the new element at the first position (index 0)
        colors.add(0, newColor);


        // Print the updated ArrayList
        System.out.println("ArrayList after insertion: " + colors); 
    }
}
