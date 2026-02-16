import java.util.TreeSet;

public class TreeSetLessThanSeven {

    public static void main(String[] args) {
        // Create a TreeSet of Integer objects.
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some numbers to the TreeSet.
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);
        numbers.add(10);


        // Find and print numbers less than 7.  TreeSet's headSet method is perfect for this.
        System.out.println("Numbers less than 7: " + numbers.headSet(7));


        //  Alternative using a loop (less efficient than headSet, but demonstrates iteration)
        System.out.print("Numbers less than 7 (using loop): ");
        for (Integer num : numbers) {
            if (num < 7) {
                System.out.print(num + " ");
            }
        }
        System.out.println();  // Newline for cleaner output
    }
}
