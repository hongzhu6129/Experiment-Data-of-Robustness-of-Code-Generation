import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Insert at the beginning (first position)
        linkedList.addFirst("Apple");  // LinkedList: [Apple]
        linkedList.addFirst("Banana"); // LinkedList: [Banana, Apple]

        // Insert at the end (last position)
        linkedList.addLast("Orange");  // LinkedList: [Banana, Apple, Orange]
        linkedList.addLast("Grape");   // LinkedList: [Banana, Apple, Orange, Grape]


        // Print the LinkedList to verify the insertions
        System.out.println(linkedList); // Output: [Banana, Apple, Orange, Grape]


        // More examples:
        linkedList.addFirst("Mango");
        linkedList.addLast("Kiwi");

        System.out.println(linkedList); // Output: [Mango, Banana, Apple, Orange, Grape, Kiwi]

    }
}
