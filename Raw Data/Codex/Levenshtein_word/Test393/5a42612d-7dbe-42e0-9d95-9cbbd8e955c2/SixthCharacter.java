import java.util.Scanner;

public class SixthCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the input string is valid.
        if (input.length() < 6) {
            System.out.println("Error: The input string must be at least 6 characters long.");
            return;
        }

        // Get the sixth character from the input string.
        char sixthCharacter = input.charAt(5);

        // Print the sixth character to the console.
        System.out.println("The sixth character of the input string is: " + sixthCharacter);
    }
}
