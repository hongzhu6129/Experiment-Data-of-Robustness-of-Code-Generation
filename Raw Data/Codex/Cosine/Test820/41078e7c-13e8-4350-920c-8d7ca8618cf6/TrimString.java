import java.util.Scanner;

public class TrimString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Trim the leading and trailing spaces
        String trimmedString = inputString.trim();

        // Print the trimmed string
        System.out.println("Trimmed string: " + trimmedString);
    }
}
