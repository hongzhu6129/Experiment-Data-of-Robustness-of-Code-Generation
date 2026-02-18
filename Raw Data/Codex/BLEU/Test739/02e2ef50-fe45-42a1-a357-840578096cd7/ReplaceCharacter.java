import java.util.Scanner;

public class ReplaceCharacter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the original string from the user.
        System.out.print("Enter the original string: ");
        String originalString = input.nextLine();

        // Get the character to be replaced from the user.
        System.out.print("Enter the character to be replaced: ");
        char characterToReplace = input.next().charAt(0);

        // Get the replacement character from the user.
        System.out.print("Enter the replacement character: ");
        char replacementCharacter = input.next().charAt(0);

        // Replace the character in the string.
        String replacedString = originalString.replace(characterToReplace, replacementCharacter);

        // Print the replaced string.
        System.out.println("The replaced string is: " + replacedString);
    }
}
