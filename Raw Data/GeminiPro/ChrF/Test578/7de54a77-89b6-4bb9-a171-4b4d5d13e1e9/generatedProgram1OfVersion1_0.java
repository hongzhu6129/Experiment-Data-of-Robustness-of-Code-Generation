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

        // Specify the starting position (index)
        int startPosition = 2; // Start from the 3rd element (index 2)

        // Iterate through the LinkedList from the specified position
        if (startPosition >= 0 && startPosition < linkedList.size()) {
            ListIterator<String> iterator = linkedList.listIterator(startPosition);

            System.out.println("Iterating from position " + startPosition + ":");

            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }


        } else {
            System.out.println("Invalid start position.");
        }

                //Example demonstrating iterating backwards from a position:
        int reverseStartPosition = 3;
        if (reverseStartPosition >= 0 && reverseStartPosition < linkedList.size()) {
            ListIterator<String> reverseIterator = linkedList.listIterator(reverseStartPosition);
            System.out.println("\nIterating backwards from position " + reverseStartPosition + ":");
            while (reverseIterator.hasPrevious()) {
                System.out.println(reverseIterator.previous());
            }
        } else {
            System.out.println("Invalid start position for reverse iteration.");

        }
    }
}
