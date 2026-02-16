import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UnderscoreSequences {

    public static void main(String[] args) {
        String input1 = "hello_world";
        String input2 = "Java_programming_is_fun";
        String input3 = "This_is_a_test_string";
        String input4 = "invalid_Sequence123"; 
        String input5 = "another_valid_one";

        System.out.println(input1 + ": " + validate(input1));
        System.out.println(input2 + ": " + validate(input2));
        System.out.println(input3 + ": " + validate(input3));
        System.out.println(input4 + ": " + validate(input4));
        System.out.println(input5 + ": " + validate(input5));
    }

    public static String validate(String input) {
        Pattern pattern = Pattern.compile("^[a-z]+(_[a-z]+)*$"); // Matches sequences of lowercase letters joined by underscores.
        Matcher matcher = pattern.matcher(input);
        return matcher.matches() ? "Valid" : "Invalid";
    }
}
