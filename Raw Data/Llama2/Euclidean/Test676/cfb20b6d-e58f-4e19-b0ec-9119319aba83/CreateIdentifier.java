import java.util.Scanner;

public class CreateIdentifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create a new identifier based on the input string
        String identifier = createIdentifier(inputString);

        // Print the new identifier
        System.out.println("The new identifier is: " + identifier);
    }

    /**
     * Creates a new identifier based on the given string.
     *
     * @param inputString The input string
     * @return The new identifier
     */
    public static String createIdentifier(String inputString) {
        // Replace all non-alphanumeric characters with underscores
        String identifier = inputString.replaceAll("[^a-zA-Z0-9]", "_");

        // Remove any leading or trailing underscores
        identifier = identifier.replaceAll("(^_|_$)", "");

        // Make sure the identifier starts with a letter
        if (!identifier.matches("^[a-zA-Z]")) {
            identifier = "a" + identifier;
        }

        // Return the new identifier
        return identifier;
    }
}
