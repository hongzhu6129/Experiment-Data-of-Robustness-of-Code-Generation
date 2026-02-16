import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Elderberry");

        // Specify the starting position (index)
        int startPosition = 2; // Start iterating from the 3rd element (index 2)

        // Check if the start position is valid
        if (startPosition < 0 || startPosition >= linkedList.size()) {
            System.out.println("Invalid start position.");
            return; // Exit if the start position is out of bounds
        }

        // Iterate through the LinkedList starting from the specified position using a ListIterator
        ListIterator<String> iterator = linkedList.listIterator(startPosition);

        System.out.println("Elements starting from position " + startPosition + ":");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



        // Example of iterating backwards from a given position:

         startPosition = 3;
         if (startPosition < 0 || startPosition >= linkedList.size()) {
            System.out.println("Invalid start position (backwards example).");
            return; 
        }

        iterator = linkedList.listIterator(startPosition); // Reset the iterator

         System.out.println("\nElements backwards from position " + startPosition + ":");

        while (iterator.hasPrevious()) { // Use hasPrevious() and previous()
            System.out.println(iterator.previous());
        }
    }
}
