import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPositions {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> books = new LinkedList<>();

        // Add some elements
        books.add("The Hitchhiker's Guide to the Galaxy");
        books.add("Pride and Prejudice");
        books.add("To Kill a Mockingbird");
        books.add("1984");
        books.add("The Lord of the Rings");

        // Display elements and their positions using a ListIterator
        ListIterator<String> iterator = books.listIterator();
        while (iterator.hasNext()) {
            int position = iterator.nextIndex();
            String book = iterator.next();
            System.out.println("Position: " + position + ", Book: " + book);
        }


        //Alternative approach using a simple for loop and get() (less efficient for LinkedLists)
        System.out.println("\nAlternative approach using get():");  //Added newline for clarity
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Position: " + i + ", Book: " + books.get(i));
        }
    }
}
