import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Elderberry");

        // Specify the starting position (index)
        int startPosition = 2; // Start iterating from the element at index 2 ("Cherry")


        if (startPosition < 0 || startPosition >= linkedList.size()) {
            System.out.println("Invalid start position.");
            return; //or throw an exception
        }


        // Iterate through the LinkedList from the specified position using a ListIterator
        ListIterator<String> iterator = linkedList.listIterator(startPosition);

        System.out.println("Iterating from position " + startPosition + ":");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

         //Alternatively, iterate using a simple for loop (less efficient if LinkedList)
         /*
        System.out.println("Iterating from position " + startPosition + " (using for loop):");
         for (int i = startPosition; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
         }
         */
    }
}
