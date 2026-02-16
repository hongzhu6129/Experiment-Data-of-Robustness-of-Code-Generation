import java.util.Scanner;

public class CharacterReplacement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter the input string: ");
        String inputString = scanner.nextLine();

        // Get the character to be replaced from the user
        System.out.println("Enter the character to be replaced: ");
        char characterToReplace = scanner.nextLine().charAt(0);

        // Get the character to replace with from the user
        System.out.println("Enter the character to replace with: ");
        char characterToReplaceWith = scanner.nextLine().charAt(0);

        // Replace the character in the string
        String replacedString = inputString.replace(characterToReplace, characterToReplaceWith);

        // Print the replaced string
        System.out.println("The replaced string is: " + replacedString);
    }
}
