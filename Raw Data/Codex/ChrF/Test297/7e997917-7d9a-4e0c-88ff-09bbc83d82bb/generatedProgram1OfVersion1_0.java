import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeCharItems {

    static void checkExistance(String word, String item) {
        if (item.length() >= 3) {
            for (int i = 0; i <= item.length() - 3; i++) {
                String sub = item.substring(i, i + 3);
                if (word.contains(sub)) {
                    System.out.println(item);
                    return; // Print only once if a 3-char sequence is found
                }
            }
        }
    }

    public static void main(String[] args) {
        String word = "fantastic"; // Example word
        List<String> items = Arrays.asList("fan", "tas", "tic", "anta", "ntic", "hello", "world", "fantasy");

        System.out.println("Items containing three characters of \"" + word + "\":");

        for (String item : items) {
            checkExistance(word, item);
        }
    }
}
