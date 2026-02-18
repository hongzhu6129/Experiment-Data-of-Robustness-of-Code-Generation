import java.util.Arrays;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }
        return sb.toString().trim();
    }
}
