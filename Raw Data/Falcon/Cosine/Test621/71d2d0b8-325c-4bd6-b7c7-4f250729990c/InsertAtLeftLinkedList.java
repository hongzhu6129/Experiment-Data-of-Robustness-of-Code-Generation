import java.util.LinkedList;

public class InsertAtLeftLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert at the left
        String elementToInsert = "Grape";

        // Insert at the left (beginning) of the LinkedList
        linkedList.addFirst(elementToInsert); // OR linkedList.push(elementToInsert); push also inserts at the beginning

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList); 
    }
}
