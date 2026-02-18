import java.util.LinkedList;

public class InsertAtEndLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of strings (names)
        LinkedList<String> names = new LinkedList<>();

        // Add some initial names
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Specify the element to insert at the end
        String newElement = "David";


        // Insert the new element at the end of the linked list 
        names.addLast(newElement); // Or names.add(newElement);  Both work for adding at the end.

        // Print the updated linked list
        System.out.println("Updated LinkedList: " + names); 
    }
}
