import java.util.LinkedList;

public class InsertElementLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert
        String elementToInsert = "Grape";

        // Position to insert (index starts from 0)
        int position = 1;

        // Insert the element at the specified position
        insertElement(linkedList, elementToInsert, position);

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


        // Example with an invalid position (demonstrates error handling)
        int invalidPosition = 5; // Out of bounds
        insertElement(linkedList, "Mango", invalidPosition);


    }

    public static void insertElement(LinkedList<String> list, String element, int position) {
        try {
            list.add(position, element);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid position.  Cannot insert at position " + position + ". List size is " + list.size());
        }
    }
}
