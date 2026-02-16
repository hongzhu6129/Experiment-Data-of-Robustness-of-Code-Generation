import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedListIteration {

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");
        linkedList.add("Mango");

        System.out.println("Original LinkedList: " + linkedList);

        // Iterate in reverse order using a ListIterator
        ListIterator<String> iterator = linkedList.listIterator(linkedList.size()); // Start from the end

        System.out.print("Reversed LinkedList: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();


        // Iterate a *part* of the list in reverse (e.g., last 3 elements)
        int startIndex = Math.max(0, linkedList.size() - 3); // Adjust as needed
        ListIterator<String> partialIterator = linkedList.listIterator(linkedList.size());

        System.out.print("Partially Reversed (last 3): ");
        int count = 0;

        while (partialIterator.hasPrevious() && count < 3) {  // Iterate only for the last 3 elements
            System.out.print(partialIterator.previous() + " ");
             count++;
        }
        System.out.println();


    }
}
