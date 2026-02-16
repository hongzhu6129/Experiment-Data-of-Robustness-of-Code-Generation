import java.util.LinkedList;

public class RemoveFirstLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements to the list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");

        // Print the original list
        System.out.println("Original LinkedList: " + linkedList);


        if (!linkedList.isEmpty()) {
            String removedElement = linkedList.removeFirst(); // Remove and return the first element

            // Print the removed element and the updated list
            System.out.println("Removed element: " + removedElement);
            System.out.println("Updated LinkedList: " + linkedList);
        } else {
            System.out.println("The LinkedList is empty. Nothing to remove.");
        }

         // Example with an Integer LinkedList
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        intLinkedList.add(1);
        intLinkedList.add(2);
        intLinkedList.add(3);

        System.out.println("\nInteger LinkedList example:");
        System.out.println("Original LinkedList: " + intLinkedList);

        if (!intLinkedList.isEmpty()) {
             Integer removedInt = intLinkedList.removeFirst();
             System.out.println("Removed element: " + removedInt);
             System.out.println("Updated LinkedList: " + intLinkedList);

        } else {
            System.out.println("The Integer LinkedList is empty. Nothing to remove.");
        }



    }
}
