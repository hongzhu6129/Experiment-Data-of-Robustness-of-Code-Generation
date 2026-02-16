import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String inputString = "This string contains #$%^&*()_+=-`~[]\\{}|;':\",./<>? and 123.";
        String validatedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Validated string: " + validatedString);


        inputString = "Another Example@123";
        validatedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Validated string: " + validatedString);

    }

    public static String validate(String input) {
        if (input == null) {
            return null; // or handle null as needed
        }

        // Use regular expression to remove non-alphanumeric characters
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]"); // Matches anything NOT a-z, A-Z, or 0-9
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("");  // Replace all non-alphanumeric matches with empty string
    }
}



