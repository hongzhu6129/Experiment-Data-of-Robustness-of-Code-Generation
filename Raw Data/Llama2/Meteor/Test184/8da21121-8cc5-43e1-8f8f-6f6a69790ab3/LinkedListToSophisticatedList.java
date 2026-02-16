import java.util.LinkedList;
import java.util.List;

public class LinkedListToSophisticatedList {

    public static void main(String[] args) {
        // Example usage:
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");

        List<String> sophisticatedList = convertLinkedListToSophisticatedList(linkedList);

        System.out.println("Linked List: " + linkedList);
        System.out.println("Sophisticated List (ArrayList): " + sophisticatedList);


        //Another example with Integers
        LinkedList<Integer> linkedListInt = new LinkedList<>();
        linkedListInt.add(1);
        linkedListInt.add(2);
        linkedListInt.add(3);

        List<Integer> sophisticatedListInt = convertLinkedListToSophisticatedList(linkedListInt);

        System.out.println("Linked List (Integer): " + linkedListInt);
        System.out.println("Sophisticated List (ArrayList - Integer): " + sophisticatedListInt);


    }

    // Generic method to convert a LinkedList to a List (e.g., ArrayList).  This makes the code more reusable.
    public static <T> List<T> convertLinkedListToSophisticatedList(LinkedList<T> linkedList) {
        // Create an ArrayList (or any other List implementation)
        List<T> sophisticatedList = new java.util.ArrayList<>(linkedList); // Efficient way to copy elements
        return sophisticatedList;

        //Alternatively, if you NEED a new list and don't want to copy:
        // List<T> sophisticatedList = new java.util.ArrayList<>();
        // for (T item : linkedList) {
        //     sophisticatedList.add(item); 
        // }
        // return sophisticatedList;
    }
}

