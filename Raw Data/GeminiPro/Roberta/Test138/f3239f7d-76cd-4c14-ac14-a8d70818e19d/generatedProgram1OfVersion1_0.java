import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(firstNonRepeatingChar(str));
    }

    static char firstNonRepeatingChar(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }
        return Character.MIN_VALUE;
    }
}
