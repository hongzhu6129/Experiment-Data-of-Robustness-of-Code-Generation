import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Insert elements at the beginning (first position)
        linkedList.addFirst("Apple");
        linkedList.addFirst("Banana");

        // Insert elements at the end (last position)
        linkedList.addLast("Orange");
        linkedList.addLast("Grape");


        // Print the LinkedList
        System.out.println(linkedList); // Output: [Banana, Apple, Orange, Grape]


        //Another example with integers

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.addFirst(10);
        numbers.addLast(20);
        numbers.addFirst(5);
        numbers.addLast(30);

        System.out.println(numbers); //Output: [5, 10, 20, 30]
    }
}
