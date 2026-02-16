import java.util.HashSet;
import java.util.Set;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println(firstNonRepeatingCharacter(input)); // b

        String input2 = "bbbbbbbb";
        System.out.println(firstNonRepeatingCharacter(input2)); // null

        String input3 = "";
        System.out.println(firstNonRepeatingCharacter(input3)); // null
    }

    public static Character firstNonRepeatingCharacter(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }

        Set<Character> repeatingCharacters = new HashSet<>();
        Set<Character> nonRepeatingCharacters = new HashSet<>();

        char[] inputCharacters = input.toCharArray();
        for (char character : inputCharacters) {
            if (repeatingCharacters.contains(character)) {
                continue;
            }
            if (nonRepeatingCharacters.contains(character)) {
                nonRepeatingCharacters.remove(character);
                repeatingCharacters.add(character);
            } else {
                nonRepeatingCharacters.add(character);
            }
        }

        if (nonRepeatingCharacters.isEmpty()) {
            return null;
        }

        return nonRepeatingCharacters.iterator().next();
    }
}
