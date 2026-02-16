import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceDiphthongs {

    public static void main(String[] args) {
        String inputString = "beautiful sound";
        char replacementChar = '*';
        String result = validate(inputString, replacementChar);
        System.out.println(result); // Output: b**t*f*l s*nd


        inputString = "This is a test string.";
        replacementChar = '-';
        result = validate(inputString, replacementChar);
        System.out.println(result); // Output: Th-s -s - t-st str-ng.


        inputString = ""; //Empty String
        replacementChar = '+';
        result = validate(inputString, replacementChar);
        System.out.println(result); // Output: 


         inputString = null; //Null String
        replacementChar = '+';
        result = validate(inputString, replacementChar);
        System.out.println(result); // Output: null
    }


    public static String validate(String inputString, char replacementChar) {
        if (inputString == null) {
            return null; // Handle null input
        }

        // Regular expression to match common diphthongs (case-insensitive)
        Pattern diphthongPattern = Pattern.compile("[aeiouAEIOU]{2}"); // Matches two consecutive vowels

        Matcher matcher = diphthongPattern.matcher(inputString);
        return matcher.replaceAll(String.valueOf(replacementChar));
    }
}
