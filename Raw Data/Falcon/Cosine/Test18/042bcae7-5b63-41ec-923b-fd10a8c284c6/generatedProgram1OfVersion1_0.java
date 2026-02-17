import java.util.LinkedList;

public class ReplaceElementLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        System.out.println("Original LinkedList: " + linkedList);

        // Replace an element at a specific index
        int indexToReplace = 1; // Replace the element at index 1 (Banana)
        String newElement = "Mango";

        if (indexToReplace >= 0 && indexToReplace < linkedList.size()) {
            linkedList.set(indexToReplace, newElement);
            System.out.println("LinkedList after replacing element at index " + indexToReplace + ": " + linkedList);
        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (linkedList.size() - 1));
        }



        // Replace a specific element with another element (first occurrence)
        String elementToReplace = "Orange";
        String replacementElement = "Peach";

        if (linkedList.contains(elementToReplace)) {
            int index = linkedList.indexOf(elementToReplace); // Find the index of the first occurrence
            linkedList.set(index, replacementElement); 
            System.out.println("LinkedList after replacing '" + elementToReplace + "' with '" + replacementElement + "': " + linkedList);
        } else {
            System.out.println("Element '" + elementToReplace + "' not found in the LinkedList.");
        }



         //Example replacing all occurrences of an element:
        String elementToReplaceAll = "Apple"; // Element to replace (if it exists multiple times)
        String replacementForAll = "Kiwi";

        while (linkedList.contains(elementToReplaceAll)) {
           int indexAll = linkedList.indexOf(elementToReplaceAll);
           linkedList.set(indexAll, replacementForAll);
        }

        System.out.println("LinkedList after replacing all occurrences of '" + elementToReplaceAll + "': " + linkedList);




    }
}
