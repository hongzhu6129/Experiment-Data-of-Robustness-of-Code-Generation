import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {

    public void reverseEachWordInString(String inputString) {
        if (inputString == null || inputString.trim().isEmpty()) {
            System.out.println(""); // Handle null or empty input
            return;
        }

        String[] words = inputString.split("\\s+"); // Split the string into words
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedString.append(reversedWord).append(" ");
        }

        System.out.println(reversedString.toString().trim()); // Print the reversed string
    }

    public static void main(String[] args) {
        ReverseWordsInString reverser = new ReverseWordsInString();

        reverser.reverseEachWordInString("This is a sample string");  // Output: sihT si a elpmas gnirts
        reverser.reverseEachWordInString("Hello World");          // Output: olleH dlroW
        reverser.reverseEachWordInString(null);                  // Output: (empty line)
        reverser.reverseEachWordInString(" ");                    // Output: (empty line) 
        reverser.reverseEachWordInString(" Leading and trailing spaces "); //Output: gnidael dna gnilrailt secaps
    }
}


