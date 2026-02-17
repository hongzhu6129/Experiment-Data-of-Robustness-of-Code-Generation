import java.util.LinkedList;

public class InsertInLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> names = new LinkedList<>();

        // Add some initial names
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Specify the element to insert and the position
        String newElement = "David";
        int position = 2; // Insert at index 2 (becomes the 3rd element)


        // Check if the position is valid (0 <= position <= size)
        if (position >= 0 && position <= names.size()) {
            names.add(position, newElement);  // Insert the element

             // Print the updated LinkedList
            System.out.println("Updated LinkedList: " + names);
        } else {
            System.out.println("Invalid position. Position should be between 0 and " + names.size());
        }



        // Example with an invalid position:
        newElement = "Eve";
        position = 10; // Invalid position (out of bounds)

         if (position >= 0 && position <= names.size()) {
            names.add(position, newElement);  // Insert the element

             // Print the updated LinkedList
            System.out.println("Updated LinkedList: " + names);
        } else {
            System.out.println("Invalid position. Position should be between 0 and " + names.size());
        }


    }
}
