import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAppearanceChecker {

    public boolean checkSameAppearance(String str) {
        if (str == null || str.length() == 0) {
            return true; // Empty string - consider lengths 3 & 4 appear 0 times.
        }

        Pattern pattern3 = Pattern.compile("\\b\\w{3}\\b"); // Matches words of length 3
        Pattern pattern4 = Pattern.compile("\\b\\w{4}\\b"); // Matches words of length 4

        Matcher matcher3 = pattern3.matcher(str);
        Matcher matcher4 = pattern4.matcher(str);

        int count3 = 0;
        while (matcher3.find()) {
            count3++;
        }

        int count4 = 0;
        while (matcher4.find()) {
            count4++;
        }

        return count3 == count4;
    }

    public static void main(String[] args) {
        StringAppearanceChecker checker = new StringAppearanceChecker();

        String str1 = "This is a test string with some words like four and five";
        System.out.println("\"" + str1 + "\" : " + checker.checkSameAppearance(str1));

        String str2 = "One two three four five six seven eight";
        System.out.println("\"" + str2 + "\" : " + checker.checkSameAppearance(str2));

        String str3 = "Cat dog bird fish"; // Length 3 appears more
        System.out.println("\"" + str3 + "\" : " + checker.checkSameAppearance(str3));

        String str4 = "Java code test long"; // Length 4 appears more
        System.out.println("\"" + str4 + "\" : " + checker.checkSameAppearance(str4));


        String str5 = ""; // Empty string
        System.out.println("\"" + str5 + "\" : " + checker.checkSameAppearance(str5));


        String str6 = "123 4567 abc defg";
        System.out.println("\"" + str6 + "\" : " + checker.checkSameAppearance(str6));
    }
}
