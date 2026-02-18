import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grape");

        // Sort the ArrayList alphabetically
        Collections.sort(fruits);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " + fruits);


        // Example with integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        // Sort the ArrayList numerically
        Collections.sort(numbers);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " + numbers);


        // Example with custom objects (requires implementing Comparable interface)
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The Hitchhiker's Guide to the Galaxy", 1979));
        books.add(new Book("Pride and Prejudice", 1813));
        books.add(new Book("To Kill a Mockingbird", 1960));

        // Sort the ArrayList of books by year published (ascending)
        Collections.sort(books);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " + books);


    }
}

class Book implements Comparable<Book> {
    String title;
    int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " (" + year + ")";
    }

    @Override
    public int compareTo(Book other) {
        return this.year - other.year; // Sort by year ascending
        //return other.year - this.year;  // For Descending Order
        // To sort by Title: return this.title.compareTo(other.title);

    }
}
