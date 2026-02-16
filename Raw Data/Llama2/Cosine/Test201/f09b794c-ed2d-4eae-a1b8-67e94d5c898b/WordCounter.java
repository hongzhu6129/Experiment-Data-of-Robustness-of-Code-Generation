import java.util.StringTokenizer;

public class WordCounter {

    public static void main(String[] args) {
        String inputString = "the quick brown fox jumps over the lazy dog.";
        int wordCount = count_Words(inputString);
        System.out.println("Number of words: " + wordCount);
    }

    public static int count_Words(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        StringTokenizer tokenizer = new StringTokenizer(str); // Use StringTokenizer for simplicity
        return tokenizer.countTokens();
    }
}
