import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> books = new LinkedList<>();

        // Insert at the beginning (first position)
        books.addFirst("The Hitchhiker's Guide to the Galaxy");
        books.addFirst("Pride and Prejudice");


        // Insert at the end (last position)
        books.addLast("To Kill a Mockingbird");
        books.addLast("1984");

        // Print the LinkedList
        System.out.println(books);


        // Example with Integer LinkedList
         LinkedList<Integer> numbers = new LinkedList<>();
         numbers.addFirst(10);
         numbers.addLast(20);
         System.out.println(numbers);

    }
}
