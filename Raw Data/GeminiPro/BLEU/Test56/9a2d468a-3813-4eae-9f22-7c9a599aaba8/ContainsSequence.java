import java.util.Scanner;

public class ContainsSequence {

    public static boolean containsSequence(String str, String seq) {
        if (str == null || seq == null) {
            return false;
        }
        return str.indexOf(seq) != -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test cases
        String[] testCases = {
                "hello", "ll",
                "world", "wo",
                "banana", "na",
                "Mississippi", "ss",
                "", "",
                "a", "a",
                "abc", "bc",
                "abc", "abd",
                "abc", "a"
        };

        for (int i = 0; i < testCases.length; i += 2) {
            String str = testCases[i];
            String seq = testCases[i + 1];

            boolean result = containsSequence(str, seq);
            System.out.println(String.format("'%s' contains '%s': %s", str, seq, result));
        }
    }
}
