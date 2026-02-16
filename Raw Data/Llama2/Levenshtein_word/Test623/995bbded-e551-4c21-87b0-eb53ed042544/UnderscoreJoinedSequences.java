import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UnderscoreJoinedSequences {

    public static void main(String[] args) {
        String text = "hello_world this_is_a_test another_example";
        String validatedText = validate(text);
        System.out.println(validatedText); 

        text = "invalid-input_with_symbols123";
        validatedText = validate(text);
        System.out.println(validatedText);

        text =  " just_a_test"; // Leading space
        validatedText = validate(text);
        System.out.println(validatedText);


        text = ""; // Empty String
        validatedText = validate(text);
        System.out.println(validatedText);


         text = null;
        validatedText = validate(text);
        System.out.println(validatedText);
    }

    public static String validate(String text) {
        if (text == null || text.isEmpty()) {
            return ""; // Or handle null/empty as needed
        }

        Pattern pattern = Pattern.compile("[a-z]+(_[a-z]+)+"); // Match sequences
        Matcher matcher = pattern.matcher(text);

        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group()).append(" "); // Add matched sequence
        }

        return result.toString().trim();  // Remove trailing space if any
    }
}
