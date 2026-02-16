import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Insert at the beginning (first position)
        linkedList.addFirst("Apple"); 
        linkedList.addFirst("Banana");

        // Insert at the end (last position)
        linkedList.addLast("Orange");
        linkedList.addLast("Grape");

        // Print the LinkedList
        System.out.println(linkedList); 
    }
}
