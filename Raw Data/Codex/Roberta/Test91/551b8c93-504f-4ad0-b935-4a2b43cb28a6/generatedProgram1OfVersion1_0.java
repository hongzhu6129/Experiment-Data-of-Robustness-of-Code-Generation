import java.util.LinkedList;

public class LinkedListInsertAtEnd {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Element to insert at the end
        String newElement = "Mango";

        // Insert the element at the end
        linkedList.addLast(newElement); // or linkedList.add(newElement);  Both work for adding at the end

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


        // Example with integers:
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int newNumber = 4;
        numbers.addLast(newNumber); // Or numbers.add(newNumber);

        System.out.println("Updated LinkedList of numbers: " + numbers);

    }
}
