import java.util.Arrays;
import java.util.List;

public class CheckWordCharacters {

    static void checkExistance(String word, String listItem) {
        char[] wordChars = word.toCharArray();
        Arrays.sort(wordChars);
        char[] itemChars = listItem.toLowerCase().toCharArray(); // Case-insensitive comparison
        Arrays.sort(itemChars);

        int i = 0, j = 0;
        while (i < wordChars.length && j < itemChars.length) {
            if (wordChars[i] == itemChars[j]) {
                i++;
            }
            j++;
        }

        if (i == wordChars.length) { // All characters of the word are present in the list item
            System.out.println(listItem);
        }
    }


    public static void main(String[] args) {
        String word = "sun";
        List<String> listItems = Arrays.asList("sunday", "unsung", "sunscreen", "another", "rainsun");

        for (String item : listItems) {
            checkExistance(word, item);
        }
    }
}
