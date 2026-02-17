import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PQMatcher {

    public static void main(String[] args) {
        String testString1 = "pq";
        String testString2 = "p";
        String testString3 = "pqqqq";
        String testString4 = "pqr";
        String testString5 = "qpp";

        System.out.println(testString1 + ": " + validate(testString1)); // Expected: true
        System.out.println(testString2 + ": " + validate(testString2)); // Expected: true
        System.out.println(testString3 + ": " + validate(testString3)); // Expected: true
        System.out.println(testString4 + ": " + validate(testString4)); // Expected: false
        System.out.println(testString5 + ": " + validate(testString5)); // Expected: false

    }

    public static String validate(String input) {
        // Regular expression:  p followed by zero or more q's
        Pattern pattern = Pattern.compile("^pq*$"); // ^ matches the beginning, $ matches the end
        Matcher matcher = pattern.matcher(input);
        return String.valueOf(matcher.matches()); 
    }
}
