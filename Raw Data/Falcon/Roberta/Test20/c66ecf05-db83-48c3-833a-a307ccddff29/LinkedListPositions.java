import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPositions {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> books = new LinkedList<>();

        // Add some elements
        books.add("The Lord of the Rings");
        books.add("The Hitchhiker's Guide to the Galaxy");
        books.add("Pride and Prejudice");
        books.add("1984");


        // Display elements and their positions using a ListIterator
        System.out.println("Books and their positions in the linked list:");

        ListIterator<String> iterator = books.listIterator();
        while (iterator.hasNext()) {
            int position = iterator.nextIndex(); // Get the index before moving to the next element.
            String book = iterator.next();
            System.out.println("Position " + position + ": " + book);
        }



         //Alternative approach using a simple for loop and get() (less efficient)

        /*System.out.println("\nAlternative approach using get():");  //Just to visually separate the outputs if you uncomment
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Position " + i + ": " + books.get(i));
        }*/

    }
}
