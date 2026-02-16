import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Elderberry");

        // Specify the starting position (index)
        int startPosition = 2; // Example: Start from the 3rd element (index 2)


        if (startPosition < 0 || startPosition >= linkedList.size()) {
            System.out.println("Invalid start position.");
            return;  // Exit if the start position is out of bounds
        }


        // Iterate using ListIterator from specified position
        ListIterator<String> iterator = linkedList.listIterator(startPosition);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


         //Example using a for loop and get() (less efficient for LinkedLists):
         System.out.println("\nIterating with a for loop (less efficient):");
        for (int i = startPosition; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

    }
}
