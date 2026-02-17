import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String inputString = "This string contains #$%^&*()_+=-`~[]\';/.,{}|:\"<>? and 123!";
        String cleanedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Cleaned String: " + cleanedString);


        inputString = null;
        cleanedString = validate(inputString); //Testing with null
        System.out.println("Original String: " + inputString);
        System.out.println("Cleaned String: " + cleanedString);

        inputString = ""; // Testing with empty string
        cleanedString = validate(inputString); 
        System.out.println("Original String: " + inputString);
        System.out.println("Cleaned String: " + cleanedString);


    }

    public static String validate(String str) {
        if (str == null) {
            return null; // Or handle null as needed, e.g., return "";
        }

        // Use regular expression to replace all non-alphanumeric characters with an empty string
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]"); // Matches anything NOT a-z, A-Z, or 0-9
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("");
    }
}
