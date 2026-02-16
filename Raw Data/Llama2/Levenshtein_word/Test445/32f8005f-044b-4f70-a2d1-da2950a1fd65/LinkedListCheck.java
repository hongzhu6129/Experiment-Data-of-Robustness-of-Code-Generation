import java.util.LinkedList;

public class LinkedListCheck {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> books = new LinkedList<>();

        // Add some elements
        books.add("The Lord of the Rings");
        books.add("The Hitchhiker's Guide to the Galaxy");
        books.add("Pride and Prejudice");

        // Element to search for
        String targetBook = "The Hitchhiker's Guide to the Galaxy";

        // Check if the element exists using contains()
        boolean exists = books.contains(targetBook);

        if (exists) {
            System.out.println(targetBook + " exists in the linked list.");
        } else {
            System.out.println(targetBook + " does not exist in the linked list.");
        }


        // Example with an element that doesn't exist.
        targetBook = "Moby Dick";
        exists = books.contains(targetBook);

        if (exists) {
            System.out.println(targetBook + " exists in the linked list.");
        } else {
            System.out.println(targetBook + " does not exist in the linked list.");
        }

       // Example with Integer LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int targetNumber = 20;
        boolean numberExists = numbers.contains(targetNumber); // Autoboxing handles int to Integer conversion

         if (numberExists) {
            System.out.println(targetNumber + " exists in the linked list.");
        } else {
            System.out.println(targetNumber + " does not exist in the linked list.");
        }
    }
}
