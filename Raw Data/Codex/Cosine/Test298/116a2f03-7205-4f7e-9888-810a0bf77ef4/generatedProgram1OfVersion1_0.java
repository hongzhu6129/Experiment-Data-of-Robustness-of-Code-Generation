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
        ListIterator<String> iterator = linkedList.listIterator(linkedList.size()); // Start at the end

        System.out.print("Reversed LinkedList: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();


        //Iterate a part of the list in reverse (e.g., from index 3 to 1)
        int startIndex = 3; // Exclusive upper bound (like subList)
        int endIndex = 1;  // Inclusive lower bound

        if (startIndex > linkedList.size() || endIndex < 0 || startIndex <= endIndex) {
            System.out.println("Invalid start or end indices for partial reverse.");
            return;
        }

        ListIterator<String> partialIterator = linkedList.listIterator(startIndex);
        System.out.print("Partially Reversed (from index " + (startIndex-1) + " to " + endIndex + "): ");

        while (partialIterator.previousIndex() >= endIndex) {
            System.out.print(partialIterator.previous() + " ");

        }
        System.out.println();


    }
}
