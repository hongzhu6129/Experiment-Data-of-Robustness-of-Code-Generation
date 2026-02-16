import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPositions {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Elderberry");


        // Method 1: Using a ListIterator (Recommended for LinkedLists)
        System.out.println("Method 1: Using ListIterator");
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            int index = iterator.nextIndex();
            String element = iterator.next();
            System.out.println("Element at index " + index + ": " + element);
        }


        // Method 2: Using a for loop with get() (Less efficient for LinkedLists)
        System.out.println("\nMethod 2: Using for loop with get()");
        for (int i = 0; i < linkedList.size(); i++) {
            String element = linkedList.get(i); //  get() is less efficient in LinkedList
            System.out.println("Element at index " + i + ": " + element);
        }


        //Method 3: Using forEach loop with a counter (less efficient than ListIterator)
        System.out.println("\nMethod 3: Using forEach loop with a counter");
        int index = 0; // Initialize the index counter
        for (String element : linkedList) {
            System.out.println("Element at index " + index + ": " + element);
            index++; // Increment the index
        }
    }
}
