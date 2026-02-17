import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoTripleRepetitions {

    public static boolean hasTripleRepetitions(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (int count : charCount.values()) {
            if (count >= 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(hasTripleRepetitions(s));
    }
}
