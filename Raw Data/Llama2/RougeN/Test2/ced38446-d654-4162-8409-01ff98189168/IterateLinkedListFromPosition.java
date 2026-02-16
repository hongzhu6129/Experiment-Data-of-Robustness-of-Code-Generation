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
        int startPosition = 2; // Start iterating from the 3rd element (index 2)

        // Iterate through the LinkedList from the specified position
        if (startPosition >= 0 && startPosition < linkedList.size()) {  // Validate start position
            ListIterator<String> iterator = linkedList.listIterator(startPosition);
            System.out.println("Elements from position " + startPosition + ":");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } else {
            System.out.println("Invalid start position.  Must be between 0 and " + (linkedList.size() - 1));
        }



        // Example with an empty list
        LinkedList<Integer> emptyList = new LinkedList<>();
        int emptyListStartPosition = 0;

        if (emptyListStartPosition >= 0 && emptyListStartPosition < emptyList.size()) {
            ListIterator<Integer> emptyListIterator = emptyList.listIterator(emptyListStartPosition);
            System.out.println("Elements from empty list (none):"); // Nothing will be printed
            while (emptyListIterator.hasNext()) {
                System.out.println(emptyListIterator.next());
            }
        } else {
            System.out.println("Invalid start position for the empty list.");
        }

    }
}



