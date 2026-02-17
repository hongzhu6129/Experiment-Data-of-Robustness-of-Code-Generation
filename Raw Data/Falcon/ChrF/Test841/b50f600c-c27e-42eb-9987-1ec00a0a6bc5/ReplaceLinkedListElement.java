import java.util.LinkedList;
import java.util.ListIterator;

public class ReplaceLinkedListElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> books = new LinkedList<>();
        books.add("The Hitchhiker's Guide to the Galaxy");
        books.add("Pride and Prejudice");
        books.add("To Kill a Mockingbird");
        books.add("1984");

        System.out.println("Original LinkedList: " + books);

        // Replace an element using set() method by index.
        int indexToReplace = 1; // Replace the element at index 1 (Pride and Prejudice)
        String newBook = "Sense and Sensibility";

        if (indexToReplace >= 0 && indexToReplace < books.size()) {
            books.set(indexToReplace, newBook);
            System.out.println("LinkedList after replacing element at index " + indexToReplace + ": " + books);
        } else {
            System.out.println("Invalid index. No replacement made.");
        }



        // Replace an element using ListIterator
        // Reset the list (for demonstration of the iterator approach)
        books = new LinkedList<>();
        books.add("The Hitchhiker's Guide to the Galaxy");
        books.add("Pride and Prejudice");
        books.add("To Kill a Mockingbird");
        books.add("1984");


        String bookToReplace = "To Kill a Mockingbird";
        String replacementBook = "The Great Gatsby";

        ListIterator<String> iterator = books.listIterator();
        while (iterator.hasNext()) {
            String currentBook = iterator.next();
            if (currentBook.equals(bookToReplace)) {
                iterator.set(replacementBook);
                break; // Stop after the first replacement (if you want to replace all occurrences, remove this break)
            }
        }


        System.out.println("LinkedList after replacing '" + bookToReplace + "' with '" + replacementBook + "': " + books);
    }
}
