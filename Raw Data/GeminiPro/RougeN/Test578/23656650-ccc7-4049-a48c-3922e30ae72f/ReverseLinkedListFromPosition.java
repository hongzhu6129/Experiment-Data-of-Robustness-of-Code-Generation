import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedListFromPosition {

    public static void main(String[] args) {
        // Example usage:
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int position = 2; // Reverse starting from the 3rd element (index 2)

        reverseFromPosition(list, position);

        System.out.println("Reversed list: " + list); 
    }

    public static void reverseFromPosition(LinkedList<Integer> list, int position) {
        if (position < 0 || position >= list.size()) {
            System.out.println("Invalid position.");
            return;  // Or throw an exception if appropriate for your use case
        }


        ListIterator<Integer> forwardIterator = list.listIterator(position);
        ListIterator<Integer> reverseIterator = list.listIterator(list.size());

        // Iterate and swap elements until the forward iterator reaches the end or crosses the reverse iterator
        while(forwardIterator.hasNext() && reverseIterator.hasPrevious() && forwardIterator.nextIndex() < reverseIterator.previousIndex()) {
            Integer temp = forwardIterator.next();
            forwardIterator.set(reverseIterator.previous());
            reverseIterator.set(temp);
        }

    }
}
