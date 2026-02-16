import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static String WordsInReverse(String str) {
        if (str == null || str.trim().isEmpty()) {
            return str; // Handle null or empty strings
        }

        List<String> words = Arrays.asList(str.trim().split("\\s+")); // Split into words
        Collections.reverse(words); // Reverse the list of words
        return String.join(" ", words); // Join back with spaces
    }

    public static void main(String[] args) {
        String str1 = "This is a sample string";
        System.out.println(WordsInReverse(str1)); // Output: string sample a is This

        String str2 = "  leading and trailing spaces  ";
        System.out.println(WordsInReverse(str2)); // Output: spaces trailing and leading

        String str3 = null;
        System.out.println(WordsInReverse(str3)); // Output: null


        String str4 = "";
        System.out.println(WordsInReverse(str4)); // Output: "" (empty string)


        String str5 = "single";
        System.out.println(WordsInReverse(str5)); // Output: single

       String str6 = "   multiple   spaces   between   words   ";
        System.out.println(WordsInReverse(str6)); //Output: words between spaces multiple
    }
}
