import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        // Method 1: Using a for-each loop (enhanced for loop) - Simplest
        System.out.println("Using for-each loop:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Method 2: Using a while loop and an iterator
        System.out.println("\nUsing while loop and iterator:");
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // Method 3: Using a for loop and an iterator (less common)
        System.out.println("\nUsing for loop and iterator:");
        for (ListIterator<String> it = linkedList.listIterator(); it.hasNext(); ) {
            String fruit = it.next();
            System.out.println(fruit);
        }


        // Method 4: Using a while loop and get() method (less efficient) - not recommended for LinkedLists
        System.out.println("\nUsing while loop and get() method:");
        int i = 0;
        while (i < linkedList.size()) {
            String fruit = linkedList.get(i); // Less efficient for LinkedList
            System.out.println(fruit);
            i++;
        }


        //Method 5: Java 8+ Stream API (for processing elements)
        System.out.println("\nUsing Java 8 Stream API:");
        linkedList.stream().forEach(System.out::println);



    }
}
