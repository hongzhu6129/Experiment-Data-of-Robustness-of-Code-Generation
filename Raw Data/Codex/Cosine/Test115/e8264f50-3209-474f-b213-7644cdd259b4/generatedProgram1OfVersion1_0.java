import java.util.Scanner;

public class CharacterReplacement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        // Get the character to be replaced
        System.out.println("Enter the character to be replaced: ");
        char oldChar = scanner.nextLine().charAt(0);

        // Get the character to replace with
        System.out.println("Enter the character to replace with: ");
        char newChar = scanner.nextLine().charAt(0);

        // Replace the character in the string
        String newStr = str.replace(oldChar, newChar);

        // Print the new string
        System.out.println("The new string is: " + newStr);
    }
}
