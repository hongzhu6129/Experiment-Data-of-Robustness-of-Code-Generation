import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordChecker {

    static void checkExistance(String word, String item) {
        char[] wordChars = word.toCharArray();
        Arrays.sort(wordChars);
        char[] itemChars = item.toLowerCase().toCharArray();
        Arrays.sort(itemChars);

        String sortedWord = new String(wordChars);
        String sortedItem = new String(itemChars);


        if (sortedItem.indexOf(sortedWord) != -1) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> items = new ArrayList<>(Arrays.asList(
                "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sun", "day", "days", "say"
        ));
        String word = "sun"; // Example word

        for (String item : items) {
            checkExistance(word, item);
        }

         //another example
        items = new ArrayList<>(Arrays.asList(
                "roast", "coast", "toast", "sloppy"
        ));
        word = "oat"; // Example word

        for (String item : items) {
            checkExistance(word, item);
        }



    }
}
