import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String inputString = "This string contains #$%^&* special characters and 123 numbers.";
        String validatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Validated String: " + validatedString);


        // More test cases
        System.out.println(validate("Hello, World!")); // Output: HelloWorld
        System.out.println(validate("123-456-7890")); // Output: 1234567890
        System.out.println(validate("")); // Output: (empty string)
        System.out.println(validate(null)); // Output: null (handles null input gracefully)
        


    }

    public static String validate(String input) {
        if (input == null) {
            return null; // Handle null input
        }

        // Use regular expression to remove non-alphanumeric characters
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("");
    }
}
