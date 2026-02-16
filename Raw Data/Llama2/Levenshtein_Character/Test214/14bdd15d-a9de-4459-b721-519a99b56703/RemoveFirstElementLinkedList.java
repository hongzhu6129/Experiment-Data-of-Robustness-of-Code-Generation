import java.util.LinkedList;

public class RemoveFirstElementLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        // Print the original LinkedList
        System.out.println("Original LinkedList: " + linkedList);

        // Remove and return the first element (if the list is not empty)
        if (!linkedList.isEmpty()) {
            String removedElement = linkedList.removeFirst(); // or linkedList.pollFirst() which returns null if empty
            System.out.println("Removed element: " + removedElement);
            System.out.println("Updated LinkedList: " + linkedList);
        } else {
            System.out.println("LinkedList is empty. Cannot remove an element.");
        }


        // Example demonstrating pollFirst() on an empty list:
        LinkedList<String> emptyList = new LinkedList<>();
        String removedFromEmpty = emptyList.pollFirst(); 
        System.out.println("Removed from empty list (should be null): " + removedFromEmpty);

    }
}
