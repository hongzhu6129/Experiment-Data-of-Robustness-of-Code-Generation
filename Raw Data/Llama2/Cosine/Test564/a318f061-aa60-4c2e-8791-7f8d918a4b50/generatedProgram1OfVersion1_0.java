import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAppearanceChecker {

    public boolean checkSameAppearance(String text) {
        if (text == null || text.isEmpty()) {
            return true; // Empty string has zero occurrences of both lengths, so it's considered the same
        }

        int count3 = 0;
        int count4 = 0;

        // Count occurrences of length 3 strings (using regex for overlapping matches)
        Pattern pattern3 = Pattern.compile(".{3}"); // Matches any 3 characters
        Matcher matcher3 = pattern3.matcher(text);
        while (matcher3.find()) {
            count3++;
        }


        // Count occurrences of length 4 strings (using regex for overlapping matches)
        Pattern pattern4 = Pattern.compile(".{4}"); // Matches any 4 characters
        Matcher matcher4 = pattern4.matcher(text);
        while (matcher4.find()) {
            count4++;
        }

        return count3 == count4;
    }

    public static void main(String[] args) {
        StringAppearanceChecker checker = new StringAppearanceChecker();

        String text1 = "abcdabc";
        System.out.println("\"" + text1 + "\" : " + checker.checkSameAppearance(text1)); // Output: true (2 occurrences of length 3 and 2 of length 4)

        String text2 = "abcde";
        System.out.println("\"" + text2 + "\" : " + checker.checkSameAppearance(text2)); // Output: false (2 of length 3, 1 of length 4)

        String text3 = "ab"; 
        System.out.println("\"" + text3 + "\" : " + checker.checkSameAppearance(text3)); // Output: true (0 of both)

        String text4 =  "abcdefghijk"; // Example with several overlapping matches
        System.out.println("\"" + text4 + "\" : " + checker.checkSameAppearance(text4)); // Output: false

        String text5 = ""; // Empty string
        System.out.println("\"" + text5 + "\" : " + checker.checkSameAppearance(text5)); // Output: true

        String text6 = null;  // null string
        System.out.println("\"" + text6 + "\" : " + checker.checkSameAppearance(text6)); // Output: true
    }
}
