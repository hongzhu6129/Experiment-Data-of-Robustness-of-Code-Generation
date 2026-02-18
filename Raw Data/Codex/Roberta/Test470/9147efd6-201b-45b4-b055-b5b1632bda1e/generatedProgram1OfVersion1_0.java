import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        System.out.println("Original LinkedList: " + linkedList);

        // Iterate and print in reverse order using a descendingIterator
        System.out.print("Reversed LinkedList: ");
        Iterator<String> descendingIterator = linkedList.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next());
            if (descendingIterator.hasNext()) { // Add a comma and space if not the last element
                System.out.print(", ");
            }
        }
        System.out.println(); // Newline for better formatting

         //Alternative approach using for loop and size:
         System.out.print("Reversed LinkedList (for loop): ");
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.print(linkedList.get(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


    }
}
