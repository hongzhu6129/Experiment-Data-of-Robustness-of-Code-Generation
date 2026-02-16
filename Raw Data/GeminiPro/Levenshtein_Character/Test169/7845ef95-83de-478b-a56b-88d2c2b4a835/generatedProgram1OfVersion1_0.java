import java.util.Arrays;

public class RemoveDuplicateWords {

    public static void main(String[] args) {
        String input = "the quick brown fox jumps over the lazy dog";
        String[] words = input.split(" ");

        // Sort the words to group duplicates together
        Arrays.sort(words);

        // Iterate over the sorted words and print each unique word
        String previousWord = "";
        for (String word : words) {
            if (!word.equals(previousWord)) {
                System.out.print(word + " ");
                previousWord = word;
            }
        }
    }
}
