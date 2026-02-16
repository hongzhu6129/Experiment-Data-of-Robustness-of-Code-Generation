import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        String str = "wresource";
        int index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);


        // Additional test cases
        System.out.println("Original String: " + "leetcode");
        System.out.println("First unique character of the above: " + first_Uniq_Char("leetcode"));

        System.out.println("Original String: " + "loveleetcode");
        System.out.println("First unique character of the above: " + first_Uniq_Char("loveleetcode"));

        System.out.println("Original String: " + "aabb");
        System.out.println("First unique character of the above: " + first_Uniq_Char("aabb")); // Should be -1


    }

    public static int first_Uniq_Char(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // Return -1 if no unique character is found
    }
}
