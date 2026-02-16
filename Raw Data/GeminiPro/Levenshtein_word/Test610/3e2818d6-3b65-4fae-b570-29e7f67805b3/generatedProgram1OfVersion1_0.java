import java.util.TreeSet;

public class FindNumbersFarThan7 {

    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(12);
        numbers.add(1);
        numbers.add(15);

        // Find numbers greater than 7
        System.out.println("Numbers greater than 7:");
        for (Integer number : numbers.tailSet(8)) { // Use tailSet(8) to exclude 7 and get numbers strictly greater than 7
            System.out.println(number);
        }

        // Find numbers less than 7
        System.out.println("\nNumbers less than 7:");
        for (Integer number : numbers.headSet(7)) { // Use headSet(7) to exclude 7 itself
            System.out.println(number);
        }


        // Alternatively, combine the logic for finding numbers both greater and less than 7:
        System.out.println("\nNumbers far than 7 (combined approach):");
        for (Integer number : numbers) {
             if (number != 7) { // Or:  if (Math.abs(number - 7) > 0) 
                System.out.println(number);
             }
         }
    }
}
