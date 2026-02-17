import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexValidator {

    public static void main(String[] args) {
        String hex1 = "000000";
        String hex2 = "FFFFFF";
        String hex3 = "00FF00";
        String hex4 = "123456";
        String hex5 = "GGGGGG";
        String hex6 = "00000";
        String hex7 = "0000000";


        System.out.println(hex1 + ": " + validate(hex1));
        System.out.println(hex2 + ": " + validate(hex2));
        System.out.println(hex3 + ": " + validate(hex3));
        System.out.println(hex4 + ": " + validate(hex4));
        System.out.println(hex5 + ": " + validate(hex5));
        System.out.println(hex6 + ": " + validate(hex6));
        System.out.println(hex7 + ": " + validate(hex7));


    }

    public static boolean validate(String hexCode) {
        if (hexCode == null || hexCode.length() != 6) {
            return false;
        }

        // Regular expression for hex code validation
        String regex = "^[0-9a-fA-F]{6}$";  // Matches 6 hex characters
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(hexCode);

        return matcher.matches();
    }
}
