import java.util.Scanner;

public class StringContainsSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string and sequence from the user.
        System.out.println("Enter the input string: ");
        String inputString = scanner.nextLine();

        System.out.println("Enter the sequence to search for: ");
        String sequence = scanner.nextLine();

        // Check if the input string contains the sequence.
        boolean containsSequence = inputString.contains(sequence);

        // Print the result.
        if (containsSequence) {
            System.out.println("The input string contains the sequence.");
        } else {
            System.out.println("The input string does not contain the sequence.");
        }
    }
}
