import java.util.Scanner;

public class TrimWhitespace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Trim the leading and trailing whitespace
        String trimmed = input.trim();

        // Print the trimmed string
        System.out.println("Trimmed string: " + trimmed);
    }
}
