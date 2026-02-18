import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

    public static void main(String[] args) {
        String phoneNumber1 = "123-456-7890";
        String phoneNumber2 = "(123) 456-7890";
        String phoneNumber3 = "1234567890";
        String phoneNumber4 = "123.456.7890";
        String phoneNumber5 = "+1 123-456-7890"; 
        String phoneNumber6 = "123-4567"; // Invalid
        String phoneNumber7 = "abc-def-ghij"; // Invalid


        System.out.println(phoneNumber1 + ": " + validate(phoneNumber1));
        System.out.println(phoneNumber2 + ": " + validate(phoneNumber2));
        System.out.println(phoneNumber3 + ": " + validate(phoneNumber3));
        System.out.println(phoneNumber4 + ": " + validate(phoneNumber4));
        System.out.println(phoneNumber5 + ": " + validate(phoneNumber5));
        System.out.println(phoneNumber6 + ": " + validate(phoneNumber6));
        System.out.println(phoneNumber7 + ": " + validate(phoneNumber7));

    }

    public static Boolean validate(String phoneNumber) {
        // Regular expression pattern to match various phone number formats
        // Matches:
        //  - XXX-XXX-XXXX
        //  - (XXX) XXX-XXXX
        //  - XXXXXXXXXX
        //  - XXX.XXX.XXXX
        //  - +1 XXX-XXX-XXXX (and similar international formats)
        String regex = "^(\\+\\d{1,3} )?\\(?\\d{3}\\)?[-. ]?\\d{3}[-. ]?\\d{4}$";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }
}
