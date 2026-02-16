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
        System.out.println("After inserting Grape at index 1: " + linkedList);


        // Insert "Mango" at index 0 (beginning)
        insertAtIndex(linkedList, 0, "Mango");
        System.out.println("After inserting Mango at index 0: " + linkedList);

        // Insert "Kiwi" at the end (size of list)
        insertAtIndex(linkedList, linkedList.size(), "Kiwi"); 
        System.out.println("After inserting Kiwi at the end: " + linkedList);


         //Demonstrate handling index out of bounds
        try {
            insertAtIndex(linkedList, 10, "Pear"); // Invalid index
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }

    // Helper method to insert an element at a specific index.
    // This is just for demonstration within main, normally, you wouldn't 
    // create a helper method like this inside main.
    public static <T> void insertAtIndex(List<T> list, int index, T element) {
        if (index < 0 || index > list.size()) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for list of size " + list.size());
        }
        list.add(index, element);
    }
}
