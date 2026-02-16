import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String inputString = "This string @contains #special characters!";
        String validatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Validated String: " + validatedString);

        inputString = "Another123Example";
        validatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Validated String: " + validatedString);


        inputString = ""; // Empty string
        validatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Validated String: " + validatedString);

        inputString = null; // Null string
        validatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Validated String: " + validatedString);



    }

    public static String validate(String input) {
        if (input == null) {
            return ""; // Or handle null as needed, e.g., return null or throw an exception
        }
        // Use a regular expression to replace all non-alphanumeric characters with an empty string
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]"); 
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("");

    }
}
