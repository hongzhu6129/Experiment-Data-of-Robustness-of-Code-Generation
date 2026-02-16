import java.util.Scanner;

public class ReplaceChars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Get the character to be replaced from the user
        System.out.println("Enter the character to be replaced: ");
        char oldChar = scanner.next().charAt(0);

        // Get the character to replace with from the user
        System.out.println("Enter the character to replace with: ");
        char newChar = scanner.next().charAt(0);

        // Replace the old character with the new character
        String output = input.replace(oldChar, newChar);

        // Print the output string
        System.out.println("The output string is: " + output);
    }
}
