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
        boolean removed = linkedList.remove(elementToRemove); // Removes the first occurrence

        if (removed) {
            System.out.println("LinkedList after removing '" + elementToRemove + "': " + linkedList);
        } else {
            System.out.println(elementToRemove + " not found in the LinkedList.");
        }


        // Example removing by index:
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Apple");
        linkedList2.add("Banana");
        linkedList2.add("Orange");
        linkedList2.add("Grape");
        linkedList2.add("Mango");

        System.out.println("\nOriginal LinkedList2: " + linkedList2);
        int indexToRemove = 1; // Remove element at index 1 (Banana)

        try {
            String removedElement = linkedList2.remove(indexToRemove);
            System.out.println("LinkedList2 after removing element at index " + indexToRemove + ": " + linkedList2);
            System.out.println("Removed element: " + removedElement);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + indexToRemove);
        }


        //Example: Remove all occurrences of a specific element

        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("Apple");
        linkedList3.add("Banana");
        linkedList3.add("Orange");
        linkedList3.add("Banana"); // Duplicate
        linkedList3.add("Grape");


        System.out.println("\nOriginal LinkedList3: " + linkedList3);
        String elementToRemoveAll = "Banana";

        while (linkedList3.remove(elementToRemoveAll)) {
            // Keep removing until no more occurrences are found
        }


        System.out.println("LinkedList3 after removing all '" + elementToRemoveAll + "' occurrences: " + linkedList3);
    }
}
