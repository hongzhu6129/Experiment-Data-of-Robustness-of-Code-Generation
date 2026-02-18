import java.util.LinkedList;

public class LinkedListPeek {

    public static void main(String[] args) {

        // Create a LinkedList of Strings
        LinkedList<String> languages = new LinkedList<>();

        // Add some elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");


        // Check if the list is empty before attempting to retrieve the first element
        if (!languages.isEmpty()) {
            // Retrieve the first element using peek() - does not remove the element.
            String firstElement = languages.peek(); 

            // Print the first element
            System.out.println("First element (using peek()): " + firstElement); 

            // Demonstrate that peek() doesn't remove the element.
            System.out.println("List after peek(): " + languages);


            // Alternatively, use element() which is equivalent to peek().
            String firstElementAgain = languages.element();
            System.out.println("First element (using element()): " + firstElementAgain);
            System.out.println("List after element(): " + languages); // List remains unchanged



             //peekFirst() is also equivalent to peek() and element()
            String firstElementYetAgain = languages.peekFirst();
            System.out.println("First element (using peekFirst()): " + firstElementYetAgain);
            System.out.println("List after peekFirst(): " + languages); // List remains unchanged


            // Contrast with poll():  Retrieves AND removes the first element
             String polledElement = languages.poll();
            System.out.println("Polled element (using poll()): " + polledElement);
            System.out.println("List after poll(): " + languages); // First element is NOW removed


         } else {
            System.out.println("The LinkedList is empty.");
        }
    }
}
