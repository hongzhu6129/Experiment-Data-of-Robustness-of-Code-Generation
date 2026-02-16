import java.util.LinkedList;

public class InsertAtParticularPosition {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Specify the element to insert and the position
        String elementToInsert = "Grape";
        int position = 2; // Insert at index 2 (becomes the 3rd element)

        // Insert the element at the specified position.
        // Note: LinkedList's add(int index, E element) handles index bounds automatically
        try {
            linkedList.add(position, elementToInsert);

            // Print the updated LinkedList
            System.out.println("Updated LinkedList: " + linkedList);


        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid position.  Position should be between 0 and " + linkedList.size());
        }


        // Example demonstrating inserting at the beginning
        linkedList.add(0,"Mango");
        System.out.println("Updated LinkedList (Insert at Beginning): " + linkedList);


         // Example demonstrating inserting at the end
        linkedList.add(linkedList.size(),"Kiwi");
        System.out.println("Updated LinkedList (Insert at End): " + linkedList);


        // Example demonstrating out of bounds (would be handled by exception)
        try {
            linkedList.add(100, "Watermelon"); // This will throw an IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid position (out of bounds): " + e.getMessage());
        }



    }
}
