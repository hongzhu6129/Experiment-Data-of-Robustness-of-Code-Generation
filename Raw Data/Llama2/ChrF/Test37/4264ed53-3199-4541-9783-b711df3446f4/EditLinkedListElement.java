import java.util.LinkedList;

public class EditLinkedListElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        // Specify the position and new element
        int positionToEdit = 2; // Index 2 (Orange)
        String newElement = "Mango";

        // Edit the element at the specified position
        editElement(linkedList, positionToEdit, newElement);

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);

     // Example demonstrating edge cases
        LinkedList<Integer> numList = new LinkedList<>();
        numList.add(1);
        numList.add(2);

        editElement(numList, 0, 10);  // Edit at beginning
        System.out.println("List after edit at beginning: " + numList);

        editElement(numList, 1, 20);   // Edit at end
        System.out.println("List after edit at end: " + numList);


        editElement(numList, 5, 30); // Attempt to edit out of bounds (no change)
        System.out.println("List after out of bounds attempt: " + numList);

        LinkedList<Integer> emptyList = new LinkedList<>();
        editElement(emptyList, 0, 5); // Attempt to edit empty list (no change)
        System.out.println("Empty list after edit attempt: " + emptyList); 



    }


    public static <T> void editElement(LinkedList<T> list, int position, T newElement) {
        // Check if the position is valid 
        if (position >= 0 && position < list.size()) {
            list.set(position, newElement);
        } else {
            // Handle the case where the position is out of bounds.
            // For this example, we choose to do nothing and leave the list unchanged.
            // Alternatively, you could throw an exception or print an error message.
            System.out.println("Position " + position + " is out of bounds.  List remains unchanged.");
        }

    }
}
