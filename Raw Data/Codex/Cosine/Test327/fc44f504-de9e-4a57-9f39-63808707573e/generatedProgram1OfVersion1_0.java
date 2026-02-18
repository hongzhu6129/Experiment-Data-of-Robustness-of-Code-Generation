import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Insert at the beginning (head/took)
        linkedList.addFirst("Apple");  // Or: linkedList.push("Apple"); for stack-like behavior
        linkedList.addFirst("Banana");

        // Insert at the end (tail/last)
        linkedList.addLast("Orange");
        linkedList.addLast("Grape");

        // Print the LinkedList
        System.out.println(linkedList); // Output: [Banana, Apple, Orange, Grape]

        // Example using offerFirst and offerLast (similar to addFirst and addLast but return booleans indicating success or failure)
        linkedList.offerFirst("Mango");
        linkedList.offerLast("Kiwi");

        System.out.println(linkedList); // Output: [Mango, Banana, Apple, Orange, Grape, Kiwi]


        //  More examples demonstrating insertions at specific positions
         LinkedList<Integer> numbers = new LinkedList<>();
         numbers.add(10);
         numbers.add(20);
         numbers.add(30);

         // Insert at index 1 (second position)
         numbers.add(1, 15); // Shifts existing elements to the right
         System.out.println(numbers); // Output: [10, 15, 20, 30]


    }
}
