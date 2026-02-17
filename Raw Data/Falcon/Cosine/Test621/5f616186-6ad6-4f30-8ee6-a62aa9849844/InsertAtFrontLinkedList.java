import java.util.LinkedList;

public class InsertAtFrontLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some initial elements (optional)
        linkedList.add("element1");
        linkedList.add("element2");
        linkedList.add("element3");

        // Element to insert at the front
        String newElement = "newElement";

        // Insert the new element at the front using addFirst()
        linkedList.addFirst(newElement);

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);


        //Example with Integers
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);

        int newNumber = 5;
        numbers.addFirst(newNumber);

        System.out.println("Updated LinkedList of Integers: " + numbers);
    }
}
