import java.util.LinkedList;

public class LinkedListRetrieveFirst {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Check if the list is empty before attempting to retrieve the first element
        if (!linkedList.isEmpty()) {
            // Retrieve the first element using peek() or getFirst()
            String firstElement = linkedList.peek(); // peek() doesn't remove
           //String firstElement = linkedList.getFirst(); // getFirst() also retrieves without removing.  Either works.

            // Print the first element
            System.out.println("First element: " + firstElement);


            // Print the linked list to demonstrate it's unchanged.
            System.out.println("Linked list after retrieval: " + linkedList);
        } else {
            System.out.println("The linked list is empty.");
        }
    }
}
