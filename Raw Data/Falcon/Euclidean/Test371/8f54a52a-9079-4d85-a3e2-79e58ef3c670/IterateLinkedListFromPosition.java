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
        int startPosition = 2; // Start iterating from the element at index 2 ("Orange")

        // Iterate through the LinkedList from the specified position using a ListIterator
        ListIterator<String> iterator = linkedList.listIterator(startPosition);

        System.out.println("Iterating from position " + startPosition + ":");

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }


         //Example showing iterating backwards from a position:

        System.out.println("\nIterating backwards from position " + startPosition + ":");

        // Reset the iterator to the starting position (important if you've used it before)
        iterator = linkedList.listIterator(startPosition);  

        while(iterator.hasPrevious()) {
            String element = iterator.previous();
            System.out.println(element);

        }




    }
}
