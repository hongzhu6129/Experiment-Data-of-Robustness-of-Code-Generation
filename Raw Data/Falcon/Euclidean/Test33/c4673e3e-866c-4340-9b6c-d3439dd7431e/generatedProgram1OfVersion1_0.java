import java.util.Scanner;

public class ReplaceCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.println("Enter the input string: ");
        String inputString = scanner.nextLine();

        // Get the character to be replaced from the user.
        System.out.println("Enter the character to be replaced: ");
        char characterToReplace = scanner.nextLine().charAt(0);

        // Get the replacement character from the user.
        System.out.println("Enter the replacement character: ");
        char replacementCharacter = scanner.nextLine().charAt(0);

        // Replace the character in the input string.
        String replacedString = inputString.replace(characterToReplace, replacementCharacter);

        // Print the replaced string.
        System.out.println("The replaced string is: " + replacedString);
    }
}
