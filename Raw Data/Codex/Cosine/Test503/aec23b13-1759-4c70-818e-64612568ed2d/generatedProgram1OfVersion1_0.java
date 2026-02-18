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
            // Retrieve the first element using peek()
            String firstElement = linkedList.peek(); 

            // Print the first element
            System.out.println("First element: " + firstElement);


             //Alternatively, use element() (throws NoSuchElementException if empty)
            //String firstElement = linkedList.element();
            //System.out.println("First element (using element()): " + firstElement);


             //Alternatively, you can get by index 0 (throws IndexOutOfBoundsException if empty)
             // String firstElement = linkedList.get(0); 
             // System.out.println("First element (using get(0)): " + firstElement);



        } else {
            System.out.println("The linked list is empty.");
        }


        // Verify that the element is still in the LinkedList
        System.out.println("Linked List after retrieving (still contains first element): " + linkedList);
    }
}
