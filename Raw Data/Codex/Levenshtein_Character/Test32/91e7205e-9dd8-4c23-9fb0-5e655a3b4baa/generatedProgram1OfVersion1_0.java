import java.util.Scanner;

public class AlphabetIdentifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.println("Enter a character: ");
        char character = scanner.next().charAt(0);

        // Check if the character is an alphabet
        if (Character.isAlphabetic(character)) {
            // Check if the character is a vowel
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                    character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                System.out.println("The character " + character + " is a vowel.");
            } else {
                System.out.println("The character " + character + " is a consonant.");
            }
        } else {
            System.out.println("The character " + character + " is not an alphabet.");
        }
    }
}
