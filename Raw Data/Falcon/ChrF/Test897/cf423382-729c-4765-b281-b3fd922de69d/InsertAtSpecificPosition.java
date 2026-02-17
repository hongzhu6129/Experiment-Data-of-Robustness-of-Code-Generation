import java.util.LinkedList;

public class InsertAtSpecificPosition {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Specify the element to insert and the position
        String elementToInsert = "Grape";
        int position = 1; // Insert at index 1 (second position)


        try {
            // Insert the element at the specified position
            linkedList.add(position, elementToInsert);

            // Print the updated LinkedList
            System.out.println("Updated LinkedList: " + linkedList);

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid position. Position should be between 0 and " + linkedList.size());
        }



        // Example 2: Demonstrate inserting at the beginning
        linkedList.add(0, "Mango"); // Inserts at the beginning
        System.out.println("LinkedList after inserting at beginning: " + linkedList);

        // Example 3: Demonstrate inserting at the end.  Using .add() without a position automatically adds to the end.
        linkedList.add("Kiwi"); // Inserts at the end
        System.out.println("LinkedList after inserting at the end: " + linkedList);

         // Example 4: Demonstrate error handling for out of bounds
        try {
            linkedList.add(10, "Melon");  //Trying to insert at index 10, which is out of bounds
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid position (Example 4).");
        }



    }
}
