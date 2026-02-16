import java.util.LinkedList;

public class LinkedListFirstElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Check if the list is empty before attempting to retrieve the first element
        if (!linkedList.isEmpty()) {
            // Retrieve the first element using peek() or getFirst()
            String firstElement = linkedList.peek(); // peek() returns null if the list is empty
            //String firstElement = linkedList.getFirst(); // getFirst() throws NoSuchElementException if the list is empty

            // Print the first element
            System.out.println("First element: " + firstElement);


            // Demonstrate that the element is still in the list:
            System.out.println("List after peeking: " + linkedList);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
