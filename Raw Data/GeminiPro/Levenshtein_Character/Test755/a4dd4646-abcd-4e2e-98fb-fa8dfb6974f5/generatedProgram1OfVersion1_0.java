import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String inputString = "This string contains 123 numbers and !@#$ symbols.";
        String cleanedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Cleaned string: " + cleanedString);


        inputString = "NoSpecialChars";
        cleanedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Cleaned string: " + cleanedString);
    }

    public static String validate(String str) {
        // Regular expression to match non-alphanumeric characters
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]"); 
        Matcher matcher = pattern.matcher(str);

        // Replace all non-alphanumeric characters with an empty string
        return matcher.replaceAll("");
    }
}
