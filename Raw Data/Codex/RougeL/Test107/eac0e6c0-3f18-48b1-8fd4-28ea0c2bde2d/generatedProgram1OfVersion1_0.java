import java.util.Scanner;

public class RemoveOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        // Get the character to be removed from the user
        System.out.print("Enter the character to be removed: ");
        char character = scanner.nextLine().charAt(0);

        // Remove all occurrences of the character from the input string
        String output = input.replaceAll(String.valueOf(character), "");

        // Print the resulting string
        System.out.println("The resulting string is: " + output);
    }
}
