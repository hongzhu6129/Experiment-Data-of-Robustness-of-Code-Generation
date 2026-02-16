import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static String WordsInReverse(String str) {
        if (str == null || str.trim().isEmpty()) {
            return ""; // Handle null or empty input
        }

        List<String> words = Arrays.asList(str.split("\\s+")); // Split into words
        Collections.reverse(words); // Reverse the list of words

        return String.join(" ", words); // Join the reversed words back into a string
    }

    public static void main(String[] args) {
        String str1 = "the sky is blue";
        String reversedStr1 = WordsInReverse(str1);
        System.out.println(reversedStr1); // Output: blue is sky the

        String str2 = "  hello world  ";
        String reversedStr2 = WordsInReverse(str2);
        System.out.println(reversedStr2); // Output: world hello

        String str3 = ""; // Empty string
        String reversedStr3 = WordsInReverse(str3);
        System.out.println(reversedStr3); // Output: ""

        String str4 = null; // Null string
        String reversedStr4 = WordsInReverse(str4);
        System.out.println(reversedStr4); // Output: ""


        String str5 = "a good example";
        String reversedStr5 = WordsInReverse(str5);
        System.out.println(reversedStr5); // Output: example good a
    }
}
