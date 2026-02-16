import java.util.TreeSet;

public class FindLessThanSeven {

    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some numbers to the TreeSet
        numbers.add(2);
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(12);
        numbers.add(3);

        // Find and print numbers less than 7
        System.out.println("Numbers less than 7:");
        for (Integer number : numbers) {
            if (number < 7) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // Add a newline for cleaner output


        // Alternatively, using Java 8 streams and lambda expressions:  (More concise)
        System.out.println("Numbers less than 7 (using streams):");
        numbers.stream().filter(n -> n < 7).forEach(n -> System.out.print(n + " "));
        System.out.println(); // Add a newline
        
        // Using headSet (most efficient for TreeSet):
        System.out.println("Numbers less than 7 (using headSet):");
         for (Integer number : numbers.headSet(7)) { // Exclusive of 7
            System.out.print(number + " ");
        }
        System.out.println();

    }
}
