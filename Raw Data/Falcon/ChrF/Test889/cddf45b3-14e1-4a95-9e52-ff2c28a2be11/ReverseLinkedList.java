import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");

        System.out.println("Original LinkedList: " + linkedList);


        // Method 1: Using a descendingIterator() (Most efficient for LinkedList)
        System.out.print("Reversed LinkedList (using descendingIterator): ");
        Iterator<String> descendingIterator = linkedList.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();


        // Method 2: Using for loop with List's size() (Suitable for any List)
        System.out.print("Reversed LinkedList (using size()): ");
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();


        // Method 3:  Add to a new list in reverse (creates a new list)
        LinkedList<String> reversedList = new LinkedList<>();
        for (String item : linkedList) {
            reversedList.add(0, item); // Add at the beginning
        }
        System.out.println("Reversed LinkedList (new list): " + reversedList);



    }
}
