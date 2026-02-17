import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

    public static void main(String[] args) {
        String inputString = "wresource";
        int firstUniqueIndex = first_Uniq_Char(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("First unique character of the above: " + firstUniqueIndex);


        inputString = "aabbccddeeffg"; // Example with a unique character later in the string
        firstUniqueIndex = first_Uniq_Char(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("First unique character of the above: " + firstUniqueIndex);

        inputString = "loveleetcode"; // Example provided by LeetCode
        firstUniqueIndex = first_Uniq_Char(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("First unique character of the above: " + firstUniqueIndex);


    }

    public static int first_Uniq_Char(String s) {
        Map<Character, Integer> charCounts = new HashMap<>();

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            if (charCounts.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // This line should not be reached given the problem constraints,
        // but we include it for completeness
        return -1; 
    }
}
