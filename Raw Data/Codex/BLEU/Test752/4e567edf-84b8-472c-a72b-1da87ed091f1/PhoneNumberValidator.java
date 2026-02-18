import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

    public static void main(String[] args) {
        String phoneNumber1 = "123-456-7890";
        String phoneNumber2 = "(123) 456-7890";
        String phoneNumber3 = "1234567890";
        String phoneNumber4 = "123-4567890"; // Invalid
        String phoneNumber5 = "123456789";  // Invalid
        String phoneNumber6 = "123-456-7890x123"; // Invalid


        System.out.println(phoneNumber1 + ": " + validate(phoneNumber1));
        System.out.println(phoneNumber2 + ": " + validate(phoneNumber2));
        System.out.println(phoneNumber3 + ": " + validate(phoneNumber3));
        System.out.println(phoneNumber4 + ": " + validate(phoneNumber4));
        System.out.println(phoneNumber5 + ": " + validate(phoneNumber5));
        System.out.println(phoneNumber6 + ": " + validate(phoneNumber6));

    }

    public static Boolean validate(String phoneNumber) {
        // Regular expression to match various phone number formats
        //  Allows:
        //  - 123-456-7890
        //  - (123) 456-7890
        //  - 1234567890
         String regex = "^(?:\\(\\d{3}\\)\\s?\\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4}|\\d{10})$";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }
}
