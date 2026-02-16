import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedListFromPosition {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Elderberry");

        // Specify the starting position (e.g., index 2)
        int startPosition = 2;

        // Iterate through the LinkedList from the specified position
        ListIterator<String> iterator = linkedList.listIterator(startPosition);

        System.out.println("Iterating from position " + startPosition + ":");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        //Example demonstrating handling of invalid start position (out of bounds):
        int invalidStartPosition = 10;  // Out of bounds
        try {
             ListIterator<String> invalidIterator = linkedList.listIterator(invalidStartPosition);
            System.out.println("Iterating from invalid position " + invalidStartPosition + ":"); // This won't print
             while (invalidIterator.hasNext()) {
                 System.out.println(invalidIterator.next()); // This won't execute
             }
         } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid start position. " + e.getMessage());
         }

    }
}
