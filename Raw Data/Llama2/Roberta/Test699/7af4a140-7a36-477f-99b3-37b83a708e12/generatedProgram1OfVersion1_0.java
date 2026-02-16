import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

    public static void main(String[] args) {
        String phoneNumber1 = "123-456-7890";
        String phoneNumber2 = "(123) 456-7890";
        String phoneNumber3 = "1234567890";
        String phoneNumber4 = "123-4567890"; // Invalid
        String phoneNumber5 = "123-456-789"; // Invalid
        String phoneNumber6 = "+1 (123) 456-7890"; // Valid with country code

        System.out.println(phoneNumber1 + ": " + validate(phoneNumber1)); // true
        System.out.println(phoneNumber2 + ": " + validate(phoneNumber2)); // true
        System.out.println(phoneNumber3 + ": " + validate(phoneNumber3)); // true
        System.out.println(phoneNumber4 + ": " + validate(phoneNumber4)); // false
        System.out.println(phoneNumber5 + ": " + validate(phoneNumber5)); // false
        System.out.println(phoneNumber6 + ": " + validate(phoneNumber6)); // true

    }


    public static Boolean validate(String phoneNumber) {
        // Regular expression pattern to match various phone number formats.
        //  Explanation of the regex:
        //      ^            Start of the string
        //      (?:\\+\\d+)? Optional country code (e.g., +1)
        //      \\s*         Optional whitespace
        //      (?:\\(\\d{3}\\)|\\d{3})  Area code (either in parentheses or not)
        //      [\\s-]*      Optional whitespace or hyphen
        //      \\d{3}        Three digits
        //      [\\s-]*      Optional whitespace or hyphen
        //      \\d{4}        Four digits
        //      $            End of the string

        String regex = "^(?:\\+\\d+)?\\s*(?:\\(\\d{3}\\)|\\d{3})[\\s-]*\\d{3}[\\s-]*\\d{4}$";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();


    }

}
