import java.util.Scanner;

public class CanonicalRepresentation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Get the canonical representation of the string.
        String canonicalRepresentation = inputString.intern();

        // Print the canonical representation of the string.
        System.out.println("The canonical representation of the string is: " + canonicalRepresentation);
    }
}
