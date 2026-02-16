import java.util.HashMap;
import java.util.Map;

public class FindFirstUniqueChar {

    public static void main(String[] args) {
        String str = "wresource";
        int index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);

        str = "aabbccddeeffg";
        index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);


        str = "loveleetcode";
        index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);
    }

    public static int first_Uniq_Char(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count character frequencies
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // This line should never be reached because the problem states there's always a unique character
        return -1; 
    }
}
