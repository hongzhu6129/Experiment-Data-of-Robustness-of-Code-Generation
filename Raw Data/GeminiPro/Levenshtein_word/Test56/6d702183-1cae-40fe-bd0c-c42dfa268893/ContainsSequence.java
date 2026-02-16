import java.util.Scanner;

public class ContainsSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string and the sequence from the user.
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        System.out.println("Enter the sequence: ");
        String sequence = scanner.nextLine();

        // Check if the string contains the sequence.
        boolean contains = str.contains(sequence);

        // Print the result.
        if (contains) {
            System.out.println("The string contains the sequence.");
        } else {
            System.out.println("The string does not contain the sequence.");
        }
    }
}
