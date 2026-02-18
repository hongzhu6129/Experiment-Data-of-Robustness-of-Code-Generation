import java.util.Scanner;

public class StringContainsSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string and the sequence to search for
        System.out.println("Enter the string:");
        String string = scanner.nextLine();

        System.out.println("Enter the sequence to search for:");
        String sequence = scanner.nextLine();

        // Check if the string contains the sequence
        boolean containsSequence = string.contains(sequence);

        // Print the result
        if (containsSequence) {
            System.out.println("The string contains the sequence.");
        } else {
            System.out.println("The string does not contain the sequence.");
        }
    }
}
