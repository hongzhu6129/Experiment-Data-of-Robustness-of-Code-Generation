import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {

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

        // Method 2: Using an enhanced for loop (for-each loop)
        System.out.println("\nIterating using an enhanced for loop:");
        for (String element : hashSet) {
            System.out.println(element);
        }


        //Method 3: Using a Java Stream (Java 8 and later)
        System.out.println("\nIterating using a Java Stream:");
        hashSet.stream().forEach(System.out::println);



        // Example with integers
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("\nIterating through a HashSet of integers:");
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
