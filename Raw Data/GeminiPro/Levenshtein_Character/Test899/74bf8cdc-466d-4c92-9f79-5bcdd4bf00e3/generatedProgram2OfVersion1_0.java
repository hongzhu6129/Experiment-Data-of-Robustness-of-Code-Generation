import java.util.HashMap;

public class FirstUniqueCharUnicode {
    // ... (main method remains the same)

    public static int first_Uniq_Char(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count character occurrences
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; 
    }
}
