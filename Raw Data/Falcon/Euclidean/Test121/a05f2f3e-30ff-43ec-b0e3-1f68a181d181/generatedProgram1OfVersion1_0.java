import java.util.Arrays;
import java.util.Scanner;

public class SortUniqueAlphabeticCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter a string: ");
        String inputString = input.nextLine();

        // Remove non-alphabetic characters
        String alphabeticCharacters = inputString.replaceAll("[^a-zA-Z]", "");

        // Convert to character array
        char[] characters = alphabeticCharacters.toCharArray();

        // Sort the character array
        Arrays.sort(characters);

        // Remove duplicate characters
        char[] uniqueCharacters = new char[characters.length];
        int uniqueLength = 0;
        for (char character : characters) {
            if (uniqueLength == 0 || character != uniqueCharacters[uniqueLength - 1]) {
                uniqueCharacters[uniqueLength] = character;
                uniqueLength++;
            }
        }

        // Convert back to string and print
        String sortedUniqueString = new String(uniqueCharacters, 0, uniqueLength);
        System.out.println("Sorted unique alphabetic characters: " + sortedUniqueString);
    }
}
