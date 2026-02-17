import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableSetFromMap {

    public static void main(String[] args) {

        // Create a TreeMap (which implements NavigableMap)
        NavigableMap<String, Integer> bookMap = new TreeMap<>();

        // Add some book titles and their quantities
        bookMap.put("Java in Depth", 10);
        bookMap.put("Python Crash Course", 15);
        bookMap.put("Data Structures and Algorithms", 20);
        bookMap.put("Clean Code", 5);

        // Get a NavigableSet view of the keys
        NavigableSet<String> bookTitles = bookMap.navigableKeySet();

        // Print the NavigableSet of book titles
        System.out.println("NavigableSet of book titles: " + bookTitles);


        // Demonstrate some NavigableSet methods (optional):

        System.out.println("First title: " + bookTitles.first());
        System.out.println("Last title: " + bookTitles.last());
        System.out.println("Titles before 'Python Crash Course': " + bookTitles.headSet("Python Crash Course", false)); // Exclusive
        System.out.println("Titles from 'Java in Depth' to 'Python Crash Course': " + bookTitles.subSet("Java in Depth", true, "Python Crash Course", true)); // Inclusive



    }
}
