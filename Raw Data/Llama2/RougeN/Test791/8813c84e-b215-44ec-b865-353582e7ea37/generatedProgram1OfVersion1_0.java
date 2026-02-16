import java.util.LinkedList;

public class RemoveFirstElementLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        System.out.println("Original LinkedList: " + linkedList);

        // Remove and return the first element
        String removedElement = removeFirst(linkedList);


        if (removedElement != null) {
            System.out.println("Removed element: " + removedElement);
            System.out.println("Updated LinkedList: " + linkedList);
        } else {
            System.out.println("LinkedList is empty. Nothing to remove.");
        }


        // Example with an empty list:
        LinkedList<Integer> emptyList = new LinkedList<>();
        Integer removedFromEmpty = removeFirst(emptyList);

        if (removedFromEmpty != null) {
            System.out.println("Removed element: " + removedFromEmpty); // This won't be printed
        } else {
            System.out.println("LinkedList is empty. Nothing to remove.");
        }


    }



    private static <T> T removeFirst(LinkedList<T> list) {
        if (list.isEmpty()) {
            return null; // Or throw an exception if preferred
        }
        return list.removeFirst(); // LinkedList's built-in method
    }
}
