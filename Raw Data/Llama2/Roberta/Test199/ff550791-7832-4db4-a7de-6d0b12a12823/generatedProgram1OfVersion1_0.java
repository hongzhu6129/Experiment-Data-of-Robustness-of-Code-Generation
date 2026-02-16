import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String inputString = "This string contains #$%^&* non-alphanumeric characters!";
        String validatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Validated String: " + validatedString);


        inputString = "Hello123World456"; // Example with only alphanumeric chars
        validatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Validated String: " + validatedString);

        inputString = "....,,,,,,????"; // Example with only non-alphanumeric chars
        validatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Validated String: " + validatedString);

        inputString = ""; // Example with an empty String
        validatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Validated String: " + validatedString);

        inputString = null; // Example with a null String
        validatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Validated String: " + validatedString);

    }

    public static String validate(String input) {
        if (input == null) {
            return ""; // or handle null differently, e.g., return null or throw an exception
        }

        // Using regular expression to replace all non-alphanumeric characters with an empty string
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]"); // Matches any character that is NOT a-z, A-Z, or 0-9
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll(""); 
    }
}
