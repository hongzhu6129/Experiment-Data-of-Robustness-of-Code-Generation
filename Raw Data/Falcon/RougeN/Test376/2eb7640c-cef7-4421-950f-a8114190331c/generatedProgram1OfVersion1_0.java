import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatingCharacter {

    public static int findFirstRepeatingCharacter(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }

        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charMap.containsKey(c)) {
                return i;
            } else {
                charMap.put(c, i);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String str1 = "abcdefghij";
        int result1 = findFirstRepeatingCharacter(str1);
        System.out.println(result1); // Output: -1

        String str2 = "abcabcbb";
        int result2 = findFirstRepeatingCharacter(str2);
        System.out.println(result2); // Output: 2

        String str3 = "";
        int result3 = findFirstRepeatingCharacter(str3);
        System.out.println(result3); // Output: -1

        String str4 = "aaaa";
        int result4 = findFirstRepeatingCharacter(str4);
        System.out.println(result4); // Output: 1
    }
}
