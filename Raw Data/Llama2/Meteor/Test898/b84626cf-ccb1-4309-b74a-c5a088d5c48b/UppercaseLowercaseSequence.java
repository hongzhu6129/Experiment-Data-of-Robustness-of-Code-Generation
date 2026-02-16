import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UppercaseLowercaseSequence {

    public static void main(String[] args) {
        String text = "This Is A Test String With Some UpperCase and lowercase Letters. Abc Def Ghi Jkl.";
        String validatedText = validate(text);
        System.out.println(validatedText); 
    }

    public static String validate(String text) {
        if (text == null || text.isEmpty()) {
            return ""; // Or handle null/empty as needed
        }

        Pattern pattern = Pattern.compile("[A-Z][a-z]+"); // Regex for Uppercase followed by lowercase
        Matcher matcher = pattern.matcher(text);

        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            result.append(matcher.group()).append(" "); // Add matched sequence and a space
        }

        return result.toString().trim(); // Remove trailing space if any
    }
}
