import java.util.HashSet;

public class EmptyHashSet {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> books = new HashSet<>();

        // Add some elements to the HashSet
        books.add("The Lord of the Rings");
        books.add("The Hitchhiker's Guide to the Galaxy");
        books.add("Pride and Prejudice");

        // Print the initial HashSet
        System.out.println("Initial HashSet: " + books);

        // Empty the HashSet using clear()
        books.clear();

        // Print the HashSet after clearing
        System.out.println("HashSet after clearing: " + books); 
    }
}
