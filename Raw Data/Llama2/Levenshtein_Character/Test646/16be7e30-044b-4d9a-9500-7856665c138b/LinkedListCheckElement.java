import java.util.LinkedList;

public class LinkedListCheckElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);


        // Element to search for
        int elementToFind = 3;

        // Check if the element exists using contains()
        if (linkedList.contains(elementToFind)) {
            System.out.println(elementToFind + " exists in the linked list.");
        } else {
            System.out.println(elementToFind + " does not exist in the linked list.");
        }


         // Example with a different element
        elementToFind = 6; // This element is not in the list

        if (linkedList.contains(elementToFind)) {
            System.out.println(elementToFind + " exists in the linked list.");
        } else {
            System.out.println(elementToFind + " does not exist in the linked list.");
        }



        // Example with Strings (Illustrative - adapt type as needed)
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("apple");
        stringLinkedList.add("banana");
        stringLinkedList.add("orange");


        String stringToFind = "banana";
        if (stringLinkedList.contains(stringToFind)) {
            System.out.println(stringToFind + " exists in the linked list.");
        } else {
            System.out.println(stringToFind + " does not exist in the linked list.");
        }
    }
}
