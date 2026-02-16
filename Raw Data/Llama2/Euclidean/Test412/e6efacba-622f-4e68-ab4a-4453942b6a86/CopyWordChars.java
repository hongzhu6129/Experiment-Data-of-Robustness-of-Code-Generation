import java.util.ArrayList;
import java.util.List;

public class CopyWordChars {

    static void checkExistance(String word, String dummy) {
        if (word == null || word.isEmpty()) {
            System.out.println("Input word is empty or null.");
            return;
        }

        List<Character> charList = new ArrayList<>();
        for (char c : word.toCharArray()) {
            charList.add(c);
        }

        System.out.println("Copied character list: " + charList);
    }

    public static void main(String[] args) {
        String word1 = "hello";
        checkExistance(word1, ""); // The second argument is unused, but required for signature

        String word2 = "world";
        checkExistance(word2, "");

        String word3 = ""; // Test empty string
        checkExistance(word3, "");

        String word4 = null; // Test null string
        checkExistance(word4, "");
    }
}
