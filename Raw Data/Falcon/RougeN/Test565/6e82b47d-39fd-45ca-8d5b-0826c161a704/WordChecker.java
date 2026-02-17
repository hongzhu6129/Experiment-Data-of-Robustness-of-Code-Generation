import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordChecker {

    static void checkExistance(String word, String item) {
        char[] wordChars = word.toLowerCase().toCharArray();
        Arrays.sort(wordChars);
        char[] itemChars = item.toLowerCase().toCharArray();
        Arrays.sort(itemChars);

        int i = 0;
        int j = 0;

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
        String word = "sun";
        List<String> items = new ArrayList<>(Arrays.asList("sunday", "unsung", "round", "sound", "nuts"));

        for (String item : items) {
            checkExistance(word, item);
        }


       // Additional test cases as per examples
        word = "ab";
        items = new ArrayList<>(Arrays.asList("aabbccdd","ab","ac","ad"));
        for (String item : items) {
            checkExistance(word, item);
        }

        word = "Sun";
        items = new ArrayList<>(Arrays.asList("sunday", "unsung", "round","Sound", "nuts")); // Note "Sound" now
        for (String item : items) {
            checkExistance(word, item);
        }
        
          word = "ali";
        items = new ArrayList<>(Arrays.asList("alien", "mail","tailor","ail","pail"));
        for (String item : items) {
            checkExistance(word, item);
        }



    }
}
