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
        int startingPosition = 2;

        // Iterate through the LinkedList from the specified position
        iterateFromPosition(linkedList, startingPosition);


         // Example with an invalid position (handling out of bounds)
        int invalidPosition = 10; // Out of bounds
        iterateFromPosition(linkedList, invalidPosition);



        // Example with position 0 (beginning of the list)
        iterateFromPosition(linkedList,0);


        // Example with negative position (handling gracefully)
        iterateFromPosition(linkedList,-2);

    }


    public static void iterateFromPosition(LinkedList<String> linkedList, int startingPosition) {
        if (startingPosition < 0 || startingPosition >= linkedList.size()) {
            System.out.println("Invalid starting position.  Position must be between 0 and " + (linkedList.size() - 1) + " inclusive.");
            return; // Or handle the error in a different way (throw exception, etc.)
        }

        ListIterator<String> iterator = linkedList.listIterator(startingPosition);

        System.out.print("Elements from position " + startingPosition + ": ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(); // New line for cleaner output

    }
}
