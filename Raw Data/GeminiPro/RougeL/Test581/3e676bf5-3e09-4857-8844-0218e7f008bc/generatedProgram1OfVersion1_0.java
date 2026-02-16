import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Insert at the beginning (first position)
        linkedList.addFirst("First");

        // Insert some elements
        linkedList.add("Second");
        linkedList.add("Third");

        // Insert at the end (last position)
        linkedList.addLast("Last");

        // Print the LinkedList
        System.out.println(linkedList); 


        // Example with integer LinkedList
        LinkedList<Integer> intLinkedList = new LinkedList<>();
        intLinkedList.addFirst(10);  // Insert at the beginning
        intLinkedList.add(20);
        intLinkedList.add(30);
        intLinkedList.addLast(40); // Insert at the end

        System.out.println(intLinkedList);



        // Example showing how to handle an initially empty list:
        LinkedList<Double> emptyList = new LinkedList<>();

        // Safe insertion even if the list is initially empty
        emptyList.addFirst(1.1); // This works even if the list is empty
        emptyList.addLast(2.2);

        System.out.println(emptyList);


    }
}
