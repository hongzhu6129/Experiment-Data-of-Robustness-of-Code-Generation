import java.util.LinkedList;

public class LinkedListInsertAtEnd {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Element to insert at the end
        String newElement = "Date";

        // Insert the new element at the end using add() or addLast() (they are equivalent)
        linkedList.add(newElement); // Or linkedList.addLast(newElement);

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


        // Example with Integers
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int newNumber = 40;
        numbers.addLast(newNumber);  // Using addLast() for clarity
        System.out.println("Updated LinkedList of numbers: " + numbers);
    }
}
