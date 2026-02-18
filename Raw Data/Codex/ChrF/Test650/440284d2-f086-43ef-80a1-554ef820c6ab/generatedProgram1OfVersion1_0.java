import java.util.HashMap;
import java.util.Map;

public class CanonicalProportionalString {

    public static String getCanonicalProportionalString(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        // Count the occurrences of each character
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : str.toLowerCase().toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Find the highest occurrence count
        int maxCount = 0;
        for (int count : charCounts.values()) {
            maxCount = Math.max(maxCount, count);
        }

        // Build the canonical proportional string
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            int proportion = count * 100 / maxCount;
            for (int i = 0; i < proportion; i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Test cases
        String str1 = "aaabbccc";
        String str2 = "Hello, world!";
        String str3 = "1234567890";
        String str4 = "";
        String str5 = "a";
        String str6 = "aaa";

        // Expected results
        String expected1 = "aaabbbccc";
        String expected2 = "elod!hrw";
        String expected3 = "1234567890";
        String expected4 = "";
        String expected5 = "a";
        String expected6 = "aaa";

        // Test the program
        System.out.println(getCanonicalProportionalString(str1).equals(expected1)); // true
        System.out.println(getCanonicalProportionalString(str2).equals(expected2)); // true
        System.out.println(getCanonicalProportionalString(str3).equals(expected3)); // true
        System.out.println(getCanonicalProportionalString(str4).equals(expected4)); // true
        System.out.println(getCanonicalProportionalString(str5).equals(expected5)); // true
        System.out.println(getCanonicalProportionalString(str6).equals(expected6)); // true
    }
}
