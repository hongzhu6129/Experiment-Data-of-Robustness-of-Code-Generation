import java.util.TreeSet;

public class TreeSetLessThanSeven {

    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some numbers to the TreeSet
        numbers.add(2);
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(12);
        numbers.add(6);

        // Find numbers less than 7 using headSet()
        TreeSet<Integer> lessThanSeven = (TreeSet<Integer>) numbers.headSet(7);

        // Print the numbers less than 7
        System.out.println("Numbers less than 7: " + lessThanSeven); 
    }
}
