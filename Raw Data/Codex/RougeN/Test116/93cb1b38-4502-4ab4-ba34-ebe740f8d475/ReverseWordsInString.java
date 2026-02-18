import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {

    public void reverseEachWordInString(String str) {
        if (str == null || str.trim().isEmpty()) {
            System.out.println(""); // Handle null or empty input
            return;
        }

        List<String> words = Arrays.asList(str.split("\\s+")); // Split into words
        Collections.reverse(words); // Reverse the order of words  (Optional, for reversing word order in the whole string)
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            reversedString.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        System.out.println(reversedString.toString().trim());
    }


    public static void main(String[] args) {
        ReverseWordsInString reverser = new ReverseWordsInString();

        reverser.reverseEachWordInString("This is a test string"); // Output: sihT si a tset gnirts
        reverser.reverseEachWordInString("Hello World");        // Output: olleH dlroW
        reverser.reverseEachWordInString(null);               // Output: (empty line)
        reverser.reverseEachWordInString("");                 // Output: (empty line)
         reverser.reverseEachWordInString(" leading and trailing spaces "); //Output:  gnidail dna gnidael secaps
    }
}
