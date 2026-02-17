import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String inputString = "This string contains #$%^&*()_+=-`~[]{}|;':\",./<>? and 123.";
        String cleanedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Cleaned string: " + cleanedString);


        String inputString2 = "Hello123World";
        String cleanedString2 = validate(inputString2);
        System.out.println("Original string: " + inputString2);
        System.out.println("Cleaned string: " + cleanedString2); // Demonstrates no change if only alphanumeric
    }

    public static String validate(String input) {
        if (input == null) {
            return null; // Or handle null input as needed, e.g., return "";
        }

        // Use regular expression to replace all non-alphanumeric characters with an empty string
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]"); // Matches anything NOT a-z, A-Z, or 0-9
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("");


    }
}
