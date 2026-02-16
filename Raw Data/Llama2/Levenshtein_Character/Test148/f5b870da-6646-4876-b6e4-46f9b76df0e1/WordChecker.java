import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordChecker {

    static void checkExistance(String word, String item) {
        char[] wordChars = word.toCharArray();
        Arrays.sort(wordChars);
        char[] itemChars = item.toLowerCase().toCharArray(); // Case-insensitive check
        Arrays.sort(itemChars);


        int i = 0, j = 0;

        while (i < wordChars.length && j < itemChars.length) {
            if (wordChars[i] == itemChars[j]) {
                i++;
            }
            j++;
        }

        if (i == wordChars.length) { // All characters of 'word' found in 'item'
            System.out.println(item);
        }

    }

    public static void main(String[] args) {
        String word = "sun";
        List<String> items = new ArrayList<>(Arrays.asList("sunday", "unsung", "another", "sunshine", "son", "sound"));

        for (String item : items) {
            checkExistance(word, item);
        }
    }
}
