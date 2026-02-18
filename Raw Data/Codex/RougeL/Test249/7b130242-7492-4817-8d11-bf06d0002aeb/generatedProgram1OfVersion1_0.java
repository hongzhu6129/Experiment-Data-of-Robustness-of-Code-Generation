import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {

    public static void main(String[] args) {
        String testString1 = "pq";
        String testString2 = "p";
        String testString3 = "pqqqq";
        String testString4 = "pqr"; 
        String testString5 = "qp";

        System.out.println(testString1 + ": " + validate(testString1)); // Output: true
        System.out.println(testString2 + ": " + validate(testString2)); // Output: true
        System.out.println(testString3 + ": " + validate(testString3)); // Output: true
        System.out.println(testString4 + ": " + validate(testString4)); // Output: false
        System.out.println(testString5 + ": " + validate(testString5)); // Output: false
    }

    public static String validate(String input) {
        // Regular expression pattern: p followed by zero or more q's
        Pattern pattern = Pattern.compile("^pq*$"); 
        Matcher matcher = pattern.matcher(input);
        return String.valueOf(matcher.matches());
    }
}
