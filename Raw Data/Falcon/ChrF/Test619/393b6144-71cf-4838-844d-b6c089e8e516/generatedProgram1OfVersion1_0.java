import java.util.Arrays;

public class LexicographicallySuggest {

    public static void main(String[] args) {
        // Test cases
        String[] words1 = {"apple", "banana", "cherry", "dog", "elephant"};
        String[] words2 = {"APPLE", "BaNaNa", "cheRRY", "DOG", "ELEPHANT"};
        String[] words3 = {"1", "2", "3", "4", "5"};
        String[] words4 = {"a", "b", "c", "d", "e"};
        String[] words5 = {"", "", "", "", ""};

        for (String[] words : Arrays.asList(words1, words2, words3, words4, words5)) {
            System.out.println(Arrays.toString(words));
            System.out.println(Arrays.toString(suggestTwoLexicographically(words)));
            System.out.println();
        }
    }

    public static String[] suggestTwoLexicographically(String[] words) {
        // Sort the words lexicographically, ignoring case differences
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        // Get the first and second words from the sorted array
        if (words.length >= 2) {
            return new String[] {words[0], words[1]};
        } else {
            return new String[] {};
        }
    }
}
