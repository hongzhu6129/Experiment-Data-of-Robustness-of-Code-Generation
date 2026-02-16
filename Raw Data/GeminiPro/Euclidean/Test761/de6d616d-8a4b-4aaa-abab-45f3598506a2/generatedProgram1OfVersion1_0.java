import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static void main(String[] args) {
        String inputString = "This is a sample string with some longer words";
        String reversedString = validate(inputString);
        System.out.println(reversedString); 

        inputString = "No reversal here";
        reversedString = validate(inputString);
        System.out.println(reversedString);
    }

    public static String validate(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return inputString; // Or handle as needed for null/empty input
        }

        String[] words = inputString.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 3) {
                List<String> charList = Arrays.asList(word.split(""));
                Collections.reverse(charList);
                result.append(String.join("", charList)).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}
