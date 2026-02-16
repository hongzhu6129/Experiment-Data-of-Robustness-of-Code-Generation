import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingAndRepeatingCharacters {

    public static void main(String[] args) {
        String input = "abcabcbb";
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        char firstNonRepeating = ' ';
        char firstRepeating = ' ';
        boolean nonRepeatingFound = false;
        boolean repeatingFound = false;

        for (char c : input.toCharArray()) {
            if (!nonRepeatingFound && charCountMap.get(c) == 1) {
                firstNonRepeating = c;
                nonRepeatingFound = true;
            } else if (!repeatingFound && charCountMap.get(c) > 1) {
                firstRepeating = c;
                repeatingFound = true;
            }

            if (nonRepeatingFound && repeatingFound) {
                break;
            }
        }

        System.out.println("First non-repeating character: " + firstNonRepeating);
        System.out.println("First repeating character: " + firstRepeating);
    }
}
