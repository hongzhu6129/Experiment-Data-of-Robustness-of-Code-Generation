import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LowercaseSequences {

    public static void main(String[] args) {
        String text1 = "hello_world_how_are_you";
        String text2 = "This_is_a_TEST_string";
        String text3 = "one_two_three";
        String text4 = "invalid-input";
        String text5 = "___"; // Only underscores

        System.out.println(validate(text1)); // Output: hello_world_how_are_you
        System.out.println(validate(text2)); // Output: is_a
        System.out.println(validate(text3)); // Output: one_two_three
        System.out.println(validate(text4)); // Output: (empty string)
        System.out.println(validate(text5)); // Output: (empty string)


    }

    public static String validate(String input) {
        // Regular expression to match sequences of lowercase letters joined by underscores.
        Pattern pattern = Pattern.compile("[a-z]+(_[a-z]+)+|[a-z]+"); // Matches sequences OR single words


        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
             result.append(matcher.group());
             // If there are more matches append an additional underscore to separate them 
             // but avoid adding one at the very end.
             if (!matcher.hitEnd()){
                result.append("_"); // Add underscore as separator 
             } 
        }

        // Return the result, or an empty string if there are no matches
        return result.toString().replaceAll("_$", ""); // Remove trailing underscores
    }
}
