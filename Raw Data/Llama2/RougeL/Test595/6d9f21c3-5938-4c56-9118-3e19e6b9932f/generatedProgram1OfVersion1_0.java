import java.util.LinkedList;

public class InsertAtEndLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert at the end
        String elementToInsert = "Grape";

        // Insert the element at the end
        linkedList.addLast(elementToInsert); // or linkedList.offerLast(elementToInsert);


        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList); 
    }
}
