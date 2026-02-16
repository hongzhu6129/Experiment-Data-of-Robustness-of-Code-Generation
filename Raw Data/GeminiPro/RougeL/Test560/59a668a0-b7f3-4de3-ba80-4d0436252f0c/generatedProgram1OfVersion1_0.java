import java.util.ArrayList;
import java.util.List;

public class ArrayListSearch {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grape");

        // Search for an element using contains()
        String searchTerm = "Mango";
        if (fruits.contains(searchTerm)) {
            System.out.println(searchTerm + " is found in the list.");
        } else {
            System.out.println(searchTerm + " is not found in the list.");
        }

        // Search for an element using indexOf() to get its position
        searchTerm = "Orange";
        int index = fruits.indexOf(searchTerm);
        if (index != -1) {
            System.out.println(searchTerm + " is found at index " + index);
        } else {
            System.out.println(searchTerm + " is not found in the list.");
        }


        // Example with integers:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(15);


        int searchNumber = 25;
        if (numbers.contains(searchNumber)) {  // Autoboxing handles int to Integer conversion
            System.out.println(searchNumber + " is found in the list.");
        } else {
            System.out.println(searchNumber + " is not found in the list.");
        }


        // Searching for a non-primitive type (e.g., custom class):
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Lord of the Rings", "J.R.R. Tolkien"));
        books.add(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams"));

        Book searchBook = new Book("The Lord of the Rings", "J.R.R. Tolkien");

        if (books.contains(searchBook)) { // Requires equals() method to be correctly implemented in the Book class
            System.out.println(searchBook.getTitle() + " is found in the list.");
        } else {
            System.out.println(searchBook.getTitle() + " is not found in the list.");
        }

    }


}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author); // Comparing both title and author
    }


}
