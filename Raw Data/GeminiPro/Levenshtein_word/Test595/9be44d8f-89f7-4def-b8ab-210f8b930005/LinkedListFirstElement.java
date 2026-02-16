import java.util.LinkedList;

public class LinkedListFirstElement {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        // Add some names to the LinkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Check if the list is empty before attempting to retrieve the first element
        if (!names.isEmpty()) {
            String firstElement = names.peekFirst(); // or names.getFirst();  Both work. peekFirst is generally preferred as it doesn't throw an exception on empty lists.

            System.out.println("First element: " + firstElement); // Output: Alice

            // Verify that the element is still in the LinkedList
            System.out.println("Linked List: " + names); // Output: [Alice, Bob, Charlie] (demonstrating it's not removed)
        } else {
            System.out.println("The LinkedList is empty.");
        }


        // Example with an empty list to demonstrate peekFirst's behavior:
         LinkedList<String> emptyNames = new LinkedList<>();
         String firstEmpty = emptyNames.peekFirst(); // Returns null, doesn't throw an exception.

        if (firstEmpty == null) {
             System.out.println("The LinkedList is empty (demonstrated with peekFirst)");
        }


       // Showing getFirst() behavior with an empty list (for comparison):
        // This is commented out because it will cause a NoSuchElementException if uncommented and run.
       /*
        LinkedList<String> emptyNames2 = new LinkedList<>();
        String firstEmpty2 = emptyNames2.getFirst();  // Throws NoSuchElementException if the list is empty
        System.out.println(firstEmpty2); 
       */
    }
}
