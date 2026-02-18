import java.util.*;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(firstNonRepeatingCharacter(str)); // b

        str = "google";
        System.out.println(firstNonRepeatingCharacter(str)); // g

        str = "zzzzzzzz";
        System.out.println(firstNonRepeatingCharacter(str)); // null

        str = "";
        System.out.println(firstNonRepeatingCharacter(str)); // null
    }

    public static Character firstNonRepeatingCharacter(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }

        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }

        return null;
    }
}
