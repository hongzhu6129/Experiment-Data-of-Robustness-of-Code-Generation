import java.util.Scanner;

public class NasdaqCharacterExtractor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user
        System.out.println("Enter a string containing NASDAQ characters:");
        String inputString = scanner.nextLine();

        // Extract the NASDAQ characters from the input string
        String nasdaqCharacters = extractNasdaqCharacters(inputString);

        // Print the extracted NASDAQ characters to the console
        System.out.println("The NASDAQ characters in the input string are:");
        System.out.println(nasdaqCharacters);
    }

    public static String extractNasdaqCharacters(String inputString) {
        StringBuilder nasdaqCharacters = new StringBuilder();

        for (char character : inputString.toCharArray()) {
            if (Character.isLetterOrDigit(character)) {
                nasdaqCharacters.append(character);
            }
        }

        return nasdaqCharacters.toString();
    }
}
