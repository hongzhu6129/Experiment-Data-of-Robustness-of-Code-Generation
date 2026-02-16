import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String inputString = "This string contains #$%^&*()_+=-`~[]\\;',./{}|:\"<>? and numbers 1234567890!";
        String cleanedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Cleaned string: " + cleanedString);

        inputString = "Another Example@123";
        cleanedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Cleaned string: " + cleanedString);


        inputString =  null; // Testing null input
        cleanedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Cleaned string: " + cleanedString);


        inputString = ""; // Testing empty input
        cleanedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Cleaned string: " + cleanedString);

    }

    public static String validate(String inputString) {
        if (inputString == null) {
            return null; // Or handle null as needed, e.g., return "";
        }

        // Use regular expression to replace all non-alphanumeric characters with an empty string
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]"); // Matches any character that is NOT a-z, A-Z, or 0-9
        Matcher matcher = pattern.matcher(inputString);
        return matcher.replaceAll("");
    }
}
