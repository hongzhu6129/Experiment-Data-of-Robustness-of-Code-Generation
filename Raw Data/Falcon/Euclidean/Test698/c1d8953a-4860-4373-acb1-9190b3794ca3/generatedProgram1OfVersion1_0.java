import java.util.HashSet;
import java.util.Scanner;

public class NonRepeatingProtagonist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter the input string: ");
        String input = scanner.nextLine();

        // Create a HashSet to store the unique characters
        HashSet<Character> uniqueCharacters = new HashSet<>();

        // Create a StringBuilder to store the output string
        StringBuilder output = new StringBuilder();

        // Iterate over the input string
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            // If the character is already in the HashSet, skip it
            if (uniqueCharacters.contains(character)) {
                continue;
            }

            // Otherwise, add the character to the HashSet and the output string
            uniqueCharacters.add(character);
            output.append(character);
        }

        // Print the output string
        System.out.println("The output string is: " + output);
    }
}
