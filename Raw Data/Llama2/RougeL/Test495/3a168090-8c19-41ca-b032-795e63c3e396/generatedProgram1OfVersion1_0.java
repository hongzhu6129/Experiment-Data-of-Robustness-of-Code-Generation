import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {

    public static void main(String[] args) {
        String testString1 = "paq";
        String testString2 = "p123q";
        String testString3 = "pq";
        String testString4 = "p q";
        String testString5 = "pa";
        String testString6 = "q";
        String testString7 = "p12345q";


        System.out.println(testString1 + ": " + validate(testString1)); // Output: true
        System.out.println(testString2 + ": " + validate(testString2)); // Output: true
        System.out.println(testString3 + ": " + validate(testString3)); // Output: true
        System.out.println(testString4 + ": " + validate(testString4)); // Output: true
        System.out.println(testString5 + ": " + validate(testString5)); // Output: false
        System.out.println(testString6 + ": " + validate(testString6)); // Output: false
        System.out.println(testString7 + ": " + validate(testString7)); // Output: true

    }

    public static String validate(String input) {
        // Regular expression:  p followed by anything (.*) and ending with q
        Pattern pattern = Pattern.compile("^p.*q$"); 
        Matcher matcher = pattern.matcher(input);
        return String.valueOf(matcher.matches());
    }
}
