import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String inputString = "This string contains some #$%^&* non-alphanumeric characters!";
        String validatedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Validated string: " + validatedString);


        inputString = "123abcDEF456GHI";
        validatedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Validated string: " + validatedString);

        inputString = "";
        validatedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Validated string: " + validatedString);


        inputString = "   "; //spaces
        validatedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Validated string: " + validatedString);




    }

    public static String validate(String input) {
        if (input == null) {
            return null; // Or handle null as needed
        }
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]"); // Matches any non-alphanumeric character
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("");


    }
}
