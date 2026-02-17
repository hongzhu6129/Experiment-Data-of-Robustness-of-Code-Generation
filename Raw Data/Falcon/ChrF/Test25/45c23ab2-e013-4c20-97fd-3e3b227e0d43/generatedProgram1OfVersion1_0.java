import java.util.LinkedList;

public class AppendLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to append
        String elementToAppend = "Grape";

        // Append the element to the end of the linked list
        linkedList.add(elementToAppend); // LinkedList's add() method appends by default

        // Print the updated linked list
        System.out.println("Updated LinkedList: " + linkedList);


        // Example with integer LinkedList:
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int numberToAppend = 4;
        numbers.add(numberToAppend);

        System.out.println("Updated LinkedList of numbers: " + numbers);


        // Example demonstrating appending at a specific index (Not requested, but useful)
        LinkedList<Character> chars = new LinkedList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');

        char charToAppend = 'D';
        int indexToAppend = 1; // Append at index 1

        chars.add(indexToAppend, charToAppend); // Inserts at the index, shifting elements

        System.out.println("LinkedList with insertion: " + chars); // Output: [A, D, B, C]
    }
}
