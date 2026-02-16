import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Insert at the beginning (first position)
        linkedList.addFirst("Apple");
        linkedList.addFirst("Banana"); // Banana will be at the beginning now

        // Insert at the end (last position)
        linkedList.addLast("Orange");
        linkedList.addLast("Grape");


        // Print the LinkedList to verify the insertions
        System.out.println(linkedList); // Output: [Banana, Apple, Orange, Grape]
    }
}
