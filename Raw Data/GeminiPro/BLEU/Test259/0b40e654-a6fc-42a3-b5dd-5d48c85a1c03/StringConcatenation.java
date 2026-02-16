import java.util.Arrays;
import java.util.stream.Collectors;

public class StringConcatenation {

    public static void main(String[] args) {
        // Test cases

        // Case 1: Empty string
        String emptyString = "";
        System.out.println("Empty string: " + stringConcatenation(emptyString));

        // Case 2: Single character string
        String singleCharacterString = "a";
        System.out.println("Single character string: " + stringConcatenation(singleCharacterString));

        // Case 3: Multiple characters string
        String multipleCharactersString = "Hello World";
        System.out.println("Multiple characters string: " + stringConcatenation(multipleCharactersString));

        // Case 4: String with spaces
        String stringWithSpaces = "This is a string with spaces";
        System.out.println("String with spaces: " + stringConcatenation(stringWithSpaces));

        // Case 5: String with special characters
        String stringWithSpecialCharacters = "This is a string with special characters !?@#$%^&*()";
        System.out.println("String with special characters: " + stringConcatenation(stringWithSpecialCharacters));

        // Case 6: String with non-ASCII characters
        String stringWithNonAsciiCharacters = "This is a string with non-ASCII characters ���";
        System.out.println("String with non-ASCII characters: " + stringConcatenation(stringWithNonAsciiCharacters));

        // Case 7: String with null character
        String stringWithNullCharacter = "This is a string with a null character \0";
        System.out.println("String with null character: " + stringConcatenation(stringWithNullCharacter));
    }

    /**
     * Concatenates a string by duplicating it multiple times
     *
     * @param str The string to concatenate
     * @return The concatenated string
     */
    public static String stringConcatenation(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        // Create a string array with the same size as the original string
        String[] strArray = new String[str.length()];

        // Fill the array with the original string
        Arrays.fill(strArray, str);

        // Concatenate the array into a single string
        return Arrays.stream(strArray).collect(Collectors.joining(""));
    }
}
