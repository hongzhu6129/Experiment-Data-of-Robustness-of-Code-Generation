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
        linkedList.addLast("Grape"); // Grape will be at the end

        // Print the LinkedList to verify the insertions
        System.out.println(linkedList);  // Output: [Banana, Apple, Orange, Grape]


        // Another example with integers
        LinkedList<Integer> numberList = new LinkedList<>();

        numberList.addFirst(10);
        numberList.addLast(20);
        numberList.addFirst(5);  // 5 is inserted at the beginning
        numberList.addLast(30); // 30 is inserted at the end

        System.out.println(numberList); // Output: [5, 10, 20, 30]


        // Demonstrating offerFirst() and offerLast() � these are equivalent to addFirst() and addLast()
        LinkedList<Character> charList = new LinkedList<>();
        charList.offerFirst('A');
        charList.offerLast('Z');
        System.out.println(charList); // Output: [A, Z]


        // push(): Inserts at the beginning (same as addFirst())
        LinkedList<Double> doubleList = new LinkedList<>();
        doubleList.push(1.1);
        doubleList.push(2.2); // 2.2 inserted at the beginning
        System.out.println(doubleList); // Output: [2.2, 1.1]


    }
}
