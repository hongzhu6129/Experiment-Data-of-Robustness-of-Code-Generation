import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatch {

    public static void main(String[] args) {
        String testString1 = "paq";
        String testString2 = "p123q";
        String testString3 = "pq";
        String testString4 = "p1234";
        String testString5 = "123pq";


        System.out.println(testString1 + ": " + validate(testString1));
        System.out.println(testString2 + ": " + validate(testString2));
        System.out.println(testString3 + ": " + validate(testString3));
        System.out.println(testString4 + ": " + validate(testString4));
        System.out.println(testString5 + ": " + validate(testString5));

    }

    public static String validate(String input) {
        // Regular expression:  p followed by anything (.*) and ending with q
        Pattern pattern = Pattern.compile("^p.*q$"); 
        Matcher matcher = pattern.matcher(input);
        return matcher.matches() ? "Match" : "No Match";
    }
}
