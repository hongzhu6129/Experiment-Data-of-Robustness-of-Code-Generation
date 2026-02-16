import java.util.HashMap;
import java.util.Map;

public class GetMapValue {

    public static void main(String[] args) {
        // Create a sample map
        Map<String, String> bookMap = new HashMap<>();
        bookMap.put("title", "The Lord of the Rings");
        bookMap.put("author", "J.R.R. Tolkien");
        bookMap.put("genre", "Fantasy");


        // Get the value associated with the "title" key
        String title = bookMap.get("title");

        // Print the value (or null if the key is not present)
        if (title != null) {
            System.out.println("The title of the book is: " + title);
        } else {
            System.out.println("The specified key 'title' was not found in the map.");
        }


        // Demonstrate getting a value for a key that may not exist
        String publisher = bookMap.get("publisher"); // "publisher" key isn't in the map

        if (publisher != null) {
            System.out.println("The publisher is: " + publisher);
        } else {
            System.out.println("The specified key 'publisher' was not found in the map."); 
        }


        // Using getOrDefault to provide a default value if the key is not present
        String isbn = bookMap.getOrDefault("isbn", "Not Available"); // "isbn" is not in the map
        System.out.println("The ISBN is: " + isbn);


    }
}
