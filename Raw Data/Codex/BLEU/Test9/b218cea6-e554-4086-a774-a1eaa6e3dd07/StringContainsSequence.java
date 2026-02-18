import java.util.Scanner;

public class StringContainsSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Get the sequence of characters to search for
        System.out.println("Enter the sequence of characters to search for: ");
        String sequence = scanner.nextLine();

        // Check if the string contains the sequence
        boolean contains = str.contains(sequence);

        // Print the result
        if (contains) {
            System.out.println("The string contains the sequence.");
        } else {
            System.out.println("The string does not contain the sequence.");
        }
    }
}
