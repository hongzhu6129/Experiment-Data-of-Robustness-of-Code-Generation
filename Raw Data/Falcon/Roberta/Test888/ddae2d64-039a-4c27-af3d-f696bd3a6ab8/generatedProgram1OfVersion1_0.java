import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseLongWords {

    public static void main(String[] args) {
        String inputString = "This is a test string with some longer words like programming and algorithm.";
        String result = validate(inputString);
        System.out.println(result); 
    }

    public static String validate(String inputString) {
        if (inputString == null || inputString.trim().isEmpty()) {
            return ""; // Or handle null/empty as needed
        }

        String[] words = inputString.split("\\s+"); // Split by whitespace
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.length() > 3) {
                List<String> letters = Arrays.asList(word.split(""));
                Collections.reverse(letters);
                sb.append(String.join("", letters)).append(" ");
            } else {
                sb.append(word).append(" ");
            }
        }

        return sb.toString().trim();
    }
}



