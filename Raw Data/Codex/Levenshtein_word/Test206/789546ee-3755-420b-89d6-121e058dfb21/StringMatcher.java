import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {

    public static void main(String[] args) {
        String testString1 = "pq";
        String testString2 = "pqqqq";
        String testString3 = "p";
        String testString4 = "q";
        String testString5 = "pz";
        String testString6 = "ppq";


        System.out.println(testString1 + ": " + validate(testString1)); // true
        System.out.println(testString2 + ": " + validate(testString2)); // true
        System.out.println(testString3 + ": " + validate(testString3)); // true
        System.out.println(testString4 + ": " + validate(testString4)); // false
        System.out.println(testString5 + ": " + validate(testString5)); // false
        System.out.println(testString6 + ": " + validate(testString6)); // false


    }

    public static String validate(String input) {
        // Regular expression:  p followed by zero or more q's
        Pattern pattern = Pattern.compile("^pq*$"); // ^ matches the beginning, $ matches the end
        Matcher matcher = pattern.matcher(input);
        return String.valueOf(matcher.matches());
    }
}
