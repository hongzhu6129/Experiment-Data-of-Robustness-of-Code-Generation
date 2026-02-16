import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPositions {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        // Display elements and their positions using a ListIterator
        System.out.println("Elements and their positions in the LinkedList:");
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            int index = iterator.nextIndex();  // Get the index before moving to the next element
            String element = iterator.next();
            System.out.println("Position " + index + ": " + element);
        }


         //Alternative using a for loop and get()
         System.out.println("\nAlternative using for loop and get():");
        for (int i = 0; i < linkedList.size(); i++) {
            String element = linkedList.get(i);
            System.out.println("Position " + i + ": " + element);
        }
    }
}
