import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSentence {

    public static String reverse_str_word(String str) {
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String inputString = "The quick brown fox jumps over the lazy dog";
        String reversedString = reverse_str_word(inputString);
        System.out.println("Result: " + reversedString);
    }
}
