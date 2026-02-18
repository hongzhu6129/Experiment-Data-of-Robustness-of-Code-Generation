import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList of strings (names)
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // Specify the starting position (index)
        int startPosition = 2; // Start iterating from the 3rd element (index 2)


        if (startPosition >= 0 && startPosition < names.size()) {
            // Use a ListIterator to iterate from a specific position
            ListIterator<String> iterator = names.listIterator(startPosition);

            System.out.println("Iterating through names starting at position " + startPosition + ":");

            while (iterator.hasNext()) {
                String name = iterator.next();
                System.out.println(name);
            }
        } else {
            System.out.println("Invalid start position.  Must be between 0 and " + (names.size() - 1) + " inclusive.");
        }


        // Example of iterating backwards from a position:
        startPosition = 3; //Start from the fourth element and move backwards
        if (startPosition >= 0 && startPosition < names.size()) {
            ListIterator<String> iterator = names.listIterator(startPosition + 1); //+1 to set cursor correctly for backward iteration

            System.out.println("\nIterating backwards through names starting at position " + startPosition + ":");

            while (iterator.hasPrevious()) {
                String name = iterator.previous();
                System.out.println(name);
            }
        } else {
            System.out.println("Invalid start position.  Must be between 0 and " + (names.size() - 1) + " inclusive.");
        }
    }
}
