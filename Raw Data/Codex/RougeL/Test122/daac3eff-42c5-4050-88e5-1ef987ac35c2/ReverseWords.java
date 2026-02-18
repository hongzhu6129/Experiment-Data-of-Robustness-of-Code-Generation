import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static String WordsInReverse(String str) {
        if (str == null || str.trim().isEmpty()) {
            return ""; // Handle null or empty input
        }

        List<String> words = Arrays.asList(str.trim().split("\\s+")); // Split into words based on whitespace
        Collections.reverse(words); // Reverse the list of words
        return String.join(" ", words); // Join the words back into a string
    }

    public static void main(String[] args) {
        String str1 = "This is a sample string";
        System.out.println(WordsInReverse(str1)); // Output: string sample a is This

        String str2 = "  Leading and trailing spaces  ";
        System.out.println(WordsInReverse(str2)); // Output: spaces trailing and Leading

        String str3 = null;
        System.out.println(WordsInReverse(str3));  // Output: "" (empty string)

         String str4 = "";
        System.out.println(WordsInReverse(str4)); // Output: "" (empty string)

        String str5 = "SingleWord";
        System.out.println(WordsInReverse(str5)); // Output: SingleWord



    }
}
