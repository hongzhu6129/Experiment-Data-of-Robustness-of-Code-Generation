import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String inputString = "This string @contains #special characters!";
        String validatedString = validate(inputString);
        System.out.println(validatedString); // Output: Thisstringcontainsspecialcharacters
    }

    public static String validate(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]"); // Matches any non-alphanumeric character
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll(""); // Replace all non-alphanumeric characters with empty string
    }
}
