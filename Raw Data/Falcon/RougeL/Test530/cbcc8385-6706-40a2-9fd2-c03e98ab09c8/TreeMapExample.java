import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> bookMap = new TreeMap<>();

        // Associate values with keys
        bookMap.put("The Lord of the Rings", 1954);
        bookMap.put("The Hitchhiker's Guide to the Galaxy", 1979);
        bookMap.put("Pride and Prejudice", 1813);
        bookMap.put("The Little Prince", 1943);

        // Print the TreeMap (demonstrates the association)
        System.out.println(bookMap); 

        // Example of retrieving a value using a key
        int publicationYear = bookMap.get("The Lord of the Rings");
        System.out.println("The Lord of the Rings was published in: " + publicationYear);


        // Example demonstrating that put() replaces existing values if the key is the same.
        bookMap.put("The Lord of the Rings", 1965); // Update publication year (Revised Edition perhaps?)
        System.out.println(bookMap);  // Notice the year for "The Lord of the Rings" is now 1965


        // Example demonstrating what happens if you try to retrieve a value using a key that doesn't exist
        Integer unknownYear = bookMap.get("The Silmarillion"); // This book isn't in our map.
        System.out.println("The Silmarillion Publication Year (which might be null): " + unknownYear); // Output: null

        
    }
}
