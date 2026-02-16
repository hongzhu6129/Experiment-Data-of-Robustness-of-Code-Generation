import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatch {

    public static void main(String[] args) {
        String testString1 = "pq";
        String testString2 = "paaaq";
        String testString3 = "paq";
        String testString4 = "q";
        String testString5 = "p";
        String testString6 = "paaa";
        String testString7 = "apq";


        System.out.println(testString1 + ": " + validate(testString1)); // true
        System.out.println(testString2 + ": " + validate(testString2)); // true
        System.out.println(testString3 + ": " + validate(testString3)); // true
        System.out.println(testString4 + ": " + validate(testString4)); // false
        System.out.println(testString5 + ": " + validate(testString5)); // false
        System.out.println(testString6 + ": " + validate(testString6)); // false
        System.out.println(testString7 + ": " + validate(testString7)); // false
    }

    public static String validate(String input) {
        // Regular expression:  p followed by any characters and ending with q
        Pattern pattern = Pattern.compile("^p.*q$"); 
        Matcher matcher = pattern.matcher(input);
        return String.valueOf(matcher.matches());
    }
}
