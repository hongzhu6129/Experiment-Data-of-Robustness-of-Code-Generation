import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Original LinkedList: " + linkedList);

        // Method 1: Using a ListIterator (recommended for LinkedList)
        System.out.print("Reversed LinkedList (using ListIterator): ");
        ListIterator<Integer> listIterator = linkedList.listIterator(linkedList.size()); // Start from the end
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();


        // Method 2: Using descendingIterator() (Java 8+ specific to LinkedList)
        System.out.print("Reversed LinkedList (using descendingIterator): ");
        Iterator<Integer> descendingIterator = linkedList.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();


       // Method 3:  Using a for loop and get() with size()-i-1  (Generally less efficient for LinkedList)
        System.out.print("Reversed LinkedList (using for loop and get): ");
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();
    }
}



