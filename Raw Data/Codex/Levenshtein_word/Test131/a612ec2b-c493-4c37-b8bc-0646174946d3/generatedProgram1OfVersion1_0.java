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


        if (!linkedList.isEmpty()) { // Check if the list is empty to avoid exceptions

            // Retrieve the last element using peekLast() - does not remove
            String lastElement = linkedList.peekLast();

            // Print the last element
            System.out.println("Last element: " + lastElement);


            // Verify that the element is still in the list:
            System.out.println("List contents after peekLast(): " + linkedList);


        } else {
            System.out.println("The LinkedList is empty.");
        }

        // Example with an empty list:
        LinkedList<Integer> emptyList = new LinkedList<>();

        if (emptyList.isEmpty()) {
            System.out.println("The emptyList is empty (as expected)."); // Demonstrates the empty list check
        }


    }
}
