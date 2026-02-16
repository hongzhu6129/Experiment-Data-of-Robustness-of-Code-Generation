import java.util.TreeSet;

public class NumbersLessThanSevenInTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet to store integers.
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some numbers to the TreeSet (including some greater than and less than 7).
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);
        numbers.add(12);
        numbers.add(1);
        numbers.add(7); // 7 itself is NOT less than 7
        numbers.add(6);


        // Find numbers less than 7 using the headSet method.
        // headSet(7) returns a set containing elements strictly less than 7. 
        TreeSet<Integer> lessThanSeven = (TreeSet<Integer>) numbers.headSet(7);

        // Print the numbers less than 7.
        System.out.println("Numbers less than 7: " + lessThanSeven);


        // Alternatively, you can iterate and check manually (less efficient):
        System.out.print("Numbers less than 7 (manual check): ");
        for (Integer num : numbers) {
            if (num < 7) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Newline for cleaner output

    }
}
