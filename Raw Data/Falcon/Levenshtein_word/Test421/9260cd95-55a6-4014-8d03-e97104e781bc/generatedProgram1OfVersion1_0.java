import java.util.HashMap;
import java.util.Map;

public class SecondNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "aabbbccdddeefff";
        char secondNonRepeatingCharacter = findSecondNonRepeatingCharacter(str);
        System.out.println("Second non-repeating character in '" + str + "' is '" + secondNonRepeatingCharacter + "'");
    }

    private static char findSecondNonRepeatingCharacter(String str) {
        Map<Character, Integer> characterCounts = new HashMap<>();

        // Count the occurrences of each character in the string
        for (char character : str.toCharArray()) {
            int count = characterCounts.getOrDefault(character, 0);
            characterCounts.put(character, count + 1);
        }

        // Iterate over the characters in the string again to find the second non-repeating character
        for (char character : str.toCharArray()) {
            int count = characterCounts.get(character);
            if (count == 1) {
                return character;
            }
        }

        // No second non-repeating character found
        return 0;
    }
}
