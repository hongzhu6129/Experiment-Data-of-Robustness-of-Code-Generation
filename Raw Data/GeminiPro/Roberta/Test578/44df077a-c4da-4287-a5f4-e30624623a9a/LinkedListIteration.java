import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");
        linkedList.add("Mango");

        // Specify the starting position (e.g., index 2)
        int startPosition = 2;

        // Iterate through the LinkedList from the specified position
        if (startPosition >= 0 && startPosition < linkedList.size()) {
            ListIterator<String> iterator = linkedList.listIterator(startPosition);

            System.out.println("Iterating from position " + startPosition + ":");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } else {
            System.out.println("Invalid start position.");
        }



         // Example with an empty LinkedList
        LinkedList<Integer> emptyList = new LinkedList<>();
        int emptyListStartPosition = 0;

        if (emptyListStartPosition >= 0 && emptyListStartPosition < emptyList.size()) {
            ListIterator<Integer> emptyListIterator = emptyList.listIterator(emptyListStartPosition);
            while (emptyListIterator.hasNext()) {
                System.out.println(emptyListIterator.next());
            }
        } else {
            System.out.println("Invalid start position for empty list."); // This will be printed
        }



        // Example with a start position beyond the list size:
        LinkedList<Double> list = new LinkedList<>();
        list.add(1.1);
        list.add(2.2);

        int invalidStartPosition = 5; // Beyond the list size

        if (invalidStartPosition >= 0 && invalidStartPosition < list.size()) {
            ListIterator<Double> listIterator = list.listIterator(invalidStartPosition);
            while (listIterator.hasNext()) {
                System.out.println(listIterator.next()); 
            }
        } else {
            System.out.println("Invalid start position."); // This will be printed
        }
    }
}
