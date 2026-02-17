import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grape");

        System.out.println("Original LinkedList: " + linkedList);

        // Method 1: Using a descending iterator (ListIterator)
        System.out.print("Reversed LinkedList (using ListIterator): ");
        ListIterator<String> iterator = linkedList.listIterator(linkedList.size()); // Start from the end
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();


        // Method 2: Using Java 8 streams and Collections.reverse() (modifies the original list)
        LinkedList<String> reversedList = new LinkedList<>(linkedList); // Create a copy to avoid modifying the original
        // java.util.Collections.reverse(reversedList); // This modifies the original list
        // System.out.println("Reversed LinkedList (using Collections.reverse()): " + reversedList);

        // Method 3: Using a for loop and get() in reverse order (less efficient)
        System.out.print("Reversed LinkedList (using for loop): ");
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();



         //Method 4 using forEach loop (requires creating a new LinkedList - demonstrated in Method 2)
//          LinkedList<String> reversedList = new LinkedList<>(linkedList); // Create a copy to avoid modifying the original
//          java.util.Collections.reverse(reversedList);
//          System.out.print("Reversed LinkedList (using forEach loop): ");
//          reversedList.forEach(item -> System.out.print(item+ " "));
//          System.out.println(); 



    }
}
