import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterationFromPosition {

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");

        // Specify the starting position (index)
        int startPosition = 2; // Start iterating from the 3rd element (index 2)

        // Demonstrating iteration using ListIterator
        System.out.println("Iterating from position " + startPosition + " using ListIterator:");
        ListIterator<String> iterator = fruits.listIterator(startPosition);
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }


        // Demonstrating iteration using a simple for loop (less efficient if the starting position is large)
        System.out.println("\nIterating from position " + startPosition + " using for loop (less efficient for large lists and high start positions):");
        for (int i = startPosition; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }


        // Handling invalid start positions (demonstration)
        System.out.println("\nHandling invalid start position:");
        int invalidStartPosition = 10; // Out of bounds

        try {
            ListIterator<String> invalidIterator = fruits.listIterator(invalidStartPosition); //  IndexOutOfBoundsException if invalid
            while (invalidIterator.hasNext()) { 
                invalidIterator.next(); //  This part won't be reached if the exception is thrown
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Invalid start position.  " + e.getMessage());
        }


        // Iterating backwards from a position (demonstration)
        System.out.println("\nIterating backwards from position " + startPosition + " using ListIterator:");

        ListIterator<String> backwardIterator = fruits.listIterator(startPosition+1); //+1 to start *before* the element at startPos
        while (backwardIterator.hasPrevious()) {
            String fruit = backwardIterator.previous();
            System.out.println(fruit);
        }
    }
}

