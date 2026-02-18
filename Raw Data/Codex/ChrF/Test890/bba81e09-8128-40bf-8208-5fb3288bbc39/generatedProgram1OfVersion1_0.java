import java.util.Scanner;

public class FindCharacterInWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input strings
        System.out.println("Enter the first word:");
        String word1 = scanner.nextLine();
        System.out.println("Enter the second word:");
        String word2 = scanner.nextLine();

        // Check if the second word contains any of the characters in the first word
        boolean containsCharacter = false;
        for (int i = 0; i < word1.length(); i++) {
            char character = word1.charAt(i);
            if (word2.contains(String.valueOf(character))) {
                containsCharacter = true;
                break;
            }
        }

        // Print the result
        if (containsCharacter) {
            System.out.println("The second word contains a character from the first word.");
        } else {
            System.out.println("The second word does not contain any characters from the first word.");
        }
    }
}
