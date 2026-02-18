import java.util.LinkedList;

public class InsertElementLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> books = new LinkedList<>();

        // Add some initial elements
        books.add("Book 1");
        books.add("Book 2");
        books.add("Book 4"); // Notice we skipped Book 3 intentionally

        // Specify the element to insert and the position (index)
        String newBook = "Book 3";
        int position = 2; // We want to insert at index 2 (which is the 3rd position)


        // Insert the element at the specified position
        try {
            books.add(position, newBook);
            System.out.println("LinkedList after insertion: " + books);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid position. Position should be between 0 and " + books.size());
        }


        // Example with an invalid position (out of bounds)
        position = 10;
        try {
            books.add(position, "Book 5");  // This will throw an exception
            System.out.println("LinkedList after insertion: " + books); // This won't be reached

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid position. Position should be between 0 and " + books.size());
        }



        // Inserting at the beginning (index 0)
        books.add(0, "Book 0");
        System.out.println("LinkedList after insertion at beginning: " + books);



        // Inserting at the end (using the size as the index)
        books.add(books.size(), "Book Last");
        System.out.println("LinkedList after insertion at end: " + books);


    }
}
