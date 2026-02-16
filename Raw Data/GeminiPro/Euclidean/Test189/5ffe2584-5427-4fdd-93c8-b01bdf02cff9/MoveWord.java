import java.util.*;

public class MoveWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter the input string:");
        String inputString = scanner.nextLine();

        // Get the word to be moved
        System.out.println("Enter the word to be moved:");
        String word = scanner.nextLine();

        // Get the position to move the word to
        System.out.println("Enter the position to move the word to:");
        int position = scanner.nextInt();

        // Move the word
        String newString = moveWord(inputString, word, position);

        // Print the new string
        System.out.println("The new string is: " + newString);
    }

    public static String moveWord(String inputString, String word, int position) {
        // Check if the word is present in the input string
        if (!inputString.contains(word)) {
            throw new IllegalArgumentException("The word is not present in the input string.");
        }

        // Check if the position is valid
        if (position < 0 || position > inputString.length()) {
            throw new IllegalArgumentException("The position is invalid.");
        }

        // Get the index of the word in the input string
        int index = inputString.indexOf(word);

        // Create a new string with the word moved to the specified position
        String newString = inputString.substring(0, index) + inputString.substring(index + word.length(), position) + word + inputString.substring(position);

        // Return the new string
        return newString;
    }
}
