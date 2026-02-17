import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");


        System.out.println("Original LinkedList: " + linkedList);


        // Method 1: Using a descending iterator (ListIterator)
        System.out.println("\nIterating in reverse using ListIterator:");
        Iterator<String> descendingIterator = linkedList.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();


        // Method 2: Using ListIterator's previous() method
        System.out.println("\nIterating in reverse using ListIterator's previous():");
        ListIterator<String> listIterator = linkedList.listIterator(linkedList.size()); // Start at the end
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println();


        //Method 3: Using Java Streams (requires Java 8+) and collecting to a new list
        System.out.println("\nIterating in reverse using Java Streams:");

        java.util.List<String> reversedList = linkedList.stream() // Convert to a stream
                .collect(java.util.stream.Collectors.toCollection(java.util.LinkedList::new)); // Collect to a new LinkedList
        java.util.Collections.reverse(reversedList); // Reverse using Collections framework
        reversedList.forEach(item -> System.out.print(item + " "));
        System.out.println();



        // Method 4: Simple for loop with reversed index (for small lists where creating another iterator might be less efficient).
        System.out.println("\nIterating in reverse using reversed index:");
        for(int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();


    }
}
