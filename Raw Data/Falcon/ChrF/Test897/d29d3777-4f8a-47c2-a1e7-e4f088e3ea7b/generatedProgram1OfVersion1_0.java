import java.util.LinkedList;

public class InsertAtSpecificPosition {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert
        String elementToInsert = "Grape";

        // Position to insert at (0-indexed)
        int insertionPosition = 1;

        // Check if the position is valid
        if (insertionPosition >= 0 && insertionPosition <= linkedList.size()) {
            // Insert the element at the specified position
            linkedList.add(insertionPosition, elementToInsert);

            // Print the updated LinkedList
            System.out.println("Updated LinkedList: " + linkedList); 
        } else {
            System.out.println("Invalid insertion position.");
        }


        //Example with int

         // Create a LinkedList
        LinkedList<Integer> intLinkedList = new LinkedList<>();

        // Add some initial elements
        intLinkedList.add(10);
        intLinkedList.add(20);
        intLinkedList.add(30);

        // Element to insert
        int intToInsert = 15;

        // Position to insert at (0-indexed)
        int intInsertionPosition = 1;

        // Check if the position is valid
        if (intInsertionPosition >= 0 && intInsertionPosition <= intLinkedList.size()) {
            // Insert the element at the specified position
            intLinkedList.add(intInsertionPosition, intToInsert);

            // Print the updated LinkedList
            System.out.println("Updated Integer LinkedList: " + intLinkedList); 
        } else {
            System.out.println("Invalid insertion position.");
        }
    }
}
