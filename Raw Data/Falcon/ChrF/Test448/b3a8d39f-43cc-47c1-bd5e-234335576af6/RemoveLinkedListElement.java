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

        // Remove the specified element 
        boolean removed = linkedList.remove(elementToRemove); 

        if (removed) {
            System.out.println("LinkedList after removing " + elementToRemove + ": " + linkedList);
        } else {
            System.out.println(elementToRemove + " not found in the LinkedList.");
        }


        // Example using remove(index) - demonstrating removing by index if needed
        int indexToRemove = 1; // Remove the element at index 1 (Banana after removing Orange)


        try {
             String removedByIndex = linkedList.remove(indexToRemove);
            System.out.println("LinkedList after removing element at index " + indexToRemove + ": " + linkedList);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + indexToRemove);
        }

        // Example: removing a non-existent element
         elementToRemove = "Pineapple";
         removed = linkedList.remove(elementToRemove); // Returns false if not found

        if (removed) {
            System.out.println("LinkedList after removing " + elementToRemove + ": " + linkedList);
        } else {
            System.out.println(elementToRemove + " not found in the LinkedList.");
        }

    }
}
