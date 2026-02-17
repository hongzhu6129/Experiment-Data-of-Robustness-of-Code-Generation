import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {
        String input = "Hello World!";
        String result = removeDuplicateCharacters(input);
        System.out.println(result); // Output: "Helo Wrd!"
    }

    public static String removeDuplicateCharacters(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        Set<Character> uniqueCharacters = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char character : input.toCharArray()) {
            if (uniqueCharacters.add(character)) {
                result.append(character);
            }
        }

        return result.toString();
    }
}
