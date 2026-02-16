import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static String WordsInReverse(String str) {
        if (str == null || str.trim().isEmpty()) {
            return ""; // Handle empty or null input
        }

        List<String> words = Arrays.asList(str.trim().split("\\s+")); // Split into words
        Collections.reverse(words); // Reverse the list of words
        return String.join(" ", words); // Join back into a string

    }

    public static void main(String[] args) {
        String str1 = "This is a test string";
        String reversedStr1 = WordsInReverse(str1);
        System.out.println("Original string: " + str1);
        System.out.println("Reversed string: " + reversedStr1);


        String str2 = " leading and trailing spaces  ";
        String reversedStr2 = WordsInReverse(str2);
        System.out.println("Original string: " + str2);
        System.out.println("Reversed string: " + reversedStr2);


        String str3 = null; // Test null input
        String reversedStr3 = WordsInReverse(str3);
        System.out.println("Original string: " + str3);
        System.out.println("Reversed string: " + reversedStr3);

        String str4 = " "; // Test empty string
        String reversedStr4 = WordsInReverse(str4);
        System.out.println("Original string: " + str4);
        System.out.println("Reversed string: " + reversedStr4);


        String str5 = "single";
        String reversedStr5 = WordsInReverse(str5);
        System.out.println("Original string: " + str5);
        System.out.println("Reversed string: " + reversedStr5);
    }
}
