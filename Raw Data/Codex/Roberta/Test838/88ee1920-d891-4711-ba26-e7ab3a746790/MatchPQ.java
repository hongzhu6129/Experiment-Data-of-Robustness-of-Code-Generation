import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPQ {

    public static void main(String[] args) {
        String testString1 = "pq";
        String testString2 = "p";
        String testString3 = "pqqqqq";
        String testString4 = "pqr";
        String testString5 = "qp";
        String testString6 = "xyz";


        System.out.println(testString1 + ": " + validate(testString1)); // true
        System.out.println(testString2 + ": " + validate(testString2)); // true
        System.out.println(testString3 + ": " + validate(testString3)); // true
        System.out.println(testString4 + ": " + validate(testString4)); // false
        System.out.println(testString5 + ": " + validate(testString5)); // false
        System.out.println(testString6 + ": " + validate(testString6)); // false


    }

    public static String validate(String text) {
        Pattern pattern = Pattern.compile("^pq*$"); // Matches "p" followed by zero or more "q"s
        Matcher matcher = pattern.matcher(text);
        return String.valueOf(matcher.matches());
    }
}
