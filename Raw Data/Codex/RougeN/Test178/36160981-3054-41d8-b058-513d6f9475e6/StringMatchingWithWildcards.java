import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatchingWithWildcards {

    public static boolean match(String text, String pattern) {
        Pattern regex = Pattern.compile(pattern.replace("*", ".*"));
        Matcher matcher = regex.matcher(text);
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Test cases

        // Case 1: Exact match
        System.out.println(match("hello", "hello")); // true

        // Case 2: Wildcard match
        System.out.println(match("helloworld", "hello*")); // true

        // Case 3: Multiple wildcard match
        System.out.println(match("helloworldthere", "hello*there")); // true

        // Case 4: No match
        System.out.println(match("helloworld", "bye*")); // false

        // Corner cases

        // Case 5: Empty text
        System.out.println(match("", "hello")); // false

        // Case 6: Empty pattern
        System.out.println(match("helloworld", "")); // true

        // Case 7: Multiple asterisks
        System.out.println(match("helloworld", "hel**o*")); // true
    }
}
