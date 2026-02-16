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
         if (linkedList.remove(elementToRemove)) { // remove() returns true if successful
            System.out.println("LinkedList after removing '" + elementToRemove + "': " + linkedList);
        } else {
            System.out.println("'" + elementToRemove + "' not found in the LinkedList.");
        }



        // Example removing by index:
        linkedList.add("Orange"); // Re-add for demonstration
        int indexToRemove = 2; //Remove the element at index 2 (which is now the first "Orange")

         try { // Use try-catch for potential IndexOutOfBoundsException
             String removedElement = linkedList.remove(indexToRemove);  //remove() also works with index
            System.out.println("LinkedList after removing element at index " + indexToRemove + ": " + linkedList);
            System.out.println("Removed element: " + removedElement); 
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + indexToRemove);
        }


    }
}
