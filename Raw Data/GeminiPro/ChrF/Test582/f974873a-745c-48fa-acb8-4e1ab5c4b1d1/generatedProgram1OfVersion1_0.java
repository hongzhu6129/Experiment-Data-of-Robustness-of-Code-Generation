import java.util.LinkedList;

public class InsertAtFrontLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements (optional)
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        System.out.println("Original LinkedList: " + linkedList);

        // Element to insert at the front
        String elementToInsert = "Mango";

        // Insert the element at the front using addFirst()
        linkedList.addFirst(elementToInsert);

        System.out.println("LinkedList after insertion: " + linkedList);


        // Example with an Integer LinkedList
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        intLinkedList.add(2);
        intLinkedList.add(4);
        intLinkedList.add(6);

        System.out.println("Original Integer LinkedList: " + intLinkedList);

        int numToInsert = 1;
        intLinkedList.addFirst(numToInsert);

        System.out.println("Integer LinkedList after insertion: " + intLinkedList);
    }
}
