import java.util.LinkedList;

public class RemoveAllLinkedList {

    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add some elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        System.out.println("Original LinkedList: " + linkedList);

        // Method 1: Using clear()
        linkedList.clear(); 

        System.out.println("LinkedList after clear(): " + linkedList);


        //  Demonstrating another way to empty a linked list (re-initialize)
        // Add elements again for demonstration
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        System.out.println("LinkedList with elements again: " + linkedList);


        // Method 2: Re-initializing the LinkedList (creates a new empty list)
        linkedList = new LinkedList<>(); // This effectively discards the old list

        System.out.println("LinkedList after re-initialization: " + linkedList);

    }
}
