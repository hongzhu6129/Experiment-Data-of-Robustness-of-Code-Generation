import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {

    public static void main(String[] args) {
        String testString1 = "pHello Worldq";
        String testString2 = "pq";
        String testString3 = "pqq";
        String testString4 = "paq";
        String testString5 = "q";
        String testString6 = "p";
        String testString7 = "pqr";


        System.out.println(testString1 + ": " + validate(testString1)); // Output: true
        System.out.println(testString2 + ": " + validate(testString2)); // Output: true
        System.out.println(testString3 + ": " + validate(testString3)); // Output: true
        System.out.println(testString4 + ": " + validate(testString4)); // Output: true
        System.out.println(testString5 + ": " + validate(testString5)); // Output: false
        System.out.println(testString6 + ": " + validate(testString6)); // Output: false
        System.out.println(testString7 + ": " + validate(testString7)); // Output: true


    }

    public static String validate(String input) {
        // Regular expression pattern: starts with "p", followed by any characters, and ends with "q"
        Pattern pattern = Pattern.compile("^p.*q$"); 
        Matcher matcher = pattern.matcher(input);
        return String.valueOf(matcher.matches());
    }
}
