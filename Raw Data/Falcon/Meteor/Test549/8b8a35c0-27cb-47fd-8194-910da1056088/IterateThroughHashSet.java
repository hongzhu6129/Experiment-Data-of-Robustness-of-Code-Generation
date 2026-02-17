import java.util.HashSet;
import java.util.Iterator;

public class IterateThroughHashSet {

    public static void main(String[] args) {

        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grape");


        // Method 1: Using an Iterator
        System.out.println("Iterating using an Iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }


        // Method 2: Enhanced for loop (for-each loop)
        System.out.println("\nIterating using an enhanced for loop:");
        for (String element : hashSet) {
            System.out.println(element);
        }

        //Method 3: Using a forEach loop with lambda expression (Java 8 and above)
        System.out.println("\nIterating using forEach with lambda expression:");

        hashSet.forEach(element -> System.out.println(element));



    }
}
