import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexCodeValidator {

    public static void main(String[] args) {
        String hex1 = "#FF0000"; // Red
        String hex2 = "00FF00"; // Green
        String hex3 = "#0000FF"; // Blue
        String hex4 = "#1234567"; // Invalid (too long)
        String hex5 = "#FFGG00"; // Invalid characters
        String hex6 = "123"; // Invalid (too short, and no #)
        String hex7 = "#A7C421"; // valid, uppercase
        String hex8 = "#a7c421"; // valid, lowercase


        System.out.println(hex1 + ": " + validate(hex1)); // true
        System.out.println(hex2 + ": " + validate(hex2)); // true
        System.out.println(hex3 + ": " + validate(hex3)); // true
        System.out.println(hex4 + ": " + validate(hex4)); // false
        System.out.println(hex5 + ": " + validate(hex5)); // false
        System.out.println(hex6 + ": " + validate(hex6)); // false
        System.out.println(hex7 + ": " + validate(hex7)); // true
        System.out.println(hex8 + ": " + validate(hex8)); // true


    }

    public static boolean validate(String hexCode) {
        // Regular expression for valid hex codes (with or without #)
        String regex = "^#?[0-9a-fA-F]{6}$"; 

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(hexCode);
        return matcher.matches();
    }
}
