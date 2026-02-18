import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOccurrence {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(5);

        // Element to find occurrences of
        int element = 2;

        // Find first and last occurrences
        int firstOccurrence = -1;
        int lastOccurrence = -1;

        ListIterator<Integer> iterator = linkedList.listIterator();
        int index = 0;

        while (iterator.hasNext()) {
            if (iterator.next() == element) {
                if (firstOccurrence == -1) {
                    firstOccurrence = index;
                }
                lastOccurrence = index; 
            }
            index++;
        }

        // Print the results
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + element + ": " + firstOccurrence);
            System.out.println("Last occurrence of " + element + ": " + lastOccurrence);
        } else {
            System.out.println(element + " not found in the linked list.");
        }


        // Example with a different element
        element = 6; // An element not in the list
        firstOccurrence = -1;
        lastOccurrence = -1;
        iterator = linkedList.listIterator();
        index = 0;
        while (iterator.hasNext()) {
             if (iterator.next() == element) {
                if (firstOccurrence == -1) {
                    firstOccurrence = index;
                }
                lastOccurrence = index;
            }
            index++;
        }

        if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + element + ": " + firstOccurrence);
            System.out.println("Last occurrence of " + element + ": " + lastOccurrence);

        } else {
            System.out.println(element + " not found in the linked list.");
        }
    }
}
