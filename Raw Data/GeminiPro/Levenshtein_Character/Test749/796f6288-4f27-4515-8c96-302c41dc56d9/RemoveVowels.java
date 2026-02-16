import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveVowels {

    public static void main(String[] args) {
        String inputString = "This is a test string.";
        String updatedString = validate(inputString);
        System.out.println(updatedString); // Output: Ths s  tst strng.


        inputString = "Hello World!";
        updatedString = validate(inputString);
        System.out.println(updatedString); // Output: Hll Wrld!
    }

    public static String validate(String input) {
        if (input == null) {
            return null; // Or handle null as needed
        }
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("");


    }
}
