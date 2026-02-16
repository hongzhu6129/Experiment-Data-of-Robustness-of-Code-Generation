import java.util.LinkedList;
import java.util.List;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList
        List<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert
        String elementToInsert = "Grape";

        // Position to insert (0-based index)
        int insertionIndex = 1;

        // Check for valid insertion index
        if (insertionIndex >= 0 && insertionIndex <= linkedList.size()) {
            linkedList.add(insertionIndex, elementToInsert); // Insert the element
            System.out.println("LinkedList after insertion: " + linkedList);
        } else {
            System.out.println("Invalid insertion index.");
        }



        //Example with Integer LinkedList

        List<Integer> intLinkedList = new LinkedList<>();
        intLinkedList.add(10);
        intLinkedList.add(20);
        intLinkedList.add(30);

        int intToInsert = 15;
        int intInsertionIndex = 1;

        if(intInsertionIndex >= 0 && intInsertionIndex <= intLinkedList.size()) {
            intLinkedList.add(intInsertionIndex, intToInsert);
            System.out.println("Integer LinkedList after insertion: "+ intLinkedList);
        } else {
            System.out.println("Invalid insertion index.");
        }


    }
}
