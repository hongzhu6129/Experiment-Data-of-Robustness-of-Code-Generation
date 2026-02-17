import java.util.LinkedList;

public class InsertAtFrontLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements (optional)
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Element to insert at the front
        String elementToInsert = "Grape";

        // Insert at the front using addFirst()
        linkedList.addFirst(elementToInsert);


        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList); 
    }
}
