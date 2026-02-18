import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Insert at the beginning (first position)
        linkedList.addFirst("Apple"); 
        linkedList.addFirst("Banana");

        // Insert at the end (last position)
        linkedList.addLast("Orange");
        linkedList.addLast("Grape");


        // Print the LinkedList
        System.out.println(linkedList); // Output: [Banana, Apple, Orange, Grape]

        // More Examples: Inserting integers
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.addFirst(10);
        numberList.addLast(20);
        numberList.addFirst(5);
        System.out.println(numberList); // Output: [5, 10, 20]


    }
}
