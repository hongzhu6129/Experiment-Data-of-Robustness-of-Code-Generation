import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {

    public static void main(String[] args) {
        String testString1 = "HelloWorld123_";
        String testString2 = "Invalid String!";
        String testString3 = "Another_Valid_String";
        String testString4 = ""; // Empty string

        System.out.println(testString1 + ": " + validate(testString1));
        System.out.println(testString2 + ": " + validate(testString2));
        System.out.println(testString3 + ": " + validate(testString3));
        System.out.println(testString4 + ": " + validate(testString4));


    }

    public static String validate(String input) {
        if (input == null) {
            return "Invalid (null input)";
        }

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]*$"); // Regex for alphanumeric and underscore
        Matcher matcher = pattern.matcher(input);
        return matcher.matches() ? "Valid" : "Invalid";
    }
}
