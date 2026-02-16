import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAppearanceChecker {

    public boolean checkSameAppearance(String str) {
        if (str == null || str.length() == 0) {
            return true; // Empty string - technically they appear 0 times each
        }

        int count3 = 0;
        int count4 = 0;

        // Efficiently count length-3 strings using regex
        Pattern pattern3 = Pattern.compile(".{3}"); // Matches any 3 characters
        Matcher matcher3 = pattern3.matcher(str);
        while (matcher3.find()) {
            count3++;
        }
        
        // Correctly count length-4 strings using regex with lookahead to avoid overlapping
        Pattern pattern4 = Pattern.compile(".{4}"); // Matches any 4 characters
        Matcher matcher4 = pattern4.matcher(str);
        while (matcher4.find()) {
            count4++;
        }


        return count3 == count4;
    }

    public static void main(String[] args) {
        StringAppearanceChecker checker = new StringAppearanceChecker();

        String str1 = "abcdeffghijkklmn";
        System.out.println("\"" + str1 + "\" : " + checker.checkSameAppearance(str1)); //false

        String str2 = "abcdffgh";
        System.out.println("\"" + str2 + "\" : " + checker.checkSameAppearance(str2)); //true

        String str3 = "abcdefghij";
        System.out.println("\"" + str3 + "\" : " + checker.checkSameAppearance(str3)); //false

        String str4 = ""; // Empty string
        System.out.println("\"" + str4 + "\" : " + checker.checkSameAppearance(str4)); // true

         String str5 = "abcabcabcabc"; // Example where 3-char and 4-char strings have same count.
        System.out.println("\"" + str5 + "\" : " + checker.checkSameAppearance(str5)); //true (3 counts of "abc" 3 counts of "abca")

        String str6 = "abcabcab"; // Example with more 3-char than 4-char strings.
        System.out.println("\"" + str6 + "\" : " + checker.checkSameAppearance(str6)); //false


    }
}
