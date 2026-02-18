import java.util.LinkedList;

public class LinkedListLastElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");


        if (!linkedList.isEmpty()) {
            // Retrieve the last element using peekLast() - doesn't remove
            String lastElement = linkedList.peekLast();

            // Print the last element
            System.out.println("Last element: " + lastElement);


            // Verify that the element is still in the list
            System.out.println("Linked List after peekLast(): " + linkedList);
        } else {
            System.out.println("The LinkedList is empty.");
        }
    }
}
