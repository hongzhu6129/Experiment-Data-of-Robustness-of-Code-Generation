import java.util.LinkedList;
import java.util.ListIterator;

public class ReplaceLinkedListElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        System.out.println("Original LinkedList: " + linkedList);

        // Replace an element using set() method by index.
        int indexToReplace = 1; // Replace the element at index 1 (Banana)
        String newValue = "Mango";
        if (indexToReplace >= 0 && indexToReplace < linkedList.size()) {
            linkedList.set(indexToReplace, newValue);
            System.out.println("LinkedList after replacing element at index " + indexToReplace + ": " + linkedList);
        } else {
            System.out.println("Invalid index for replacement.");
        }


        // Replace an element using ListIterator

        // Reset the LinkedList (for demonstration)
        linkedList.set(1, "Banana");


        String elementToReplace = "Orange";
        String newElement = "Peach";

        ListIterator<String> iterator = linkedList.listIterator();

        while (iterator.hasNext()) {
            String currentElement = iterator.next();
            if (currentElement.equals(elementToReplace)) {
                iterator.set(newElement);
                break;  // Stop after the first occurrence is replaced (if you want to replace all occurrences, remove this break)
            }
        }
        System.out.println("LinkedList after replacing '" + elementToReplace + "' with '" + newElement + "': " + linkedList);


        //Example: Replacing all occurrences:

         // Reset the LinkedList (for demonstration)
        linkedList.set(2, "Orange"); // Put Orange back


        iterator = linkedList.listIterator(); // Get a new iterator

        while (iterator.hasNext()) {
            String currentElement = iterator.next();
            if (currentElement.equals(elementToReplace)) { // This will replace *all* Orange occurrences
                iterator.set(newElement);
            }
        }
        System.out.println("LinkedList after replacing *all* occurrences of '" + elementToReplace + "' with '" + newElement + "': " + linkedList);
    }
}
