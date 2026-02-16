import java.util.HashSet;
import java.util.Set;

public class GreenSetLessThanSeven {

    public static void main(String[] args) {
        // Create a HashSet to represent the green set.
        Set<Integer> greenSet = new HashSet<>();

        // Add some sample numbers to the green set.
        greenSet.add(3);
        greenSet.add(8);
        greenSet.add(5);
        greenSet.add(1);
        greenSet.add(9);
        greenSet.add(6);

        // Find and print numbers less than 7 in the green set.
        System.out.print("Numbers less than 7 in the green set: ");
        for (int number : greenSet) {
            if (number < 7) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // Add a newline for better formatting
    }
}
