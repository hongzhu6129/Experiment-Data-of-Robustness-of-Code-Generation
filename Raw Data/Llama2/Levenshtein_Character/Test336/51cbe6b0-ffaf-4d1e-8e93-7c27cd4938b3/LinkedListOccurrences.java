import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOccurrences {

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);

        // Element to search for
        int target = 2;

        // Find first and last occurrences using ListIterator
        int firstOccurrence = -1;
        int lastOccurrence = -1;

        ListIterator<Integer> iterator = numbers.listIterator();
        int index = 0;

        while (iterator.hasNext()) {
            if (iterator.next().equals(target)) {
                if (firstOccurrence == -1) {
                    firstOccurrence = index;
                }
                lastOccurrence = index;
            }
            index++;
        }

        // Print results
        System.out.println("Linked List: " + numbers);
        System.out.println("Target element: " + target);

        if (firstOccurrence != -1) {
            System.out.println("First occurrence: " + firstOccurrence);
            System.out.println("Last occurrence: " + lastOccurrence);
        } else {
            System.out.println("Element not found in the list.");
        }




          // Example with a different element that is NOT in the list
        target = 7;  // Change the target to 7

          firstOccurrence = -1; // Reset for the new search
          lastOccurrence = -1;

         iterator = numbers.listIterator(); // Reset the iterator
        index = 0; // Reset index

        while (iterator.hasNext()) {
            if (iterator.next().equals(target)) {
                if (firstOccurrence == -1) {
                    firstOccurrence = index;
                }
                lastOccurrence = index;
            }
            index++;
        }
        
        System.out.println("\nLinked List: " + numbers); // Print the list again (no change expected)
        System.out.println("Target element: " + target);

        if (firstOccurrence != -1) {
            System.out.println("First occurrence: " + firstOccurrence);
            System.out.println("Last occurrence: " + lastOccurrence);
        } else {
            System.out.println("Element not found in the list."); // This should be printed now
        }




    }
}
