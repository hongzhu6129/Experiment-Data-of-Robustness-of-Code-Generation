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

        // Specify the starting position (index)
        int startPosition = 2; // Start iterating from the 3rd element (index 2)

        // Iterate through the LinkedList from the specified position
        iterateFromPosition(linkedList, startPosition);


         // Example of handling invalid start position:
        int invalidStartPosition = 10; //  Beyond the list's bounds
        iterateFromPosition(linkedList, invalidStartPosition); // This will print an appropriate message

    }

    public static void iterateFromPosition(LinkedList<String> linkedList, int startPosition) {

        if (startPosition < 0 || startPosition >= linkedList.size()) {
            System.out.println("Invalid start position.  Must be within the bounds of the LinkedList.");
            return; // Exit the method if the start position is invalid
        }

        // Use a ListIterator to iterate from a specific position
        ListIterator<String> iterator = linkedList.listIterator(startPosition);

        System.out.println("Iterating from position " + startPosition + ":");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(); // Add a newline for clarity between examples
    }
}
