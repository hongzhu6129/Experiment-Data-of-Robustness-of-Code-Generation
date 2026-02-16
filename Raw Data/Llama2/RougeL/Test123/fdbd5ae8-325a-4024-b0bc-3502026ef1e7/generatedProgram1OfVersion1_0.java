import java.util.Scanner;

public class CharacterReplacement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the original string
        System.out.println("Enter the string:");
        String originalString = scanner.nextLine();

        // Get the character to be replaced
        System.out.println("Enter the character to be replaced:");
        char characterToBeReplaced = scanner.nextLine().charAt(0);

        // Get the replacement character
        System.out.println("Enter the replacement character:");
        char replacementCharacter = scanner.nextLine().charAt(0);

        // Replace the character
        String replacedString = originalString.replace(characterToBeReplaced, replacementCharacter);

        // Print the replaced string
        System.out.println("The replaced string is: " + replacedString);
    }
}
