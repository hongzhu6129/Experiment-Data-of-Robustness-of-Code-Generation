import java.util.LinkedList;

public class RemoveFirstLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");


        if (!linkedList.isEmpty()) {
            String removedElement = linkedList.removeFirst(); // Remove and return the first element

            System.out.println("Removed element: " + removedElement);
            System.out.println("Updated LinkedList: " + linkedList);

        } else {
            System.out.println("LinkedList is empty. Cannot remove an element.");
        }

         // Example with an Integer LinkedList
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        intLinkedList.add(10);
        intLinkedList.add(20);
        intLinkedList.add(30);

        if (!intLinkedList.isEmpty()) {
            Integer removedInt = intLinkedList.removeFirst();
            System.out.println("Removed element (Integer): " + removedInt);
            System.out.println("Updated Integer LinkedList: " + intLinkedList);
        } else {
            System.out.println("Integer LinkedList is empty. Cannot remove an element.");

        }
    }
}
