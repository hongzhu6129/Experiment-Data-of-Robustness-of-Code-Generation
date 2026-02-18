import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");
        linkedList.add("Mango");

        // Specify the starting position (index)
        int startPosition = 2;  // Start iterating from the element at index 2 ("Orange")

        // Check if the start position is valid
        if (startPosition < 0 || startPosition >= linkedList.size()) {
            System.out.println("Invalid start position.");
            return; // Exit the program if the start position is invalid
        }


        // Iterate through the LinkedList starting from the specified position using ListIterator
        ListIterator<String> iterator = linkedList.listIterator(startPosition);
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }


        //Alternative approach using a simple for loop (less flexible, but suitable if you only need forward iteration from a position):

        System.out.println("\nUsing a for loop:"); //separator for clarity

        for (int i = startPosition; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i)); 
        }
    }
}
