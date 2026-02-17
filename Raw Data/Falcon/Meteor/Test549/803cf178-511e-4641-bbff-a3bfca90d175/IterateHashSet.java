import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<Integer> numbers = new HashSet<>();

        // Add some elements to the HashSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        // Method 1: Enhanced for loop (recommended for simplicity)
        System.out.println("Iterating using enhanced for loop:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Method 2: Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }


        //2083?  I'm assuming this was a typo and you simply want to iterate
        //If you meant to *add* 2083, you would use numbers.add(2083);


    }
}
