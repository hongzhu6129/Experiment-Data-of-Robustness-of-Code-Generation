import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOddLengthWords {

    public static void main(String[] args) {
        String inputString = "This is a test string with some words";
        String reversedString = test(inputString);
        System.out.println(reversedString);

        inputString = "Hello world";
        reversedString = test(inputString);
        System.out.println(reversedString);


        inputString = "EvenLength OddLength";
        reversedString = test(inputString);
        System.out.println(reversedString);
    }

    public static String test(String inputString) {
        if (inputString == null || inputString.trim().isEmpty()) {
            return ""; 
        }

        String[] words = inputString.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() % 2 != 0) { // Odd length
                List<String> letters = Arrays.asList(word.split(""));
                Collections.reverse(letters);
                result.append(String.join("", letters)).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim(); // Remove trailing space
    }
}
