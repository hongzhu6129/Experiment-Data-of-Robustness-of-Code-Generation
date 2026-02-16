import java.util.HashMap;
import java.util.Map;

public class DistinctIdentifiers {

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"", "a", "aa", "aaa", "abc", "abca", "abcab", "abcdefghijklmnopqrstuvwxyz"};
        for (String testCase : testCases) {
            System.out.println("Input: " + testCase);
            Map<String, Integer> distinctIdentifiers = createDistinctIdentifiers(testCase);
            System.out.println("Output: " + distinctIdentifiers);
            System.out.println();
        }
    }

    public static Map<String, Integer> createDistinctIdentifiers(String input) {
        Map<String, Integer> distinctIdentifiers = new HashMap<>();
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            String prefix = input.substring(0, i + 1);
            if (!distinctIdentifiers.containsKey(prefix)) {
                distinctIdentifiers.put(prefix, count++);
            }
        }
        return distinctIdentifiers;
    }
}
