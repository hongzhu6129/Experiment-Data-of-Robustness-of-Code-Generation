import java.util.LinkedList;

public class RetrieveFirstElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Check if the list is empty before retrieving the first element
        if (!linkedList.isEmpty()) {
            // Retrieve the first element using peek() or getFirst() 
            String firstElement = linkedList.peek(); // peek() does not remove the element
            // String firstElement = linkedList.getFirst(); // getFirst() also works, but has the same effect as peek() in this context since we aren't removing it.

            // Print the first element
            System.out.println("First element: " + firstElement);


            // Print the linked list to verify that the element is still there
            System.out.println("Linked List: " + linkedList);
        } else {
            System.out.println("The linked list is empty.");
        }
    }
}
