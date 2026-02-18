import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveNonAlphanumericFromDouble {

    public static void main(String[] args) {
        double num1 = 123.456;
        double num2 = 123.456abcd; // Example with non-alphanumeric characters

        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);


        System.out.println("Original String 1: " + str1);
        System.out.println("Validated String 1: " + validate(str1));

        System.out.println("Original String 2: " + str2);
        System.out.println("Validated String 2: " + validate(str2));


    }

    public static String validate(String str) {
        // Use a regular expression to remove non-alphanumeric characters
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9.]"); // Allow digits, letters and decimal point
        Matcher matcher = pattern.matcher(str);
        return matcher.replaceAll("");
    }
}
