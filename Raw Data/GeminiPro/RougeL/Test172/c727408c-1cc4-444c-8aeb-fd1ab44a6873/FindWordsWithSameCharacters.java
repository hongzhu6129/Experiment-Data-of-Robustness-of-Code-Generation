import java.util.ArrayList;
import java.util.List;

public class FindWordsWithSameCharacters {

    public static void main(String[] args) {
        // List of words
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("dog");
        words.add("cat");

        // Sort the words alphabetically
        words.sort(String::compareToIgnoreCase);

        // Print words that contain the same characters
        System.out.println("Words that contain the same characters:");
        for (int i = 0; i < words.size() - 1; i++) {
            if (words.get(i).toUpperCase().equals(words.get(i + 1).toUpperCase())) {
                System.out.println(words.get(i));
            }
        }
    }
}
