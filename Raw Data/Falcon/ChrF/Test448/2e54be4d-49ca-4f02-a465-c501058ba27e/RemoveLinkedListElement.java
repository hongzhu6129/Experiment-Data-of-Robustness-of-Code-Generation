import java.util.LinkedList;

public class RemoveLinkedListElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");
        linkedList.add("Mango");


        System.out.println("Original LinkedList: " + linkedList);

        // Element to remove
        String elementToRemove = "Orange";

        // Remove the element (first occurrence)
        boolean removed = linkedList.remove(elementToRemove); 

        if (removed) {
            System.out.println("LinkedList after removing '" + elementToRemove + "': " + linkedList);
        } else {
            System.out.println("'" + elementToRemove + "' not found in the LinkedList.");
        }



        // Example using removeFirstOccurrence() for clarity (though remove() does the same for Strings)
        linkedList.add("Orange"); // Add it back for the next example

        System.out.println("\nLinkedList (added Orange back): " + linkedList);


        boolean removedFirst = linkedList.removeFirstOccurrence("Orange");
        if (removedFirst) {
            System.out.println("LinkedList after removing first occurrence of 'Orange': " + linkedList);
        }

        // Example removing by index
        int indexToRemove = 1; // Remove "Banana" which is now at index 1
        String removedElement = linkedList.remove(indexToRemove);

        System.out.println("\nLinkedList after removing element at index " + indexToRemove + " ('" + removedElement + "'): " + linkedList);



        // Removing all occurrences of an element
        linkedList.add("Grape"); // Add Grape back for this demo
        linkedList.add("Grape");


        System.out.println("\nLinkedList (added Grapes back): " + linkedList);

        while (linkedList.remove("Grape")) {
            // Keep removing until none are left
        }

        System.out.println("LinkedList after removing all 'Grape' elements: " + linkedList);

    }
}
