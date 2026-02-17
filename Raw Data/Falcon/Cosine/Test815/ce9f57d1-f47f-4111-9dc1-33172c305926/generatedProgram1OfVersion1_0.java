import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input word
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        // Create a new string to store the rearranged word
        String rearrangedWord = "";

        // Iterate over the input word and add each character to the rearranged word
        for (int i = 0; i < word.length(); i++) {
            // Get the current character
            char character = word.charAt(i);

            // Add the current character to the rearranged word
            rearrangedWord += character;

            // Add another character to the rearranged word
            rearrangedWord += character;
        }

        // Print the rearranged word
        System.out.println("The rearranged word is: " + rearrangedWord);
    }
}
