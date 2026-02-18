import java.util.ArrayList;
import java.util.List;

public class ArrayListSearch {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> books = new ArrayList<>();
        books.add("The Lord of the Rings");
        books.add("The Hitchhiker's Guide to the Galaxy");
        books.add("Pride and Prejudice");
        books.add("To Kill a Mockingbird");

        // Search for a specific book 
        String searchBook = "Pride and Prejudice";
        boolean found = books.contains(searchBook); 

        if (found) {
            System.out.println(searchBook + " found at index: " + books.indexOf(searchBook));
        } else {
            System.out.println(searchBook + " not found in the list.");
        }


        // Search for a book that doesn't exist
        searchBook = "The Martian";
        found = books.contains(searchBook);

        if (found) {
            System.out.println(searchBook + " found at index: " + books.indexOf(searchBook)); //This won't execute
        } else {
            System.out.println(searchBook + " not found in the list.");
        }


        // Example with integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(15);

        int searchNumber = 25;

         if (numbers.contains(searchNumber)) {
            System.out.println(searchNumber + " found at index: " + numbers.indexOf(searchNumber)); 
        } else {
            System.out.println(searchNumber + " not found in the list.");
        }



    }
}
