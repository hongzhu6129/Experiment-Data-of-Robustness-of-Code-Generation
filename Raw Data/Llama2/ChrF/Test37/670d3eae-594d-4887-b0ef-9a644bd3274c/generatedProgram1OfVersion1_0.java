import java.util.LinkedList;

public class InsertAtSpecifiedPosition {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert
        String elementToInsert = "Grape";

        // Position to insert (0-based index)
        int position = 1;


        try {
            // Insert the element at the specified position
            linkedList.add(position, elementToInsert);

            // Print the updated LinkedList
            System.out.println("Updated LinkedList: " + linkedList);


        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid position. Position should be between 0 and " + (linkedList.size()));
        }


        // Example with an invalid position (out of bounds)
        position = 5; //  Greater than the current size
        try {
             linkedList.add(position, "Mango"); // This will throw an IndexOutOfBoundsException

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid position. Position should be between 0 and " + (linkedList.size()));
        }

          // Example of inserting at the beginning
           linkedList.add(0, "Peach");
           System.out.println("LinkedList after inserting at the beginning: " + linkedList);


           // Example of inserting at the end (equivalent to using add())
           linkedList.add(linkedList.size(), "Kiwi"); // Size gives the next available position
           System.out.println("LinkedList after inserting at the end: " + linkedList);
    }
}
