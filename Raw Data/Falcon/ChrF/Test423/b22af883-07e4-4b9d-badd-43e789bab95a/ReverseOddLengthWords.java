import java.util.*;
import java.lang.*;

public class ReverseOddLengthWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 != 0) {
                words[i] = reverse(words[i]);
            }
        }
        System.out.println(String.join(" ", words));
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
