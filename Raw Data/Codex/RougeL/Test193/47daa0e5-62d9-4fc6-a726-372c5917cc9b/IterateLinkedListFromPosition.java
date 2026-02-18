import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedListFromPosition {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");
        linkedList.add("Mango");

        // Specify the starting position (e.g., 2 - which is the 3rd element "Orange")
        int startPosition = 2;

        // Iterate through the LinkedList from the specified position
        iterateFromPosition(linkedList, startPosition);


        // Example with invalid start position (handling edge cases)
        System.out.println("\nExample with invalid start position:");
        iterateFromPosition(linkedList, -1); // Negative index
        iterateFromPosition(linkedList, linkedList.size() +1 );  // Too large index
        iterateFromPosition(linkedList, linkedList.size());  // Equal to the size

    }

    public static void iterateFromPosition(LinkedList<String> linkedList, int startPosition) {

       if (startPosition < 0 || startPosition > linkedList.size() ) {  // Added a check to handle startPosition >= size as well.
            System.out.println("Invalid start position.");
            return; 
        }


        ListIterator<String> iterator = linkedList.listIterator(startPosition);

        System.out.println("Iterating from position " + startPosition + ":");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
