import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String inputString = "This string contains 123 numbers and symbols like !@#$%^&*()_+=-`~[]\';/.,{}|:\"<>?";
        String cleanedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Cleaned string: " + cleanedString);


        inputString = "Hello123World";
        cleanedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Cleaned string: " + cleanedString);

    }

    public static String validate(String str) {
        if (str == null) {
            return null; // Or handle null as needed
        }

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]"); // Matches any non-alphanumeric character
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll(""); 
    }
}
