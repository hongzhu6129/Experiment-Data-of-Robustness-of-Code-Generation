import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordChecker {

    static void checkExistance(String word, String item) {
        char[] wordChars = word.toLowerCase().toCharArray();
        Arrays.sort(wordChars);
        char[] itemChars = item.toLowerCase().toCharArray();
        Arrays.sort(itemChars);

        int i = 0, j = 0;

        while (i < wordChars.length && j < itemChars.length) {
            if (wordChars[i] == itemChars[j]) {
                i++;
            }
            j++;
        }

        if (i == wordChars.length) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        String word = "sun"; // The word to check against
        List<String> items = new ArrayList<>(Arrays.asList(  // Sample list of items
                "sunday", "unsung", "another", "stone", "nut", "suns", "unto" , "son"
        ));


        System.out.println("Items containing all characters of '" + word + "':");

        for (String item : items) {
            checkExistance(word, item);
        }
    }
}



