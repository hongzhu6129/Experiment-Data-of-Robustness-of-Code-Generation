import java.util.LinkedList;

public class RemoveLinkedListElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");
        linkedList.add("Mango");

        // Element to remove
        String elementToRemove = "Orange";

        System.out.println("Original LinkedList: " + linkedList);

        // Remove the specified element
        boolean removed = linkedList.remove(elementToRemove); 

        if (removed) {
            System.out.println("LinkedList after removing " + elementToRemove + ": " + linkedList);
        } else {
            System.out.println(elementToRemove + " not found in the LinkedList.");
        }



        // Example of removing by index:
        int indexToRemove = 1; // Remove the element at index 1 (Banana after removing Orange)

        if (indexToRemove >= 0 && indexToRemove < linkedList.size()) {
            String removedByIndex = linkedList.remove(indexToRemove);
            System.out.println("LinkedList after removing element at index " + indexToRemove + ": " + linkedList);

        } else {
            System.out.println("Invalid index.");
        }

    }
}
