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


        // Print the LinkedList to verify
        System.out.println(linkedList); // Output: [Banana, Apple, Orange, Grape]


        //More illustrative Examples
        LinkedList<Integer> numberList = new LinkedList<>();

        numberList.add(10);  // Adds 10 to the end initially
        numberList.addFirst(5);  // Inserts 5 at the beginning
        numberList.addLast(20); // Inserts 20 at the end
        numberList.addFirst(1);   // Inserts 1 at the beginning

        System.out.println(numberList); // Output: [1, 5, 10, 20]

    }
}
