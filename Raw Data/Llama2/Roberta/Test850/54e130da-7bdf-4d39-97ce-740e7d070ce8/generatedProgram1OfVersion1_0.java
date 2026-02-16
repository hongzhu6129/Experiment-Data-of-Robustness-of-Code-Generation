import java.util.TreeSet;

public class TreeSetLessThanSeven {

    public static void main(String[] args) {
        // Create a TreeSet of Integer objects
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some numbers to the TreeSet (order doesn't matter, TreeSet sorts them)
        numbers.add(10);
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        numbers.add(5);
        numbers.add(9);
        numbers.add(2);


        System.out.println("Original TreeSet: " + numbers);

        // Method 1: Using headSet() (recommended)
        // headSet(7) returns a *view* of the portion of the TreeSet
        // containing elements strictly less than 7.  It does *not* create a copy.
        System.out.println("Numbers less than 7 (using headSet): " + numbers.headSet(7));


        // Method 2: Using a loop and enhanced for loop (less efficient, but demonstrates iteration)
        System.out.print("Numbers less than 7 (using loop): ");
        for (Integer num : numbers) {
            if (num < 7) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Newline for formatting


        // Method 3: Java Streams (more advanced, but concise)
        // This filters the TreeSet and prints the elements less than 7.
        System.out.print("Numbers less than 7 (using streams): ");
        numbers.stream()
               .filter(n -> n < 7)
               .forEach(n -> System.out.print(n + " "));
        System.out.println();



        // Important note regarding headSet():  Modifications to the view affect the original TreeSet.
        TreeSet<Integer> lessThanSevenView = (TreeSet<Integer>) numbers.headSet(7);
        lessThanSevenView.remove(3); // Removing 3 from the view also removes it from the original TreeSet.
        System.out.println("TreeSet after removing 3 from the view: " + numbers);



    }
}
