import java.util.LinkedList;

public class RetrieveFirstElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");


        // Check if the list is empty before attempting to retrieve the first element
        if (!linkedList.isEmpty()) {
            String firstElement = linkedList.peekFirst(); // Retrieves, but does not remove, the first element

            System.out.println("First element: " + firstElement);


            // Demonstrate that the element is still in the list:
            System.out.println("List after peekFirst(): " + linkedList); 

        } else {
            System.out.println("The linked list is empty.");
        }
    }
}
