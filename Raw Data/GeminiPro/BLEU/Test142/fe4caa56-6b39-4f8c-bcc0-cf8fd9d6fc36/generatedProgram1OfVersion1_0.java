import java.util.Scanner;

public class CharacterReplacement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Get the character to be replaced from the user
        System.out.println("Enter the character to be replaced: ");
        char c1 = scanner.next().charAt(0);

        // Get the character to replace with from the user
        System.out.println("Enter the character to replace with: ");
        char c2 = scanner.next().charAt(0);

        // Replace the character in the string
        String output = input.replace(c1, c2);

        // Print the output string
        System.out.println("The output string is: " + output);
    }
}
