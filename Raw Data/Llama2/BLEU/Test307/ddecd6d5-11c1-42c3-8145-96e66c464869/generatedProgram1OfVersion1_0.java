import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateThroughHashSet {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grape");

        // Method 1: Using an Iterator (preferred for removing elements during iteration)
        System.out.println("Iterating using an Iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }


        // Method 2: Enhanced for loop (for-each loop) - simpler for just accessing elements
        System.out.println("\nIterating using an enhanced for loop:");
        for (String element : hashSet) {
            System.out.println(element);
        }

         //Method 3 : Using forEach Remaining. More concise, does essentially same thing as the Iterator
        System.out.println("\nIterating using Iterator.forEachRemaining");

        hashSet.iterator().forEachRemaining(System.out::println); //Even more concise using method reference


        // Example of using Iterator to safely remove elements during iteration
        System.out.println("\nExample of removing elements during iteration:");
        iterator = hashSet.iterator(); // reset the iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("Banana")) {
                iterator.remove();  // Safe removal using iterator
            }
        }

        System.out.println("\nHashSet after removing 'Banana': " + hashSet);



    }
}
