import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UppercaseLowercaseSequence {

    public static void main(String[] args) {
        String inputString = "aBCdEfgHIjklmnOPqrsTuVwXyZ";
        String validSequence = validate(inputString);
        System.out.println(validSequence); 

        inputString = "AbcDefGhIjKlMn";
        validSequence = validate(inputString);
        System.out.println(validSequence);

        inputString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        validSequence = validate(inputString);
        System.out.println(validSequence);

        inputString = "abcdefghijklmnopqrstuvwxyz";
        validSequence = validate(inputString);
        System.out.println(validSequence);



    }

    public static String validate(String inputString) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]+"); // Regex for one uppercase followed by one or more lowercase
        Matcher matcher = pattern.matcher(inputString);
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            result.append(matcher.group()).append(" "); // Append matched sequence to the result
        }

        if (result.length() > 0) {
            return result.toString().trim(); // Remove trailing space
        } else {
            return "No valid sequence found"; // Return message if no match found.
        }
    }
}
