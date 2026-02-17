import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {

    public static void main(String[] args) {
        String testString1 = "HelloWorld123";
        String testString2 = "HelloWorld!@#";

        System.out.println(testString1 + ": " + validate(testString1)); // Output: true
        System.out.println(testString2 + ": " + validate(testString2)); // Output: false
    }

    public static boolean validate(String str) {
        if (str == null || str.isEmpty()) {
            return true; // Or false, depending on how you want to handle empty/null strings
        }

        // Regular expression to match only a-z, A-Z, and 0-9
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");  // ^ and $ ensure the whole string matches
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
