import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    /**
     * Checks if a given string contains the string 'pop', where the middle 'o' can be any character.
     *
     * @param str The input string.
     * @return True if the string contains "p.p", where "." represents any character; otherwise, false.
     */
    public boolean popInTheString(String str) {
        Pattern pattern = Pattern.compile("p.p"); // Regular expression for "p.p"
        Matcher matcher = pattern.matcher(str);
        return matcher.find(); 
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "pop";
        System.out.println(str1 + ": " + solution.popInTheString(str1)); // Output: true

        String str2 = "pxp";
        System.out.println(str2 + ": " + solution.popInTheString(str2)); // Output: true

        String str3 = "pOp";
        System.out.println(str3 + ": " + solution.popInTheString(str3)); // Output: true


        String str4 = "hellopop";
        System.out.println(str4 + ": " + solution.popInTheString(str4)); // Output: true

        String str5 = "helloxpxp";
        System.out.println(str5 + ": " + solution.popInTheString(str5)); // Output: true

        String str6 = "ppp";
        System.out.println(str6 + ": " + solution.popInTheString(str6)); // Output: true (because the first and second 'p' match "p.p", and then the second and third 'p' also match)


        String str7 = "abc";
        System.out.println(str7 + ": " + solution.popInTheString(str7)); // Output: false

        String str8 = "pp";
        System.out.println(str8 + ": " + solution.popInTheString(str8)); // Output: false
    }
}
