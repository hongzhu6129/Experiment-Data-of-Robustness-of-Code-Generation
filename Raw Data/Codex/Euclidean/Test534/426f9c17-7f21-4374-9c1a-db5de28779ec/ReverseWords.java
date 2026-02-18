import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static String WordsInReverse(String str) {
        if (str == null || str.trim().isEmpty()) {
            return ""; // Handle null or empty input
        }

        List<String> words = Arrays.asList(str.trim().split("\\s+")); // Split into words
        Collections.reverse(words); // Reverse the list of words
        return String.join(" ", words); // Join back into a string
    }

    public static void main(String[] args) {
        String str1 = "the sky is blue";
        System.out.println("Reversed string: " + WordsInReverse(str1)); // Output: blue is sky the

        String str2 = "  hello world  ";
        System.out.println("Reversed string: " + WordsInReverse(str2)); // Output: world hello

        String str3 = null;
        System.out.println("Reversed string: " + WordsInReverse(str3)); // Output: "" (empty string)

        String str4 = " ";
        System.out.println("Reversed string: " + WordsInReverse(str4)); // Output: "" (empty string)


         String str5 = "a good   example";
        System.out.println("Reversed string: " + WordsInReverse(str5)); // Output: example good a
    }
}
