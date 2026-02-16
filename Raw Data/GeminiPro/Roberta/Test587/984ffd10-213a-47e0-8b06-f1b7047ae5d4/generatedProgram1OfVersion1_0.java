import java.util.LinkedList;

public class RemoveFromLinkedList {

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
            System.out.println("LinkedList after removing '" + elementToRemove + "': " + linkedList);
        } else {
            System.out.println("'" + elementToRemove + "' not found in the LinkedList.");
        }


        // Example removing by index (alternative approach)
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Red");
        linkedList2.add("Green");
        linkedList2.add("Blue");
        linkedList2.add("Yellow");

        System.out.println("\nOriginal LinkedList2: " + linkedList2);

        int indexToRemove = 1; // Remove element at index 1 (Green)

        try {
            String removedElement = linkedList2.remove(indexToRemove);
            System.out.println("LinkedList2 after removing element at index " + indexToRemove + ": " + linkedList2);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index.  No element removed.");
        }




        // Removing the first occurrence of a duplicate (if the list *might* contain duplicates)
        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("Red");
        linkedList3.add("Green");
        linkedList3.add("Blue");
        linkedList3.add("Green"); // Duplicate
        linkedList3.add("Yellow");

        System.out.println("\nOriginal LinkedList3: " + linkedList3);

        String elementToRemove3 = "Green";

        if (linkedList3.removeFirstOccurrence(elementToRemove3)) {  // Use removeFirstOccurrence()
             System.out.println("LinkedList3 after removing first occurrence of '" + elementToRemove3 + "': " + linkedList3);
        } else {
            System.out.println("'" + elementToRemove3 + "' not found in LinkedList3.");
        }


    }
}
