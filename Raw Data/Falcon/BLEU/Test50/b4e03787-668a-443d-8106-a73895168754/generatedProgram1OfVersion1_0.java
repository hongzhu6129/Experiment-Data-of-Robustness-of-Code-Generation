import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableSetFromMap {

    public static void main(String[] args) {
        // Create a TreeMap (which implements NavigableMap)
        NavigableMap<String, Integer> bookMap = new TreeMap<>();

        // Add some book titles and their page counts
        bookMap.put("The Hitchhiker's Guide to the Galaxy", 224);
        bookMap.put("Pride and Prejudice", 432);
        bookMap.put("To Kill a Mockingbird", 281);
        bookMap.put("1984", 328);


        // Get a NavigableSet view of the keys (book titles)
        NavigableSet<String> bookTitles = bookMap.navigableKeySet();


        // Print the original map
        System.out.println("Original Map: " + bookMap);


        // Print the NavigableSet of keys
        System.out.println("NavigableSet of Keys: " + bookTitles);


        // Demonstrate some NavigableSet methods

        // Get the first (lexicographically smallest) title
        System.out.println("First Title: " + bookTitles.first());


        // Get the last (lexicographically largest) title
        System.out.println("Last Title: " + bookTitles.last());

        // Get the title lexicographically before "Pride and Prejudice"
        System.out.println("Title before 'Pride and Prejudice': " + bookTitles.lower("Pride and Prejudice"));

         // Get the title lexicographically after "Pride and Prejudice"
        System.out.println("Title after 'Pride and Prejudice': " + bookTitles.higher("Pride and Prejudice"));
        
        // Get a subset of titles from "1984" (inclusive) to "To Kill a Mockingbird" (exclusive)
        System.out.println("Subset of Titles: " + bookTitles.subSet("1984", true, "To Kill a Mockingbird", false));


        // Get a reverse view of the titles
        System.out.println("Reverse Order: " + bookTitles.descendingSet());
    }
}
