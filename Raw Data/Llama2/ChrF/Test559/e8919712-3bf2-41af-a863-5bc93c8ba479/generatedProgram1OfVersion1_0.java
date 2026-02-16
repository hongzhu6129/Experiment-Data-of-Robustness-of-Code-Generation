import java.util.ArrayList;
import java.util.List;

public class InsertAtFirst {

    public static void main(String[] args) {
        // Create an ArrayList
        List<String> list = new ArrayList<>();

        // Add some initial elements (optional)
        list.add("Second");
        list.add("Third");
        list.add("Fourth");

        // Print the initial list
        System.out.println("Initial ArrayList: " + list);

        // Element to insert at the first position
        String elementToInsert = "First";

        // Insert the element at the first position (index 0)
        list.add(0, elementToInsert);


        // Print the updated list
        System.out.println("ArrayList after insertion: " + list);
    }
}
