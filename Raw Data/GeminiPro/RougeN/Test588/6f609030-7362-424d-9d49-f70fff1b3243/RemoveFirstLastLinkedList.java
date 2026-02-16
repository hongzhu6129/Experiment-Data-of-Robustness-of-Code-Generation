import java.util.LinkedList;

public class RemoveFirstLastLinkedList {

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");
        linkedList.add("date");
        linkedList.add("elderberry");


        System.out.println("Original LinkedList: " + linkedList);

        // Remove the first and last elements IF the list has at least 2 elements
        if (linkedList.size() >= 2) {
            linkedList.removeFirst(); // Remove the first element
            linkedList.removeLast();  // Remove the last element
        } else if (linkedList.size() == 1) {
            // Handle the case where there's only one element;  remove it to make the list empty.  (Alternative:  could just leave it.)
            linkedList.removeFirst();
        } // Else: if the list is already empty, there's nothing to do.



        System.out.println("Modified LinkedList: " + linkedList);

        // Additional example with an initially empty list:
        LinkedList<Integer> emptyList = new LinkedList<>();
        System.out.println("Initially Empty List: " + emptyList);
        // Trying to remove from an empty list does nothing (no exception):
        emptyList.removeFirst(); 
        emptyList.removeLast();
        System.out.println("After attempting removal from empty list: " + emptyList);


        // Additional example with a single-element list:
        LinkedList<Double> singleElementList = new LinkedList<>();
        singleElementList.add(3.14);
        System.out.println("Single Element List: " + singleElementList);
        if (singleElementList.size() >= 2) {
            singleElementList.removeFirst();
            singleElementList.removeLast();
        } else if (singleElementList.size() == 1) {
            singleElementList.removeFirst();
        }
        System.out.println("Single Element List after removal: " + singleElementList);
    }
}
