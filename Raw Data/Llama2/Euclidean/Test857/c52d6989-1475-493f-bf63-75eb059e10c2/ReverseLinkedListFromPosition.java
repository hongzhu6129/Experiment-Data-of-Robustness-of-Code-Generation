import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedListFromPosition {

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        int startPosition = 2; // Start reversing from the 3rd element (index 2)

        reverseFromPosition(linkedList, startPosition);

        System.out.println("Reversed LinkedList: " + linkedList);
    }

    private static <T> void reverseFromPosition(LinkedList<T> list, int startPosition) {
        if (startPosition < 0 || startPosition >= list.size()) {
            throw new IllegalArgumentException("Invalid start position.");
        }


        ListIterator<T> forwardIterator = list.listIterator(startPosition);
        ListIterator<T> reverseIterator = list.listIterator(list.size());


        // Iterate and swap elements using the iterators
        for (int i = 0; i < (list.size() - startPosition) / 2; i++) {
            T forwardElement = forwardIterator.next();  // Move forward iterator to the next
            T reverseElement = reverseIterator.previous(); // Move reverse iterator backwards


            // Efficiently swap the elements within the LinkedList.
            forwardIterator.set(reverseElement);   //Replace forward element with the reverse one
            reverseIterator.set(forwardElement);  // Replace backward element with the forward one

        }
    }
}

