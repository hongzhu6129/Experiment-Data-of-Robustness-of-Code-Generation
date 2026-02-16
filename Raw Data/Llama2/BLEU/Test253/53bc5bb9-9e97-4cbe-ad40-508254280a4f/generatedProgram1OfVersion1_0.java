import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {

    public static void main(String[] args) {

        // Create a LinkedList of Strings
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        System.out.println("Iterating using a for loop and get():");
        // Method 1: Using a for loop and get() method (not recommended for LinkedList)
        for (int i = 0; i < languages.size(); i++) {
            System.out.println(languages.get(i)); // Inefficient for LinkedList
        }

        System.out.println("\nIterating using an enhanced for loop (for-each loop):");
        // Method 2: Using an enhanced for loop (for-each loop) - Recommended
        for (String language : languages) {
            System.out.println(language);
        }

        System.out.println("\nIterating using a while loop and an Iterator:");
        // Method 3: Using a while loop and an Iterator
        java.util.Iterator<String> iterator = languages.iterator();
        while (iterator.hasNext()) {
            String language = iterator.next();
            System.out.println(language);
        }

        System.out.println("\nIterating using a while loop and a ListIterator (allows forward and backward traversal):");
        // Method 4: Using a while loop and a ListIterator (more flexible, allows backward iteration)
        ListIterator<String> listIterator = languages.listIterator();
        while (listIterator.hasNext()) {
            String language = listIterator.next();
            System.out.println(language);
        }

         System.out.println("\nIterating backwards using a ListIterator:");
        // Demonstrate backward iteration using ListIterator (previous())
         while (listIterator.hasPrevious()) {
            String language = listIterator.previous();
            System.out.println(language);
        }



        System.out.println("\nIterating using a forEach() method (Java 8 and later):");
        // Method 5: Using forEach() method with a lambda expression (Java 8 and later)
        languages.forEach(language -> System.out.println(language));


        System.out.println("\nIterating using a Stream (Java 8 and later):");
        // Method 6: Using Streams (Java 8 and later)
        languages.stream().forEach(System.out::println);  // Method reference


    }
}
