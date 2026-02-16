import java.util.LinkedList;

public class RetrieveLastElementLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");


        if (!linkedList.isEmpty()) {
            String lastElement = linkedList.peekLast(); // Retrieve the last element
            System.out.println("Last element: " + lastElement);

             //Alternatively, you can also use getLast() which throws NoSuchElementException if the list is empty
             // String lastElement = linkedList.getLast(); // Retrieve the last element
             //System.out.println("Last element: " + lastElement);

        } else {
            System.out.println("The LinkedList is empty.");
        }



        // Demonstrate that the last element is *not* removed
        System.out.println("LinkedList after retrieval: " + linkedList);
    }
}
