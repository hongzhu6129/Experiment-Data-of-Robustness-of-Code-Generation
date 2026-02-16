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
            // Retrieve the first element using peek()
            String firstElement = linkedList.peek(); 

            // Print the first element
            System.out.println("First element: " + firstElement);

            // Verify that the element was not removed
            System.out.println("Linked list after peek(): " + linkedList);


             // Alternative using getFirst() (throws exception if list is empty):
             try {
                 String firstElement2 = linkedList.getFirst();
                 System.out.println("First element (using getFirst()): " + firstElement2);
                 System.out.println("Linked list after getFirst(): " + linkedList); // Remains unchanged
             } catch (java.util.NoSuchElementException e) {
                System.out.println("Error: Cannot get first element from an empty list.");
             }


             // Example demonstrating difference between peek() and poll():
             LinkedList<String> anotherList = new LinkedList<>();
             anotherList.add("Grape");
             anotherList.add("Mango");

             String peekedElement = anotherList.peek(); // Retrieves, doesn't remove
             String polledElement = anotherList.poll(); // Retrieves AND removes

             System.out.println("Peeked element: " + peekedElement);
             System.out.println("Polled element: " + polledElement);
             System.out.println("List after peek() and poll(): " + anotherList); // Mango removed

        }
    }
}
