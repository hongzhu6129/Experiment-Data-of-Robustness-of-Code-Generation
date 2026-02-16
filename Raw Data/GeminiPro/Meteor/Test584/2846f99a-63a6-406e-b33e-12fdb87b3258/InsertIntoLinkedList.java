import java.util.LinkedList;
import java.util.List;

public class InsertIntoLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        List<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        System.out.println("Original LinkedList: " + linkedList);

        // Insert "Grape" at index 1
        insertAtIndex(linkedList, 1, "Grape");
        System.out.println("After inserting 'Grape' at index 1: " + linkedList);


        // Insert "Mango" at index 0 (beginning)
        insertAtIndex(linkedList, 0, "Mango");
        System.out.println("After inserting 'Mango' at index 0: " + linkedList);

        // Insert "Kiwi" at the end (size of the list)
        insertAtIndex(linkedList, linkedList.size(), "Kiwi"); // Insert at the end
        System.out.println("After inserting 'Kiwi' at the end: " + linkedList);

        // Example of handling an invalid index (out of bounds) - you might want to throw an exception in a real application
        insertAtIndex(linkedList, 10, "Watermelon"); // Index 10 is invalid
        System.out.println("After trying to insert at an invalid index: " + linkedList);

    }

    // Helper method to insert at a specific index
    public static <T> void insertAtIndex(List<T> list, int index, T element) {
        if (index >= 0 && index <= list.size()) { // Check for valid index
            list.add(index, element); 
        } else {
            System.out.println("Error: Invalid index " + index + " for insertion.");
            // In a real application, consider throwing an IndexOutOfBoundsException here.
        }
    }


}
