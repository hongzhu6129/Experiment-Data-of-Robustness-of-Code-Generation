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
        if (!linkedList.isEmpty()) {
            // Retrieve the first element using peek()
            String firstElement = linkedList.peek(); // or element() which does the same but throws NoSuchElementException if empty.

            // Print the first element
            System.out.println("First element: " + firstElement);


            // Print the linked list to show it's unchanged
            System.out.println("Linked List: " + linkedList);

        } else {
            System.out.println("The LinkedList is empty.");
        }
    }
}
