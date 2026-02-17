import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {

    public void reverseEachWordInString(String inputString) {
        if (inputString == null || inputString.trim().isEmpty()) {
            System.out.println(""); // Handle empty or null input
            return;
        }

        List<String> words = Arrays.asList(inputString.split("\\s+")); // Split into words
        Collections.reverse(words); //Not reversing each word, just their order in the sentence
        

        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
           String reversedWord = new StringBuilder(word).reverse().toString();
           reversedString.append(reversedWord).append(" ");

        }

        System.out.println(reversedString.toString().trim()); // Print the reversed string
    }


    public static void main(String[] args) {
        ReverseWordsInString reverser = new ReverseWordsInString();

        reverser.reverseEachWordInString("This is a test string");       // Output: gnirts tset a si sihT
        reverser.reverseEachWordInString("Hello World");               // Output: dlroW olleH
        reverser.reverseEachWordInString("One");                     // Output: enO
        reverser.reverseEachWordInString("");                          // Output: (empty line)
        reverser.reverseEachWordInString(null);                         // Output: (empty line)
        reverser.reverseEachWordInString(" Leading and trailing spaces "); // Output: secaps gnialirt dna gnidaL


    }
}
