import java.util.LinkedList;

public class RetrieveFirstElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Check if the list is empty
        if (linkedList.isEmpty()) {
            System.out.println("The linked list is empty.");
        } else {
            // Retrieve the first element without removing it using peek()
            String firstElement = linkedList.peek(); 

            // Or, alternatively use getFirst() which also doesn't remove:
            // String firstElement = linkedList.getFirst();


            if (firstElement != null) { // good practice to check for null in case peek() returns null on an empty list (though getFirst() would throw an exception).
                System.out.println("First element (without removing): " + firstElement);
            }

            // Print the linked list to demonstrate that the element was not removed
            System.out.println("Linked list after retrieval: " + linkedList);
        }
    }
}
