import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String inputString = "This string contains #$%^&* symbols and 123 numbers.";
        String cleanedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Cleaned string: " + cleanedString);


        inputString =  "Hello, World! 123"; // Another test case
        cleanedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Cleaned string: " + cleanedString);

    }

    public static String validate(String input) {
        if (input == null) {
            return null; // Or handle null input as needed (e.g., return "")
        }

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]"); // Regex to match non-alphanumeric characters
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("");  // Replace all non-alphanumeric matches with an empty string

        // Alternatively, using String.replaceAll directly:
        // return input.replaceAll("[^a-zA-Z0-9]", "");
    }
}
