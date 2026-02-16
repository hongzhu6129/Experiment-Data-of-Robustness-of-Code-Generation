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

        // Method 1: Using a descendingIterator (most efficient for LinkedList)
        System.out.print("Reversed LinkedList (using descendingIterator): ");
        Iterator<String> descendingIterator = linkedList.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();


        // Method 2: Using Java 8 streams and Collections.reverse (less efficient for LinkedList)
        //  This approach creates a new list, impacting performance.
         java.util.List<String> reversedList = new java.util.ArrayList<>(linkedList); // Create a copy to avoid modifying the original list
         java.util.Collections.reverse(reversedList);
         System.out.println("Reversed LinkedList (using Collections.reverse): " + reversedList);


        // Method 3: Iterating backwards using indices (less efficient than descendingIterator)
        System.out.print("Reversed LinkedList (using indices): ");
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();


    }
}
