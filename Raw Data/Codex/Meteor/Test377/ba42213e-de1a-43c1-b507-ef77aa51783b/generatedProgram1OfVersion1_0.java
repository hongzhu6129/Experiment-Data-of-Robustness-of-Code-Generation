import java.util.LinkedList;
import java.util.Iterator;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Method 1: Using a descending iterator
        System.out.println("Using descending iterator:");
        Iterator<String> descendingIterator = names.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }


        // Method 2: Using a for loop and list size (less efficient)
        System.out.println("\nUsing for loop and size:");
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
    }
}
