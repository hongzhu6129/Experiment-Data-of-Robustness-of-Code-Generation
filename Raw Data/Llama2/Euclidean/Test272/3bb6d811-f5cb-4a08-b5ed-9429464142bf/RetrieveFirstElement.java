import java.util.LinkedList;

public class RetrieveFirstElement {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        // Add some names to the linked list
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Check if the list is empty before retrieving the first element
        if (!names.isEmpty()) {
            String firstElement = names.peekFirst(); // or names.getFirst() - both work

            System.out.println("First element: " + firstElement);

            // Verify that the element is not removed
            System.out.println("Linked list after retrieval: " + names); 
        } else {
            System.out.println("The linked list is empty.");
        }
    }
}
